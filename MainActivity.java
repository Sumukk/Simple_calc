package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String str;
    EditText number1,number2;
    TextView Result;
    char operator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        number1=findViewById(R.id.num1);
        number2=findViewById(R.id.num2);
        Result=findViewById(R.id.res);
    }
    public void one(View v)
    {
        if(number1.hasFocus())
        {
            number1.append("1");
        }
        else if(number2.hasFocus())
        {
            number2.append("1");
        }
        else
            Toast.makeText( this,"Place the cursor in either of the edit text field",Toast.LENGTH_LONG).show();
    }
    public void two(View v)
    {
        if(number1.hasFocus())
        {
            number1.append("2");
        }
        else if(number2.hasFocus())
        {
        number2.append("2");
        }
        else
            Toast.makeText(this,"Place the cursor in either of the edit text field",Toast.LENGTH_LONG).show();
    }
    public void three(View v)
    {
        if(number1.hasFocus())
        {
            number1.append("3");
        }
        else if(number2.hasFocus())
    {
        number2.append("3");
    }
        else
            Toast.makeText(this,"Place the cursor in either of the edit text field",Toast.LENGTH_LONG).show();
    }
    public void four(View v)
    {
        if(number1.hasFocus())
        {
            number1.append("4");
        }
        else if(number2.hasFocus())
    {
        number2.append("4");
    }
        else
            Toast.makeText(this,"Place the cursor in either of the edit text field",Toast.LENGTH_LONG).show();
    }
    public void five(View v)
    {
        if(number1.hasFocus())
        {
            number1.append("5");
        }
        else if(number2.hasFocus())
    {
        number2.append("5");
    }
        else
            Toast.makeText(this,"Place the cursor in either of the edit text field",Toast.LENGTH_LONG).show();
    }
    public void six(View v)
    {
        if(number1.hasFocus())
        {
            number1.append("6");
        }
        else if(number2.hasFocus())
    {
        number2.append("6");
    }
        else
            Toast.makeText(this,"Place the cursor in either of the edit text field",Toast.LENGTH_LONG).show();
    }
    public void seven(View v)
    {
        if(number1.hasFocus())
        {
            number1.append("7");
        }
        else if(number2.hasFocus())
        {
            number2.append("7");
        }
        else
            Toast.makeText(this,"Place the cursor in either of the edit text field",Toast.LENGTH_LONG).show();
    }
    public void eight(View v)
    {
        if(number1.hasFocus())
        {
            number1.append("8");
        }
        else if(number2.hasFocus())
        {
            number2.append("8");
        }
        else
            Toast.makeText(this,"Place the cursor in either of the edit text field",Toast.LENGTH_LONG).show();
    }
    public void nine(View v)
    {
        if(number1.hasFocus())
        {
            number1.append("9");
        }
        else if(number2.hasFocus())
        {
            number2.append("9");
        }
        else
            Toast.makeText(this,"Place the cursor in either of the edit text field",Toast.LENGTH_LONG).show();
    }
    public void zero(View v)
    {
        if(number1.hasFocus())
        {
            number1.append("0");
        }
        else if(number2.hasFocus())
        {
            number2.append("0");
        }
        else
            Toast.makeText(this,"Place the cursor in either of the edit text field",Toast.LENGTH_LONG).show();
    }
    public void point(View v)
    {
        if(number1.hasFocus())
        {
            number1.append(".");
        }
        else if(number2.hasFocus())
        {
            number2.append(".");
        }
        else
            Toast.makeText(this,"Place the cursor in either of the edit text field",Toast.LENGTH_LONG).show();
    }
    public void result(View v)
    {
        Float numb1;
        Float numb2;
        Float res;
        numb1=Float.parseFloat(number1.getText().toString());
        numb2=Float.parseFloat(number2.getText().toString());
        switch(operator)
        {
            case '+':
                res=numb1+numb2;
                Result.setText(res + " ");
                break;
            case '-':
                res=numb1-numb2;
                Result.setText("" + res);
                break;
            case '*':
                res=numb1*numb2;
                Result.setText(""+res);
                break;
            case '/':
                if(numb2==0)
                    Toast.makeText(this,"provide a non zero value for denominator",Toast.LENGTH_LONG).show();
                else {
                    res = numb1 / numb2;
                    Result.setText("" + res);
                    break;
                }
                break;
        }
    }
    public void plus(View v)
    {
        operator='+';
    }
    public void subtract(View v)
    {
        operator='-';
    }
    public void multiply(View v)
    {
        operator='*';
    }
    public void division(View v)
    {
        operator='/';
    }
    public void clear_field(View v)
    {
        if(number1.hasFocus())
            number1.setText("");
        else if(number2.hasFocus())
            number2.setText("");
        else if(Result.hasFocus())
            Result.setText("");
    }
    public void clear_all(View v)
    {
        number1.setText("");
        number2.setText("");
        Result.setText("");
    }
    public void clear_char(View v)
    {
        if(number1.hasFocus())
        {
            String s=number1.getText().toString();
            s=s.substring(0,s.length()-1);
            number1.setText(s);
        }
        else if(number2.hasFocus())
        {
            String s=number2.getText().toString();
            s=s.substring(0,s.length()-1);
            number2.setText(s);
        }
    }
}
