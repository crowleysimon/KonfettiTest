package com.example.konfetti

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class KonfettiTest {

    @get:Rule
    val rule = createComposeRule()

    @Test
    fun testViewItem() {
        rule.setContent { KonfettiViewItem(confetti = rain()) }
        rule.onNodeWithTag("Konfetti").assertExists()
    }

    @Test
    fun testComposeItem() {
        rule.setContent { KonfettiComposeItem(confetti = rain()) }
        rule.onNodeWithTag("Konfetti").assertExists()
    }

    @Test
    fun testComposeWithNoConfetti() {
        rule.setContent { KonfettiComposeItem(confetti = emptyList()) }
        rule.onNodeWithTag("Konfetti").assertExists()
    }
}