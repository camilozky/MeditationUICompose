package com.example.meditationuiapp.milo.meditationui.data.local

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import com.example.meditationuiapp.ui.theme.Beige1
import com.example.meditationuiapp.ui.theme.Beige2
import com.example.meditationuiapp.ui.theme.Beige3
import com.example.meditationuiapp.ui.theme.BlueViolet1
import com.example.meditationuiapp.ui.theme.BlueViolet2
import com.example.meditationuiapp.ui.theme.BlueViolet3
import com.example.meditationuiapp.ui.theme.LightGreen1
import com.example.meditationuiapp.ui.theme.LightGreen2
import com.example.meditationuiapp.ui.theme.LightGreen3
import com.example.meditationuiapp.ui.theme.OrangeYellow1
import com.example.meditationuiapp.ui.theme.OrangeYellow2
import com.example.meditationuiapp.ui.theme.OrangeYellow3
import com.example.meditationuicompose.R

data class Feature(
    val title: String,
    @DrawableRes val iconId: Int,
    val lightColor: Color,
    val mediumColor: Color,
    val darkColor: Color
)

val features = listOf(
    Feature(
        title = "Sleep meditation",
        R.drawable.ic_bubble,
        BlueViolet1,
        BlueViolet2,
        BlueViolet3
    ),
    Feature(
        title = "Tips for sleeping",
        R.drawable.ic_videocam,
        LightGreen1,
        LightGreen2,
        LightGreen3
    ),
    Feature(
        title = "Night island",
        R.drawable.ic_moon,
        OrangeYellow1,
        OrangeYellow2,
        OrangeYellow3
    ),
    Feature(
        title = "Calming sounds",
        R.drawable.ic_music,
        Beige1,
        Beige2,
        Beige3
    )
)