package com.example.must_know_compose.side_effects

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun LaunchedEffectExample(

) {
    val host = remember {
        SnackbarHostState()
    }
    var isError by remember {

        mutableStateOf(false)
    }

    if (isError) {
        LaunchedEffect(host) {
            host.showSnackbar(
                "Oops An Error Happened",
                actionLabel = "Retry "
            )

        }

    }

    Scaffold(snackbarHost = {
        SnackbarHost(hostState = host)
    }) {

        Column(
            modifier = Modifier.padding(it)
        ) {

            Button(onClick = {
                isError = true
            }) {

                Text(text = "Show snack bar with launched effect ")
            }
        }
    }

}