package com.example.aula_0305

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aula_0305.ui.theme.Aula0305Theme
import com.example.aula_0305.ui.theme.DebugButtonColors
import com.example.aula_0305.ui.theme.ErrorsButtonColors
import com.example.aula_0305.ui.theme.InfoButtonColors
import com.example.aula_0305.ui.theme.WarningButtonColors


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Aula0305Theme {
                // A surface container using the 'background' color from the theme
                App()
            }
        }
    }
}


@Composable
private fun App(){
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
    ) {
        Column (
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally

        ){
            
            ActionButton(text = "Debug", buttonColors = DebugButtonColors(), modifier =  Modifier.fillMaxWidth(0.5f)) {
                Log.d(TAG, "Debug")
            }
            ActionButton(text = "Warning", buttonColors = WarningButtonColors(), modifier =  Modifier.fillMaxWidth(0.5f)) {
                Log.i(TAG, "Warning")
            }
            ActionButton(text = "Info", buttonColors = InfoButtonColors(), modifier =  Modifier.fillMaxWidth(0.5f)) {
                Log.w(TAG, "Info")
            }
            ActionButton(text = "Errors", buttonColors = ErrorsButtonColors(), modifier =  Modifier.fillMaxWidth(0.5f)) {
                Log.e(TAG, "Errors")
            }

        }
    }
}

@Composable
fun ActionButton(
    text: String,
    buttonColors: ButtonColors = ButtonDefaults.buttonColors(),
    modifier: Modifier = Modifier,
    block: () -> Unit
){
    ElevatedButton(onClick = block, shape = RoundedCornerShape(5.dp), colors = buttonColors, modifier = modifier) {
    Text(text = text)
    }
}

