package com.example.emailapplication.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.emailapplication.R;
import com.example.emailapplication.activities.emails.EmailsActivity;

public class LoginActivity  extends AppCompatActivity {

    private Button btn_startEmailsActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_startEmailsActivity = (Button) findViewById(R.id.btn_StartEmails);
        btn_startEmailsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenEmailsActivity();
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    public void OpenEmailsActivity()
    {
        Intent intent = new Intent(this, EmailsActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

}