package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

fun setOperation(op: twoOperandOperation) {
    op.setOperator();
}
fun setOperation(op: oneOperandOperation) {
    op.setOperator();
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)//set content to be layout
        btnPlus.setOnClickListener {
            setOperation(Add(etNumA, etNumB, tvResult));
            /*var op = Add(etNumA, etNumB, tvResult);
            op.setOperator();*/
        }
        btnMinus.setOnClickListener {
            setOperation(Subtract(etNumA, etNumB, tvResult));
            /*var op = Subtract(etNumA, etNumB, tvResult);
            op.setOperator();*/
        }
        btnMultiply.setOnClickListener {
            setOperation(Multiply(etNumA, etNumB, tvResult));
            /*var op = Multiply(etNumA, etNumB, tvResult);
            op.setOperator();*/
        }
        btnDivide.setOnClickListener {
            setOperation(Divide(etNumA, etNumB, tvResult));
            /*var op = Divide(etNumA, etNumB, tvResult);
            op.setOperator();*/
        }
        //one operand operations
        //Log10, Ln, Exp, Cos, Sin, Tan, ArcCos, ArcSin, ArcTan
        btnLog10.setOnClickListener {
            setOperation(Log10(etNumA, tvResult));
            /*var op = Log10(etNumA, tvResult);
            op.setOperator();*/
        }
        btnLn.setOnClickListener {
            setOperation(Ln(etNumA, tvResult));
            /*var op = Ln(etNumA, tvResult);
            op.setOperator();*/
        }
        btnExp.setOnClickListener {
            setOperation(Exp(etNumA, tvResult));
            /*var op = Exp(etNumA, tvResult);
            op.setOperator();*/
        }
        btnCos.setOnClickListener {
            setOperation(Log10(etNumA, tvResult));
            /*var op = Cos(etNumA, tvResult);
            op.setOperator();*/
        }
        btnSin.setOnClickListener {
            setOperation(Sin(etNumA, tvResult));
        }
        btnTan.setOnClickListener {
            setOperation(Tan(etNumA, tvResult));
        }
        btnArcCos.setOnClickListener {
            setOperation(ArcCos(etNumA, tvResult));
        }
        btnArcSin.setOnClickListener {
            setOperation(ArcSin(etNumA, tvResult));
        }
        btnArcTan.setOnClickListener {
            setOperation(ArcTan(etNumA, tvResult));
        }
    }
}
