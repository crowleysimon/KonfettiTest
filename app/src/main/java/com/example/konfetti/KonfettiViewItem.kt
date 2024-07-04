package com.example.konfetti

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import nl.dionsegijn.konfetti.core.Party
import nl.dionsegijn.konfetti.xml.KonfettiView

@Composable
fun KonfettiViewItem(
    confetti: List<Party>,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(150.dp)
    ) {
        AndroidView(
            modifier = Modifier
                .fillMaxSize()
                .testTag("Konfetti"),
            factory = { context -> KonfettiView(context).apply { start(confetti) } })
    }
}