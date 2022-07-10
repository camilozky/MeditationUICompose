package com.example.meditationuicompose.ui.theme

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.meditationuicompose.R

@Preview
@Composable
fun HomeScreen() {
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
            color = LightRed,
            iconResId = R.drawable.ic_play
        )
    }
}

@Composable
fun GenericSection(
    headerText: String = "Good morning",
    name: String = "Milo",
    primaryBodyText: String = "We wish you have a good day!",
    color: Color = DeepBlue,
    @DrawableRes iconResId: Int = R.drawable.ic_search,
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(15.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(color)
            .padding(horizontal = 15.dp, vertical = 20.dp)
            .fillMaxWidth()
    ) {
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "$headerText $name",
                style = MaterialTheme.typography.h2
            )
            Text(
                text = primaryBodyText,
                style = MaterialTheme.typography.body1
            )
        }
        Icon(
            painter = painterResource(id = iconResId),
            contentDescription = "Search",
            tint = Color.White,
            modifier = Modifier.size(24.dp)
        )
    }
}

@Composable
fun ChipSection(
    chips: List<String>
) {
    var selectedChipIndex by remember {
        mutableStateOf(0)
    }
    LazyRow {
        items(chips.size) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(start = 15.dp, top = 15.dp, bottom = 15.dp)
                    .clickable {
                        selectedChipIndex = it
                    }
                    .clip(RoundedCornerShape(10.dp))
                    .background(
                        if (selectedChipIndex == it) ButtonBlue
                        else DarkerButtonBlue
                    )
                    .padding(15.dp)
            ) {
                Text(text = chips[it], color = TextWhite)
            }
        }
    }
}
