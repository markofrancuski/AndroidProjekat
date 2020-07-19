package com.example.emailapplication.activities.emails;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.emailapplication.R;
import com.example.emailapplication.activities.LoginActivity;
import com.example.emailapplication.activities.ProfileActivity;
import com.example.emailapplication.activities.SettingsActivity;
import com.example.emailapplication.activities.contacts.ContactActivity;
import com.example.emailapplication.activities.contacts.ContactsActivity;
import com.example.emailapplication.activities.contacts.CreateContactActivity;
import com.example.emailapplication.activities.folders.CreateFolderActivity;
import com.example.emailapplication.activities.folders.FolderActivity;
import com.example.emailapplication.activities.folders.FoldersActivity;

public class EmailsActivity  extends AppCompatActivity {

    // References
    private Button btn_Contacts;
    private Button btn_Contact;
    private Button btn_CreateContact;
    private Button btn_CreateEmail;
    private Button btn_Email;
    private Button btn_Emails;
    private Button btn_CreateFolder;
    private Button btn_Folder;
    private Button btn_Folders;
    private Button btn_Profile;
    private Button btn_Settings;

    // Methods
    public void StartContactActivity()
    {
        Intent intent = new Intent(EmailsActivity.this, ContactActivity.class);
        startActivity(intent);
    }
    public void StartContactsActivity()
    {
        Intent intent = new Intent(EmailsActivity.this, ContactsActivity.class);
        startActivity(intent);
    }
    public void StartCreateContactActivity()
    {
        Intent intent = new Intent(EmailsActivity.this, CreateContactActivity.class);
        startActivity(intent);
    }
    public void StartCreateEmailActivity()
    {
        Intent intent = new Intent(EmailsActivity.this, CreateEmailActivity.class);
        startActivity(intent);
    }
    public void StartEmailActivity()
    {
        Intent intent = new Intent(EmailsActivity.this, EmailActivity.class);
        startActivity(intent);
    }
    public void StartCreateFolderActivity()
    {
        Intent intent = new Intent(EmailsActivity.this, CreateFolderActivity.class);
        startActivity(intent);
    }
    public void StartFolderActivity()
    {
        Intent intent = new Intent(EmailsActivity.this, FolderActivity.class);
        startActivity(intent);
    }
    public void StartFoldersActivity()
    {
        Intent intent = new Intent(EmailsActivity.this, FoldersActivity.class);
        startActivity(intent);
    }
    public void StartProfileActivity()
    {
        Intent intent = new Intent(EmailsActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
    public void StartSettingsActivity()
    {
        Intent intent = new Intent(EmailsActivity.this, SettingsActivity.class);
        startActivity(intent);
    }

    // Android Lifecycle Methods
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emails);

        // Setting up the Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btn_Contacts = (Button) findViewById(R.id.btn_contacts);
        btn_Contacts.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) { StartContactsActivity(); }
                                        });

        btn_Contact = (Button) findViewById(R.id.btn_contact);
        btn_Contact.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) { StartContactActivity(); }
                                        });

        btn_CreateContact = (Button) findViewById(R.id.btn_createContact);
        btn_CreateContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartContactActivity();
            }
        });

        btn_CreateEmail = (Button) findViewById(R.id.btn_createEmail);
        btn_CreateEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartCreateEmailActivity();
            }
        });

        btn_Email = (Button) findViewById(R.id.btn_email);
        btn_Email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartEmailActivity();
            }
        });

        btn_CreateFolder = (Button) findViewById(R.id.btn_createFolder);
        btn_CreateFolder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { StartCreateFolderActivity();
            }
        });

        btn_Folder = (Button) findViewById(R.id.btn_folder);
        btn_Folder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartFolderActivity();
            }
        });

        btn_Folders = (Button) findViewById(R.id.btn_folders);
        btn_Folders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartFoldersActivity();
            }
        });

        btn_Profile = (Button) findViewById(R.id.btn_profile);
        btn_Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartProfileActivity();
            }
        });

        btn_Settings = (Button) findViewById(R.id.btn_settings);
        btn_Settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StartSettingsActivity();
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
