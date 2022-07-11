package com.example.meditationuiapp.milo.meditationui.presentation.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.meditationuiapp.milo.meditationui.data.local.features
import com.example.meditationuiapp.milo.meditationui.data.local.items
import com.example.meditationuiapp.ui.theme.DeepBlue
import com.example.meditationuiapp.ui.theme.LightRed
import com.example.meditationuiapp.ui.theme.TextWhite
import com.example.meditationuicompose.R

@OptIn(ExperimentalFoundationApi::class)
@Preview
@Composable
fun HomeScreen(
) {
    Box(
        modifier = Modifier
            .background(DeepBlue)
            .fillMaxSize()
    )
    {
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
        BottomMenu(
            items,
            modifier = Modifier.align(Alignment.BottomCenter)
        )
    }
}
