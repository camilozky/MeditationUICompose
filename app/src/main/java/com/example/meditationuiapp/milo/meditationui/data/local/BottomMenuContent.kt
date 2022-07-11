package com.example.meditationuiapp.milo.meditationui.data.local

import androidx.annotation.DrawableRes
import com.example.meditationuicompose.R

data class BottomMenuContent(
    val title: String,
    @DrawableRes val iconId: Int
)

val items = listOf(
    BottomMenuContent("Home", R.drawable.ic_home),
    BottomMenuContent("Meditate", R.drawable.ic_bubble),
    BottomMenuContent("Sleep", R.drawable.ic_moon),
    BottomMenuContent("Music", R.drawable.ic_music),
    BottomMenuContent("Profile", R.drawable.ic_profile),
)
