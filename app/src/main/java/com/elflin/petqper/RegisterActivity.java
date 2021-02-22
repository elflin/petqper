package com.elflin.petqper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.textfield.TextInputLayout;

public class RegisterActivity extends AppCompatActivity {

    private ImageButton backbutton_form;
    private TextInputLayout name_form, username_form, email_form, password_form, confirmpass_form;
    private Button submit_form;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        initComponent();
        setListener();
    }

    private void initComponent() {
        this.backbutton_form = findViewById(R.id.backbutton_form);
    }

    private void setListener() {
        this.backbutton_form.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}