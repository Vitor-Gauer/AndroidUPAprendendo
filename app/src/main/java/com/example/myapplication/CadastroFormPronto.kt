package com.example.myapplication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Form(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        shape = RoundedCornerShape(10.dp),
        color = Color(216,216,14)
        // modifier = Modifier.fillMaxWidth().width(10.dp) 10% da width
    ){
        Column(
            modifier = Modifier.padding(20.dp,40.dp,0.dp,0.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("CADASTRO")
            var textoDigitado by rememberSaveable { mutableStateOf("") }

            Spacer(modifier = Modifier.height(15.dp))

            TextField(
                value = textoDigitado,
                onValueChange = {
                        novoTexto -> textoDigitado = novoTexto
                }, label = { Text("Digite seu nome")}
            )

            Spacer(modifier = Modifier.height(15.dp))

            TextField(
                value = textoDigitado,
                onValueChange = {
                        novoTexto -> textoDigitado = novoTexto
                }, label = { Text("Digite seu nome")}
            )

            Spacer(modifier = Modifier.height(15.dp))

            TextField(
                value = textoDigitado,
                onValueChange = {
                        novoTexto -> textoDigitado = novoTexto
                }, label = { Text("Digite seu nome")}
            )

            Button(onClick = {} ){
                Text("ENVIAR")
            }
        }
    }
}