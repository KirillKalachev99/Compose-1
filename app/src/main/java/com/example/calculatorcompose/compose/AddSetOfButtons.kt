package com.example.calculatorcompose.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculatorcompose.DIVIDER
import com.example.calculatorcompose.EQUALS
import com.example.calculatorcompose.MATH
import com.example.calculatorcompose.MINUS
import com.example.calculatorcompose.MULTIPLIER
import com.example.calculatorcompose.PERCENT
import com.example.calculatorcompose.PLUS
import com.example.calculatorcompose.R

@Composable
@Preview
fun SetOfButtons() {
    val countText = remember { mutableStateOf("") }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .width(270.dp)
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
                .weight(1f),
            contentAlignment = Alignment.BottomEnd
        ) {
            if (countText.value.isEmpty()) {
                Text("0", fontSize = 40.sp)
            } else {
                Text(countText.value, fontSize = 40.sp)
            }
        }
        Column(
            modifier = Modifier.weight(1f),
            Arrangement.Center, Alignment.CenterHorizontally
        ) {
            Row {
                IconButton(
                    modifier = Modifier
                        .width(70.dp)
                        .height(60.dp)
                        .padding(start = 15.dp),
                    onClick = { countText.value = countText.value.dropLast(1) },
                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = R.drawable.baseline_arrow_back_24),
                        contentDescription = ""
                    )
                }
                AddButton(PLUS.toString(), countText)
                AddButton(MINUS.toString(), countText)
                AddButton(MULTIPLIER.toString(), countText)
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row {
                AddRow("1", "2", "3", DIVIDER.toString(), countText)
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row {
                AddRow("4", "5", "6", PERCENT.toString(), countText)
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row {
                AddRow("7", "8", "9", "()", countText)
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row {
                AddRow(".", "0", EQUALS.toString(), "C", countText)
            }
        }
    }
    MATH = countText.value
}