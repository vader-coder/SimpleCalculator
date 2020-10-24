package com.example.simplecalculator
import android.widget.EditText
import android.widget.TextView
import kotlin.math.ln

open class oneOperandOperation {
    var a : Double
    var tvResult : TextView
    constructor(etNumA: EditText, tvResult: TextView) {
        this.a = etNumA.text.toString().toDouble()
        this.tvResult = tvResult
    }
    fun setOperator() {
        this.tvResult.text = operation(a)
    }
    open fun operation(a : Double): String {
        return "0"
    }
}
class Log10(etNumA: EditText, tvResult: TextView) : oneOperandOperation(etNumA, tvResult) {
    override fun operation(a: Double) :String {
        return "${Math.log10(a)}"
    }
}
class Ln(etNumA: EditText, tvResult: TextView) : oneOperandOperation(etNumA, tvResult) {
    override fun operation(a: Double) :String {
        return "${ln(a)}"
    }
}
class Exp(etNumA: EditText, tvResult: TextView) : oneOperandOperation(etNumA, tvResult) {
    override fun operation(a: Double) :String {
        return "${Math.exp(a)}"
    }
}
class Sin(etNumA: EditText, tvResult: TextView) : oneOperandOperation(etNumA, tvResult) {
    override fun operation(a: Double) :String {
        return "${Math.sin(a)}"
    }
}
class Cos(etNumA: EditText, tvResult: TextView) : oneOperandOperation(etNumA, tvResult) {
    override fun operation(a: Double) :String {
        return "${Math.log10(a)}"
    }
}
class Tan(etNumA: EditText, tvResult: TextView) : oneOperandOperation(etNumA, tvResult) {
    override fun operation(a: Double) :String {
        return "${Math.tan(a)}"
    }
}
class ArcCos(etNumA: EditText, tvResult: TextView) : oneOperandOperation(etNumA, tvResult) {
    override fun operation(a: Double) :String {
        return "${Math.acos(a)}"
    }
}
class ArcSin(etNumA: EditText, tvResult: TextView) : oneOperandOperation(etNumA, tvResult) {
    override fun operation(a: Double) :String {
        return "${Math.asin(a)}"
    }
}
class ArcTan(etNumA: EditText, tvResult: TextView) : oneOperandOperation(etNumA, tvResult) {
    override fun operation(a: Double) :String {
        return "${Math.atan(a)}"
    }
}