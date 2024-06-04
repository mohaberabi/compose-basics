package com.example.must_know_compose.composition_local

import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class Elevations(
    val card: Dp = 0.dp, val default: Dp = 0.dp
)

val LocalElevations = compositionLocalOf {
    Elevations()
}