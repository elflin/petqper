package com.elflin.petqper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private Button register_login;
    private Intent intent;

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
                startActivity(intent);
            }
        });
    }

    private void initComponent() {
        this.register_login = findViewById(R.id.register_login);
    }
}