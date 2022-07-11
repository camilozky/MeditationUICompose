package com.example.meditationuiapp.milo.meditationui.presentation.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.meditationuiapp.milo.meditationui.data.local.features
import com.example.meditationuiapp.ui.theme.MeditationUIComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MeditationUIComposeTheme {
                HomeScreen(features)
            }
        }
    }
}
