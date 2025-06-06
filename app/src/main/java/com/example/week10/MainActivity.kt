package com.example.week10

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.week10.example05.NotificationApp
import com.example.week10.example06.NotificationMainScreen
import com.example.week10.example06.NotificationNavGraph
import com.example.week10.ui.theme.Week10Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Week10Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    NotificationMainScreen()
                    NotificationNavGraph()
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
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Week10Theme {
        Greeting("Android")
    }
}