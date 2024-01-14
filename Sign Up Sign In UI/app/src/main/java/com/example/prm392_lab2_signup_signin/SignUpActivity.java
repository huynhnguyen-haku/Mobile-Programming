package com.example.prm392_lab2_signup_signin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity{
    // khai báo biến
    private EditText etUsername, etPassword, etConfirmPassword;
    private TextView txtHaveAccount;
    private Button btnSignUp;
    //noti
    private final String REQUIRE ="Require";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_layout);

        // Ánh xạ
        etUsername = (EditText) findViewById(R.id.etUserName);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etConfirmPassword = (EditText) findViewById(R.id.etPasswordConfirm);
        txtHaveAccount = (TextView) findViewById(R.id.txtHaveAccount);
        btnSignUp = (Button) findViewById(R.id.btnSignUp);

        // Register event
        txtHaveAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signInForm();
            }
        });
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUp();
            }
        });
    }

    private boolean checkInput(){
        // user, password
        if(TextUtils.isEmpty(etUsername.getText().toString())
                || TextUtils.isEmpty(etPassword.getText().toString())
                || TextUtils.isEmpty(etConfirmPassword.getText().toString())){
            etUsername.setError(REQUIRE);
            return false;
        }
        if(!TextUtils.equals(etPassword.getText().toString(), etConfirmPassword.getText().toString())){
            Toast.makeText(this, "Password are not match", Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }

    // Đăng kí
    private void signUp() {
        if (!checkInput()) {
            return;
        }
    }

    // chuyển qua SignUp
    private void signInForm(){
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
        finish();
    }
}
