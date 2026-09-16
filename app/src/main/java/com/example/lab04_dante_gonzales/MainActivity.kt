package com.example.lab04_dante_gonzales

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab04_dante_gonzales.ui.theme.LAB04Dante_GonzalesTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Switch
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.material3.Slider
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            LAB04Dante_GonzalesTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->

                    Greeting(
                        name = "Dante Gonzales",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    var checked by remember { mutableStateOf(false) }
    var sliderValue by remember { mutableStateOf(0f) }

    Card(
        modifier = modifier.padding(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "Hola, $name")

            Switch(
                checked = checked,
                onCheckedChange = { checked = it }
            )

            Slider(
                value = sliderValue,
                onValueChange = { sliderValue = it }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LAB04Dante_GonzalesTheme {
        Greeting(name = "Dante Gonzales")
    }
}
