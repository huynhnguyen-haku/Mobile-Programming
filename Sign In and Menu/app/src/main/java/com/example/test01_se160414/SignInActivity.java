package com.example.test01_se160414;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {
    // Views
    private EditText etUsername;
    private EditText etPassword;
    private TextView txtNotAccount;
    private Button btnSignIn;
    // Notify
    private final String REQUIRE = "Require";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin_layout);

        // Reference from layout
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

    }

    private boolean checkInput() {
        // Username
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

    // Login
    private void signIn() {
        //Invalid
        if (!checkInput()) {
            return;
        }
        if(!etUsername.getText().toString().equals("user")){
            Toast.makeText(this, "Username does not exits", Toast.LENGTH_LONG).show();
            return;
        }

        if(!etPassword.getText().toString().equals("123456")){
            Toast.makeText(this, "Password wrong", Toast.LENGTH_LONG).show();
            return;
        }
        //Start MainActivity
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}

