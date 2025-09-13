package com.example.lab04

import android.media.Image
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab04.ui.theme.Lab04Theme
import kotlinx.coroutines.delay
import com.example.lab04.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab04Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
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

    MyColumn()

}

@Composable
fun MyColumn() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Spacer(modifier = Modifier.size(40.dp))
        Text("Esto es una prueba columna")
        Spacer(modifier = Modifier.size(16.dp))
        MyIcon()
        MyImage()
    }
}
@Composable
fun MyIcon(){
    Row {
        Icon(
            imageVector = Icons.Default.AccountCircle,
            contentDescription = "Incono prueba"
        )
        Text("Icono de prueba")
    }
}

@Composable
fun MyImage(){
    Spacer(modifier = Modifier.size(20.dp))
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_foreground),
        contentDescription = "imagen ejemplo",
        modifier = Modifier.size(120.dp).background(Color.Green)

    )

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Lab04Theme {
        Greeting("Android")
    }
}
