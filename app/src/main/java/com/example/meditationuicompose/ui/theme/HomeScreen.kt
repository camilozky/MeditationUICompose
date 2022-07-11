package com.example.meditationuicompose.ui.theme

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.meditationuicompose.R

@OptIn(ExperimentalFoundationApi::class)
@Preview
@Composable
fun HomeScreen(
    features: List<Feature> = listOf()
) {
    Box(
        modifier = Modifier
            .background(DeepBlue)
            .fillMaxSize()
    )
    Column {
        GenericSection()
        ChipSection(chips = listOf("Sweet sleep", "Insomnia", "Depression"))
        GenericSection(
            headerText = "Daily Thought",
            name = "",
            primaryBodyText = "Meditation • 3-10 min",
            backgroundColor = LightRed,
            iconResId = R.drawable.ic_play,
            textColor = TextWhite
        )
        FeatureSection(features)
    }
}
