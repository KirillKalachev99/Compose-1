package com.example.calculatorcompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontVariation.weight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculatorcompose.ui.theme.CalculatorComposeTheme

var MATH = ""

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Column(verticalArrangement = Arrangement.Center) { SetOfButtons() }
        }
    }
}

@Composable
@Preview
fun SetOfButtons() {
    val countText = remember { mutableStateOf("") }
    val textForAdding = remember { mutableStateOf("") }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
                .weight(1f)
                .offset((-70).dp),
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
                    modifier = Modifier.size(60.dp),
                    onClick = { countText.value = countText.value.dropLast(1) },
                ) {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = R.drawable.baseline_arrow_back_24),
                        contentDescription = ""
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(modifier = Modifier.size(60.dp),
                    shape = RoundedCornerShape(15.dp),
                    onClick = {
                        countText.value += "+"
                        textForAdding.value = "+"
                    }) {
                    Text("+", fontSize = 25.sp)
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(modifier = Modifier.size(60.dp),
                    shape = RoundedCornerShape(15.dp),
                    onClick = { countText.value += "-" }) {
                    Text("-", fontSize = 25.sp)
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(modifier = Modifier.size(60.dp),
                    shape = RoundedCornerShape(15.dp),
                    onClick = { countText.value += "*" }) {
                    Text("*", fontSize = 25.sp)
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row {
                Button(modifier = Modifier.size(60.dp),
                    shape = RoundedCornerShape(15.dp),
                    onClick = { countText.value += "1" }) {
                    Text("1", fontSize = 25.sp)
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(modifier = Modifier.size(60.dp),
                    shape = RoundedCornerShape(15.dp),
                    onClick = { countText.value += "2" }) {
                    Text("2", fontSize = 25.sp)
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(modifier = Modifier.size(60.dp),
                    shape = RoundedCornerShape(15.dp),
                    onClick = { countText.value += "3" }) {
                    Text("3", fontSize = 25.sp)
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(modifier = Modifier.size(60.dp),
                    shape = RoundedCornerShape(15.dp),
                    onClick = { countText.value += "/" }) {
                    Text("/", fontSize = 25.sp)
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row {
                Button(modifier = Modifier.size(60.dp),
                    shape = RoundedCornerShape(15.dp),
                    onClick = { countText.value += "4" }) {
                    Text("4", fontSize = 25.sp)
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(modifier = Modifier.size(60.dp),
                    shape = RoundedCornerShape(15.dp),
                    onClick = { countText.value += "5" }) {
                    Text("5", fontSize = 25.sp)
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(modifier = Modifier.size(60.dp),
                    shape = RoundedCornerShape(15.dp),
                    onClick = { countText.value += "6" }) {
                    Text("6", fontSize = 25.sp)
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(modifier = Modifier.size(60.dp),
                    shape = RoundedCornerShape(15.dp),
                    onClick = { countText.value += "%" }) {
                    Text("%", fontSize = 25.sp)
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row {
                Button(modifier = Modifier.size(60.dp),
                    shape = RoundedCornerShape(15.dp),
                    onClick = { countText.value += "7" }) {
                    Text("7", fontSize = 25.sp)
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(modifier = Modifier.size(60.dp),
                    shape = RoundedCornerShape(15.dp),
                    onClick = { countText.value += "8" }) {
                    Text("8", fontSize = 25.sp)
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(modifier = Modifier.size(60.dp),
                    shape = RoundedCornerShape(15.dp),
                    onClick = { countText.value += "9" }) {
                    Text("9", fontSize = 25.sp)
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(modifier = Modifier.size(60.dp),
                    shape = RoundedCornerShape(15.dp),
                    onClick = { countText.value += ")" }) {
                    Text(")", fontSize = 25.sp)
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row {
                Button(modifier = Modifier.size(60.dp),
                    shape = RoundedCornerShape(15.dp),
                    onClick = { countText.value += "." }) {
                    Text(".", fontSize = 25.sp)
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(modifier = Modifier.size(60.dp),
                    shape = RoundedCornerShape(15.dp),
                    onClick = { countText.value += "0" }) {
                    Text("0", fontSize = 25.sp)
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(modifier = Modifier.size(60.dp),
                    shape = RoundedCornerShape(15.dp),
                    onClick = { countText.value += "=" }) {
                    Text("=", fontSize = 25.sp)
                }
                Spacer(modifier = Modifier.width(10.dp))
                Button(modifier = Modifier.size(60.dp),
                    shape = RoundedCornerShape(15.dp),
                    onClick = {
                        countText.value = "("
                    }) {
                    Text("(", fontSize = 25.sp)
                }
            }
        }
    }
    MATH = countText.value
}

fun count(): String {
        var count = ""
        var delimArray = arrayOf(MATH.split('+', '-', '/', '*', '%'))
        count = delimArray[0].toString()
    return count
}


