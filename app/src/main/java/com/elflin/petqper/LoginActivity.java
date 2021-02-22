package com.elflin.petqper;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import model.User;

public class LoginActivity extends AppCompatActivity {

    private Button register_login, submit_login;
    private Intent intent;
    private TextInputLayout name_form, password_login;
    private FirebaseFirestore db;
    private FirebaseAuth mAuth;
    private FirebaseUser currentUser;
    private User user;
    private int REGISTER_CODE = 100;

    @Override
    protected void onStart() {
        super.onStart();
        this.mAuth = FirebaseAuth.getInstance();
        this.currentUser = mAuth.getCurrentUser();
        if (user != null) {
            this.intent = new Intent(getBaseContext(), MainActivity.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initComponent();
        setListener();
    }

    private void setListener() {
        this.register_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getBaseContext(), RegisterActivity.class);
                startActivityForResult(intent,REGISTER_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REGISTER_CODE){
            if (resultCode == 1){
                finish();
            }
        }
    }

    private void initComponent() {
        this.register_login = findViewById(R.id.register_login);
        this.name_form = findViewById(R.id.name_form);
        this.password_login = findViewById(R.id.password_login);
        this.submit_login = findViewById(R.id.submit_login);
        this.db = FirebaseFirestore.getInstance();
    }
}