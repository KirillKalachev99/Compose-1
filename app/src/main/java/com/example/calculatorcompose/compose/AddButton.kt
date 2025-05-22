package com.example.calculatorcompose.compose

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculatorcompose.MATH
import com.example.calculatorcompose.calculateExpression

@Composable
fun AddButton(text: String, countText: MutableState<String>) {
    Spacer(modifier = Modifier.width(10.dp))
    when (text) {
        "()" -> Button(
            modifier = Modifier.size(60.dp),
            shape = RoundedCornerShape(15.dp),
            onClick = { countText.value += text }) {
            Text(text, fontSize = 17.sp, textAlign = TextAlign.Center)
        }

        "C" -> Button(
            modifier = Modifier.size(60.dp),
            shape = RoundedCornerShape(15.dp),
            onClick = { countText.value = "" }) {
            Text(text, fontSize = 25.sp, textAlign = TextAlign.Center)
        }

        "=" -> Button(
            modifier = Modifier.size(60.dp),
            shape = RoundedCornerShape(15.dp),
            onClick = {
                countText.value = calculateExpression(MATH)
            }) {
            Text(text, fontSize = 25.sp, textAlign = TextAlign.Center)
        }

        else -> Button(
            modifier = Modifier.size(60.dp),
            shape = RoundedCornerShape(15.dp),
            onClick = { countText.value += text }) {
            Text(text, fontSize = 25.sp, textAlign = TextAlign.Center)
        }
    }
}