package com.example.prm392_lab2_signup_signin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignInActivity extends AppCompatActivity {
    //Views
    private EditText etUsername;
    private EditText etPassword;
    private TextView txtNotAccount;
    private Button btnSignIn;
    //Notify
    private final String REQUIRE = "Require";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin_layout);

        //Reference from layout
        etUsername = findViewById(R.id.etUserName);
        etPassword = findViewById(R.id.etPassword);
        txtNotAccount = findViewById(R.id.txtNotAccount);
        btnSignIn = findViewById(R.id.btnSignIn);

        // Register event
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();
            }
        });

        txtNotAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signUpForm();
            }
        });
    }

    private boolean checkInput() {
        //Username
        if (TextUtils.isEmpty(etUsername.getText().toString())) {
            etUsername.setError(REQUIRE);
            return false;
        }
        //Password
        if (TextUtils.isEmpty(etPassword.getText().toString())) {
            etPassword.setError(REQUIRE);
            return false;
        }
        //Valid
        return true;
    }

    // Đăng nhập
    private void signIn() {
        //Invalid
        if (!checkInput()) {
            return;
        }
        //Start MainActivity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    private void signUpForm() {
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
        finish();
    }
}
