package com.dhj.municipalcorporation;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.badge.BadgeUtils;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Collections;

public class  MainActivity extends AppCompatActivity {
EditText t1;
Button fb;
FirebaseAuth fAuth;
String number;
    private static final int RC_SIGN_IN = 101;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        t1=findViewById(R.id.txt_phone);
        fb=findViewById(R.id.btnfacebook);
        fAuth=FirebaseAuth.getInstance();
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 number=t1.getText().toString();
                if(number.isEmpty() || number.length() < 10){
                    t1.setError("Enter a valid mobile");
                    t1.requestFocus();
                    return;
                }
                else {
                    Intent intent = new Intent(MainActivity.this, otp_verify.class);
                    intent.putExtra("mobile", number);
                    startActivity(intent);
                }
            }
        });


    }



}