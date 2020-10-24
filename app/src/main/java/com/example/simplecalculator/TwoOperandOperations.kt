package com.example.simplecalculator

import android.widget.EditText
import android.widget.TextView

open class twoOperandOperation {
    var a : Int
    var b : Int
    var tvResult : TextView
    constructor(etNumA: EditText, etNumB: EditText, tvResult: TextView) {
        this.a = etNumA.text.toString().toInt()
        this.b = etNumB.text.toString().toInt()
        this.tvResult = tvResult
    }
    fun setOperator() {
        this.tvResult.text = operation(a, b)
    }
    open fun operation(a : Int, b : Int): String {
        return "0"
    }
}
class Add(etNumA: EditText, etNumB: EditText, tvResult: TextView) : twoOperandOperation(etNumA, etNumB, tvResult) {
    override fun operation(a: Int, b : Int) :String {
        return "${a+b}"
    }
}
class Subtract(etNumA: EditText, etNumB: EditText, tvResult: TextView) : twoOperandOperation(etNumA, etNumB, tvResult) {
    override fun operation(a: Int, b : Int) :String {
        return "${a-b}"
    }
}
class Multiply(etNumA: EditText, etNumB: EditText, tvResult: TextView) : twoOperandOperation(etNumA, etNumB, tvResult) {
    override fun operation(a: Int, b : Int) :String {
        return "${a*b}"
    }
}
class Divide(etNumA: EditText, etNumB: EditText, tvResult: TextView) : twoOperandOperation(etNumA, etNumB, tvResult) {
    override fun operation(a: Int, b : Int) :String {
        return "${a/b}"
    }
}