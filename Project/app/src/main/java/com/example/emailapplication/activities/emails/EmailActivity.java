package com.example.emailapplication.activities.emails;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;


import com.example.emailapplication.R;

public class EmailActivity  extends AppCompatActivity {


    private static final String FROM_STRING = "From: ";
    private static final String SUBJECT_STRING = "Subject: ";

    // References
    private Button btn_BackToEmails;
    private Button btn_SaveAttachment;
    private Button btn_DeleteEmail;
    private Button btn_Reply;
    private Button btn_ReplyToAll;
    private Button btn_Forward;

    // Methods
    private void StartEmailsActivity(){
        Intent intent = new Intent(EmailActivity.this, EmailsActivity.class);
        startActivity(intent);
    }

    private void SaveAttachment(){

    }

    private void DeleteEmail(){

    }

    private void ReplyToEmail(){

    }

    private void ReplyToAllEmail(){

    }

    private void ForwardEmail(){

    }


    // Android Lifecycle Methods
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        btn_BackToEmails = (Button) findViewById(R.id.btn_goBackFromEmail);
        btn_BackToEmails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartEmailsActivity();
            }
        });

        btn_SaveAttachment = (Button) findViewById(R.id.btn_saveEmailAttachment);
        btn_SaveAttachment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SaveAttachment();
            }
        });

        btn_DeleteEmail = (Button) findViewById(R.id.btn_deleteEmail);
        btn_DeleteEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DeleteEmail();
            }
        });

        btn_Reply = (Button) findViewById(R.id.btn_replyToEmail);
        btn_Reply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReplyToEmail();
            }
        });

        btn_ReplyToAll = (Button) findViewById(R.id.btn_replyToAllEmail);
        btn_ReplyToAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ReplyToAllEmail();
            }
        });

        btn_Forward = (Button) findViewById(R.id.btn_forwardEmail);
        btn_Forward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ForwardEmail();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
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
