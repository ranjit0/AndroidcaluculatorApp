package com.example.calculatorappactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private EditText etEnterno;
    private Button btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight,
    btnNine, btnPlus, btnMinus, btnMultiply, btnDivide, btnModulus, btnPoint, btnResult;

    int valueone=0;
    int finalvalue=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEnterno=findViewById(R.id.etEnterno);

        btnOne=findViewById(R.id.btnOne);
        btnTwo=findViewById(R.id.btnTwo);
        btnThree=findViewById(R.id.btnThree);
        btnFour=findViewById(R.id.btnFour);
        btnFive=findViewById(R.id.btnFive);
        btnSix=findViewById(R.id.btnSix);
        btnSeven=findViewById(R.id.btnSeven);
        btnEight=findViewById(R.id.btnEight);
        btnNine=findViewById(R.id.btnNine);

        btnPlus=findViewById(R.id.btnPlus);
        btnMinus=findViewById(R.id.btnMinus);
        btnMultiply=findViewById(R.id.btnMultiply);
        btnDivide=findViewById(R.id.btnDivide);
        btnPoint=findViewById(R.id.btnPoint);
        btnModulus=findViewById(R.id.btnModulus);
        btnResult=findViewById(R.id.btnResult);


        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           valueone = Integer.parseInt( btnOne.getText().toString());
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueone = Integer.parseInt( btnTwo.getText().toString());
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueone = Integer.parseInt( btnThree.getText().toString());

            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueone = Integer.parseInt( btnFour.getText().toString());
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueone = Integer.parseInt( btnFive.getText().toString());

            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                valueone = Integer.parseInt( btnSix.getText().toString());

            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueone = Integer.parseInt( btnSeven.getText().toString());

            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueone = Integer.parseInt( btnEight.getText().toString());

            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueone = Integer.parseInt( btnNine.getText().toString());

            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Arthemetic arthemetic = new Arthemetic(valueone,finalvalue);
                finalvalue= arthemetic.plus();
                etEnterno.setText(Integer.toString( finalvalue));

            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Arthemetic arthemetic = new Arthemetic(valueone,finalvalue);
                finalvalue= arthemetic.minus();
                etEnterno.setText(Integer.toString( finalvalue));
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Arthemetic arthemetic = new Arthemetic(valueone,finalvalue);
                finalvalue= arthemetic.multiply();
                etEnterno.setText(Integer.toString( finalvalue));
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Arthemetic arthemetic = new Arthemetic(valueone,finalvalue);
                finalvalue= arthemetic.divide();
                etEnterno.setText(Integer.toString( finalvalue));
            }
        });

        btnPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnModulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Arthemetic arthemetic = new Arthemetic(valueone,finalvalue);
                finalvalue= arthemetic.modulus();
                etEnterno.setText(Integer.toString( finalvalue));


            }
        });

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               valueone=0;
               finalvalue=0;
               etEnterno.setText("0");

            }
        });
    }
}
