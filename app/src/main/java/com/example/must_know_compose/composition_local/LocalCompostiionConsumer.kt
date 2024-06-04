package com.example.must_know_compose.composition_local

import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


@Composable
fun AppCard() {

    val elevations = LocalElevations.current
    Card(
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = elevations.card
        )
    ) {
        Text(text = "CARD")
    }
}