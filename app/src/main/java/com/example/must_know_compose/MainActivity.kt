package com.example.must_know_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.must_know_compose.composition_local.Elevations
import com.example.must_know_compose.composition_local.LocalElevations
import com.example.must_know_compose.side_effects.LaunchedEffectExample
import com.example.must_know_compose.side_effects.RememeberCoroutineScopeExample
import com.example.must_know_compose.ui.theme.MustKnowComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val snackbarHostState = remember { SnackbarHostState() }


            val elevations = if (isSystemInDarkTheme()) {
                Elevations(card = 1.dp, default = 1.dp)
            } else {
                Elevations(card = 0.dp, default = 0.dp)

            }

            CompositionLocalProvider(
                LocalElevations provides elevations
            ) {
                MustKnowComposeTheme {

                    LaunchedEffectExample()
                }
            }

        }
    }
}

