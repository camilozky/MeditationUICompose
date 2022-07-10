package com.example.meditationuicompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.meditationuicompose.ui.theme.HomeScreen
import com.example.meditationuicompose.ui.theme.MeditationUIComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationUIComposeTheme {
                HomeScreen()
            }
        }
    }
}
