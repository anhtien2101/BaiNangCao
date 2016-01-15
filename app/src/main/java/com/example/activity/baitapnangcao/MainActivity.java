package com.example.activity.baitapnangcao;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView tvTitleLogin;
    Button btnLogin, btnRegister;
    EditText edtUsername, edtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitleLogin = (TextView) findViewById(R.id.tvTitle);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnRegister = (Button) findViewById(R.id.btnRegister);
        edtUsername = (EditText) findViewById(R.id.edtUsername);
        edtPass = (EditText) findViewById(R.id.edtPass);

        Typeface tf = Typeface.createFromAsset(getApplicationContext().getAssets(),"fonts/mtcorsva.ttf");
        tvTitleLogin.setTypeface(tf);

        btnRegister.setOnClickListener(this);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btnLogin) {
            String username = edtUsername.getText().toString();
            String pass = edtPass.getText().toString();
            if (username.equals("") || pass.equals("")) {
                Toast.makeText(MainActivity.this, "Enter all data, please!", Toast.LENGTH_LONG).show();
            } else {
                if (username.equals("admin") && pass.equals("1234")) {
                    Intent intentLogin = new Intent(MainActivity.this, LoginSuccessActivity.class);
                    startActivity(intentLogin);
                }
            }
        } else { // btn Register
            Intent intentRegister = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intentRegister);
        }

    }

}
