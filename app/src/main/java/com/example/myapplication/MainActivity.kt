package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                primeiraTela()
                Form()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}


@Preview
@Composable
fun primeiraTela(){
    Column(
        modifier = Modifier
        .fillMaxSize()
        .padding(32.dp)
    ) {

        Text("Ola Mundo!")
        var i=0
        Button(
            onClick = {
                i+=1
                Log.d("btn","APERTOU $i vezes")
            }
        ) {
            Text("Aperte Aqui")
        }
    }

}

@Composable
fun Form(){
    Column() {
        Text("CADASTRO")
        var textoDigitado by rememberSaveable { mutableStateOf("") }

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