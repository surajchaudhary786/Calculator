package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    Button ba,bs,bm,bd;
    Button be,bc,bdt;

    EditText tres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = (Button)findViewById(R.id.button_0);
        b0.setOnClickListener(this);

        b1 = (Button)findViewById(R.id.button_1);
        b1.setOnClickListener(this);

        b2 = (Button)findViewById(R.id.button_2);
        b2.setOnClickListener(this);

        b3 = (Button)findViewById(R.id.button_3);
        b3.setOnClickListener(this);

        b4 = (Button)findViewById(R.id.button_4);
        b4.setOnClickListener(this);

        b5 = (Button)findViewById(R.id.button_5);
        b5.setOnClickListener(this);

        b6 = (Button)findViewById(R.id.button_6);
        b6.setOnClickListener(this);

        b7 = (Button)findViewById(R.id.button_7);
        b7.setOnClickListener(this);

        b8 = (Button)findViewById(R.id.button_8);
        b8.setOnClickListener(this);

        b9 = (Button)findViewById(R.id.button_9);
        b9.setOnClickListener(this);

        ba = (Button)findViewById(R.id.button_add);
        ba.setOnClickListener(this);

        bs = (Button)findViewById(R.id.button_sub);
        bs.setOnClickListener(this);

        bm = (Button)findViewById(R.id.button_mul);
        bm.setOnClickListener(this);

        bd = (Button)findViewById(R.id.button_div);
        bd.setOnClickListener(this);

        be = (Button)findViewById(R.id.button_eq);
        be.setOnClickListener(this);

        bc = (Button)findViewById(R.id.button_clr);
        bc.setOnClickListener(this);

        bdt = (Button)findViewById(R.id.button_dt);
        bdt.setOnClickListener(this);

        tres =(EditText)findViewById(R.id.editText_res);
        tres.setText("");

    }

    @Override
    public void onClick(View v) {
        if(v.equals(b0))
            tres.append("0");
        if(v.equals(b1))
            tres.append("1");
        if(v.equals(b2))
            tres.append("2");
        if(v.equals(b3))
            tres.append("3");
        if(v.equals(b4))
            tres.append("4");
        if(v.equals(b5))
            tres.append("5");
        if(v.equals(b6))
            tres.append("6");
        if(v.equals(b7))
            tres.append("7");
        if(v.equals(b8))
            tres.append("8");
        if(v.equals(b9))
            tres.append("9");
        if(v.equals(ba))
            tres.append("+");
        if(v.equals(bs))
            tres.append("-");
        if(v.equals(bm))
            tres.append("*");
        if(v.equals(bd))
            tres.append("/");
        if(v.equals(bdt))
            tres.append(".");

        if(v.equals(bc))
            tres.setText("");

        if(v.equals(be))
        {
            try {
                String data = tres.getText().toString();
                if(data.contains("/")){
                    String[] oprands = data.split("/");
                    if(oprands.length==2){
                        double op1 = Double.parseDouble(oprands[0]);
                        double op2 = Double.parseDouble(oprands[1]);

                        double result = op1/op2;
                        tres.setText(String.valueOf(result));
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Invalid Input",Toast.LENGTH_LONG).show();
                    }
                }


                if(data.contains("+")){
                    String[] oprands = data.split("\\+");
                    if(oprands.length==2){
                        double op1 = Double.parseDouble(oprands[0]);
                        double op2 = Double.parseDouble(oprands[1]);

                        double result = op1+op2;

                        tres.setText(String.valueOf(result));
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Invalid Input",Toast.LENGTH_LONG).show();
                    }
                }

                if(data.contains("-")){
                    String[] oprands = data.split("-");
                    if(oprands.length==2){
                        double op1 = Double.parseDouble(oprands[0]);
                        double op2 = Double.parseDouble(oprands[1]);

                        double result = op1-op2;

                        tres.setText(String.valueOf(result));
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Invalid Input",Toast.LENGTH_LONG).show();
                    }
                }

                if(data.contains("*")){
                    String[] oprands = data.split("\\*");
                    if(oprands.length==2){
                        double op1 = Double.parseDouble(oprands[0]);
                        double op2 = Double.parseDouble(oprands[1]);

                        double result = op1*op2;

                        tres.setText(String.valueOf(result));
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Invalid Input",Toast.LENGTH_LONG).show();
                    }
                }

            } catch (NumberFormatException e) {
                Toast.makeText(getApplicationContext(),"Invalid Input",Toast.LENGTH_LONG).show();
            }
        }
    }
}