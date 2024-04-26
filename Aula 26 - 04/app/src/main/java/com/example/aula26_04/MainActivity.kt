package com.example.aula26_04

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.aula26_04.ui.theme.Aula2604Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Aula2604Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   registrar()
                }
            }
        }
    }
}

@Composable
fun registrar() {
    var nome by remember {
        mutableStateOf("")
    }
    var bairro by remember {
        mutableStateOf("")
    }
    var cep by remember {
        mutableStateOf("")
    }
    var cidade by remember {
        mutableStateOf("")
    }
    var estado by remember {
        mutableStateOf("")
    }

    Column(
        Modifier.fillMaxSize()
    ){
        Row(
            Modifier.fillMaxWidth(),
            Arrangement.Center) { Text(text = "App cadastro", fontSize = 20.sp) }

        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp)
        )



        Row(
            Modifier.fillMaxWidth(),
            Arrangement.Center) {
            TextField(value = nome, onValueChange = {novovalor -> nome = novovalor }, label = { Text("Digite o seu nome")} )
        }
        Row(
            Modifier.fillMaxWidth(),
            Arrangement.Center) {
            TextField(value = bairro, onValueChange = {novovalor -> bairro = novovalor }, label = { Text("Digite o seu bairro")} )
        }
        Row(
            Modifier.fillMaxWidth(),
            Arrangement.Center) {
            TextField(value = cep, onValueChange = {novovalor -> cep = novovalor }, label = { Text("Digite o seu cep")} )
        }
        Row(
            Modifier.fillMaxWidth(),
            Arrangement.Center) {
            TextField(value = cidade, onValueChange = {novovalor -> cidade = novovalor }, label = { Text("Digite o seu cidade")} )
        }
        Row(
            Modifier.fillMaxWidth(),
            Arrangement.Center) {
            TextField(value = estado, onValueChange = {novovalor -> estado = novovalor }, label = { Text("Digite o seu estado")} )
        }
        Spacer(modifier = Modifier.height(16.dp))

        Row(
            Modifier.fillMaxWidth(),
            Arrangement.Center) {
            
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Cadastrar")
            }
            
        }


    }
}