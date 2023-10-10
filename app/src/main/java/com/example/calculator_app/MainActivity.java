package com.example.calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView solution,result;
    Button button_C,button_brackets,button_modulo,button_divide;
    Button button_seven,button_eight,button_nine,button_multiply;
    Button button_four,button_five,button_six,button_minus;
    Button button_empty,button_zero,button_dot,button_equalto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        solution = findViewById(R.id.solution_view);
        result = findViewById(R.id.result_view);

        button_C =findViewById(R.id.b_C);
        button_brackets = findViewById(R.id.b_brackets);
        button_modulo = findViewById(R.id.b_modulo);
        button_divide = findViewById(R.id.b_divide);
        button_seven = findViewById(R.id.b_seven);
        button_eight = findViewById(R.id.b_eight);
        button_nine = findViewById(R.id.b_nine);
        button_multiply = findViewById(R.id.b_multiply);
        button_four = findViewById(R.id.b_four);
        button_five = findViewById(R.id.b_five);
        button_six = findViewById(R.id.b_six);
        button_minus = findViewById(R.id.b_minus);
        button_empty = findViewById(R.id.b_empty);
        button_zero = findViewById(R.id.b_zero);
        button_dot = findViewById(R.id.b_dot);
        button_equalto = findViewById(R.id.b_equalto);

        button_C.setOnClickListener(this);
        button_brackets.setOnClickListener(this);
        button_modulo.setOnClickListener(this);
        button_divide.setOnClickListener(this);
        button_seven.setOnClickListener(this);
        button_eight.setOnClickListener(this);
        button_nine.setOnClickListener(this);
        button_multiply.setOnClickListener(this);
        button_four.setOnClickListener(this);
        button_five.setOnClickListener(this);
        button_six.setOnClickListener(this);
        button_minus.setOnClickListener(this);
        button_empty.setOnClickListener(this);
        button_zero.setOnClickListener(this);
        button_dot.setOnClickListener(this);
        button_equalto.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Button clickedbutton = (Button) v;
        String buttontext = clickedbutton.getText().toString();
        String datatocalculate = solution.getText().toString();

        if(buttontext.equals("="))
        {
            result.setText(solution.getText().toString());
            return;
        }
        if(buttontext.equals("AC"))
        {
            solution.setText("0");
            result.setText("0");
            return;
        }
        if(buttontext.equals("C"))
        {
            datatocalculate = datatocalculate.substring(0,datatocalculate.length()-1);
        }
        else {
            datatocalculate = datatocalculate + buttontext;
        }

        solution.setText(datatocalculate);

    }
}