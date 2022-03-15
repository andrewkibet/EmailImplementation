package com.example.email;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

public void onClick(View view){
        try {
            GmailSender sender = new GmailSender("email@gmail.com","password",);
            sender.sendMail("This is Sublect","Body","em");

        } catch (Exception e){
            Log.e("send", "error")
        }
}

}