package com.elflin.petqper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import model.User;

public class RegisterActivity extends AppCompatActivity {

    private ImageButton backbutton_form;
    private TextInputLayout name_form, username_form, email_form, password_form, confirmpass_form;
    private Button submit_form;
    private FirebaseFirestore db;
    private FirebaseAuth mAuth;
    private User user;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initComponent();
        setListener();
    }

    private void initComponent() {
        this.backbutton_form = findViewById(R.id.backbutton_form);
        this.name_form = findViewById(R.id.name_form);
        this.username_form = findViewById(R.id.username_form);
        this.email_form = findViewById(R.id.email_form);
        this.password_form = findViewById(R.id.password_form);
        this.confirmpass_form = findViewById(R.id.confirmpass_form);
        this.submit_form = findViewById(R.id.submit_form);
        this.db = FirebaseFirestore.getInstance();
    }

    private void setListener() {
        this.backbutton_form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        this.submit_form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDataFromForm();
                if (datachecker()) {
                    intent = new Intent(getBaseContext(), MainActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
            }
        });
    }

    private boolean datachecker() {
        if (this.user.getPassword().equalsIgnoreCase(this.confirmpass_form.getEditText().getText().toString().trim())){
            if (true){
                return true;
            }
        }
        return false;
    }

    private void getDataFromForm() {
        this.user = new User();
        this.user.setNama(name_form.getEditText().getText().toString().trim());
        this.user.setUsername(username_form.getEditText().getText().toString().trim());
        this.user.setEmail(email_form.getEditText().getText().toString().trim());
        this.user.setPassword(password_form.getEditText().getText().toString().trim());
    }
}