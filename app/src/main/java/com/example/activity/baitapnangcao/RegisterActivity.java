package com.example.activity.baitapnangcao;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    TextView tvTitleRegister;
    EditText edtFullname, edtUsername, edtPassword, edtEmail, edtAddress, edtPhone;
    Button btnRegis;
    RadioGroup radioSex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edtFullname = (EditText) findViewById(R.id.edtFullname);
        edtUsername = (EditText) findViewById(R.id.edtUsernameRegis);
        edtPassword = (EditText) findViewById(R.id.edtPassRegis);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtAddress = (EditText) findViewById(R.id.edtEmail);
        edtPhone = (EditText) findViewById(R.id.edtPhone);
        btnRegis = (Button) findViewById(R.id.btnRegisterRegis);
        tvTitleRegister = (TextView) findViewById(R.id.tvRegister);
        radioSex = (RadioGroup) findViewById(R.id.radioSex);

        Typeface tf = Typeface.createFromAsset(getApplicationContext().getAssets(),"fonts/mtcorsva.ttf");
        tvTitleRegister.setTypeface(tf);

        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fullname = edtFullname.getText().toString();
                String username = edtUsername.getText().toString();
                String password = edtPassword.getText().toString();
                String email = edtEmail.getText().toString();
                String address = edtAddress.getText().toString();
                String phone = edtPhone.getText().toString();
                int id = radioSex.getCheckedRadioButtonId();
                if (fullname.equals("") || username.equals("") || password.equals("") ||
                        email.equals("") || address.equals("") || phone.equals("") || id == -1) {
                    Toast.makeText(RegisterActivity.this, "Enter all data, please!", Toast.LENGTH_LONG).show();
                } else {
                    Intent intentLogin = new Intent(RegisterActivity.this, MainActivity.class);
                    startActivity(intentLogin);
                }
            }
        });
    }
}
