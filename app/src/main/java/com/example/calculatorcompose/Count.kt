package com.example.calculatorcompose

fun calculateExpression(expression: String): String {
    val tokens = mutableListOf<String>()
    var numberBuffer = ""
    for (char in expression) {
        if (char.isDigit() || char == '.') {
            numberBuffer += char
        } else if (char in listOf(PLUS, MINUS, DIVIDER, MULTIPLIER, PERCENT)) {
            if (numberBuffer.isNotEmpty()) {
                tokens.add(numberBuffer)
                numberBuffer = ""
            }
            tokens.add(char.toString())
        }
    }
    if (numberBuffer.isNotEmpty()) {
        tokens.add(numberBuffer)
    }
    var result = tokens[0].toDouble()
    var i = 1
    while (i < tokens.size) {
        val operator = tokens[i]
        val nextNumber = tokens[i + 1].toDouble()

        when (operator) {
            PLUS.toString() -> result += nextNumber
            MINUS.toString() -> result -= nextNumber
            MULTIPLIER.toString() -> result *= nextNumber
            DIVIDER.toString() -> result /= nextNumber
            PERCENT.toString() -> result = result * nextNumber / 100
        }
        i += 2
    }
    return if (result.toString().endsWith(".0")) {
        result.toString().dropLast(2)
    } else {
        result.toString()
    }
}