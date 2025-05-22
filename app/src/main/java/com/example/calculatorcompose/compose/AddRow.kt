package com.example.calculatorcompose.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState

@Composable
fun AddRow(
    text1: String,
    text2: String,
    text3: String,
    text4: String,
    countText: MutableState<String>
) {
    AddButton(text1, countText)
    AddButton(text2, countText)
    AddButton(text3, countText)
    AddButton(text4, countText)
}