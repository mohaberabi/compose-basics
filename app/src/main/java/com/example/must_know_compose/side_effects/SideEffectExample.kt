package com.example.must_know_compose.side_effects

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.remember


class CardioLogger {
    fun setCardio(cardio: Int) {
        Log.i("cardio", cardio.toString())
    }
}


@Composable

fun CardioDoneCompose(): CardioLogger {
    val cardio = remember {
        CardioLogger()
    }
    SideEffect {
        cardio.setCardio(11)
    }
    return cardio
}