package com.example.prm392_lab2_randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // khai báo biến
    EditText txtMinNumber,txtMaxNumber;
    Button btnRandom;
    TextView txtRandom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ
        txtMinNumber = (EditText) findViewById(R.id.editTextMin);
        txtMaxNumber = (EditText) findViewById(R.id.editTextMax);
        btnRandom = (Button) findViewById(R.id.button);
        txtRandom = (TextView) findViewById(R.id.textViewRandom);
        btnRandom.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int minNumber = Integer.parseInt(txtMinNumber.getText().toString());
                int maxNumber = Integer.parseInt(txtMaxNumber.getText().toString());
                if(minNumber>maxNumber){
                    txtRandom.setText("Giới hạn dưới phải   lớn hơn giới hạn trên");
                }else if (minNumber < maxNumber){
                    int number = new Random().nextInt(maxNumber-minNumber+1)+minNumber;
                    txtRandom.setText(number+"");
                }
            }
        });
    }
}