package com.example.konfetti

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Column(verticalArrangement = spacedBy(16.dp)) {
                    KonfettiComposeItem(confetti = rain())
                    KonfettiViewItem(confetti = rain())
                    KonfettiComposeItem(confetti = parade())
                }
            }
        }
    }
}