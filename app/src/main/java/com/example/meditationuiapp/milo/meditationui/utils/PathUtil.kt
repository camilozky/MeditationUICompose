package com.example.meditationuiapp.milo.meditationui.utils

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import kotlin.math.abs

fun Path.standardQuadFromTo(from: Offset, to: Offset) {
    quadraticBezierTo(
        from.x,
        from.y,
        abs(from.x + to.x) / 2f,
        abs(from.y + to.y) / 2f
    )
}

@Composable
fun DrawPathCanvas(
    mediumColoredPath: Path,
    mediumColor: Color,
    lightColoredPath: Path,
    lightColor: Color
) {
    Canvas(
        modifier = Modifier
            .fillMaxSize()
    ) {
        drawPath(
            path = mediumColoredPath,
            color = mediumColor
        )
        drawPath(
            path = lightColoredPath,
            color = lightColor
        )
    }
}