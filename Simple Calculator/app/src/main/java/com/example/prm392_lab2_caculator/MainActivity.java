package com.example.prm392_lab2_caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Khai báo biến
    EditText num1, num2;
    Button btnCong, btnTru, btnNhan, btnChia;

    TextView txtKetqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ
        num1 = (EditText)findViewById(R.id.editTextnum1);
        num2 = (EditText)findViewById(R.id.editTextnum2);
        btnCong = (Button) findViewById(R.id.buttonCong);
        btnTru = (Button) findViewById(R.id.buttonTru);
        btnNhan = (Button) findViewById(R.id.buttonNhan);
        btnChia = (Button) findViewById(R.id.buttonChia);
        txtKetqua = (TextView) findViewById(R.id.textViewKq);

        // Cộng
        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double number1 = Double.parseDouble(num1.getText().toString());
                    double number2 = Double.parseDouble(num2.getText().toString());
                    double result = number1 + number2;
                    txtKetqua.setText(result+"");
                }catch (Exception ex){
                    txtKetqua.setText("Yêu cầu nhập đủ dữ liệu");
                }
            }
        });

        // Trừ
        btnTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double number1 = Double.parseDouble(num1.getText().toString());
                    double number2 = Double.parseDouble(num2.getText().toString());
                    double result = number1 - number2;
                    txtKetqua.setText(result+"");
                }catch (Exception ex){
                    txtKetqua.setText("Yêu cầu nhập đủ dữ liệu");
                }
            }
        });

        // Nhân
        btnNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double number1 = Double.parseDouble(num1.getText().toString());
                    double number2 = Double.parseDouble(num2.getText().toString());
                    double result = number1 * number2;
                    txtKetqua.setText(result+"");
                }catch (Exception ex){
                    txtKetqua.setText("Yêu cầu nhập đủ dữ liệu");
                }
            }
        });

        //Chia
        btnChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double number1 = Double.parseDouble(num1.getText().toString());
                    double number2 = Double.parseDouble(num2.getText().toString());
                    if (number2 == 0) {
                        txtKetqua.setText("Không thể chia cho 0");
                    }else{
                        double result = number1 / number2;
                        txtKetqua.setText(result+"");
                    }
                }catch (Exception ex){
                    txtKetqua.setText("Yêu cầu nhập đủ dữ liệu");
                }
            }
        });
    }
}