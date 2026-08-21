package com.example.myapplication

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

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