package com.example.myapplication

import android.view.Surface
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Integrante1(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        shape = RoundedCornerShape(10.dp),
        color = Color(140,216,14)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Text("AI BOA")
        }
    }
}

@Composable
fun Integrante2(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        shape = RoundedCornerShape(10.dp),
        color = Color(216,140,14)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Text("ETA")
        }
    }
}

@Composable
fun Integrante3(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        shape = RoundedCornerShape(10.dp),
        color = Color(216,14,140)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Text("Joselito d'Silva Sahur")
        }
    }
}

@Composable
fun Integrante4(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        shape = RoundedCornerShape(10.dp),
        color = Color(140,14,216)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Text("GiorgioNovo")
        }
    }
}