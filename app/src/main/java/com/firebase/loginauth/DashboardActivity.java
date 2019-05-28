package com.firebase.loginauth;

import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Timer;
import java.util.TimerTask;

public class DashboardActivity extends AppCompatActivity {

    private ImageButton btnProfile, btnChatting, btnSchedule, btnCalendar, btnEmoney, btnSecurity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        btnProfile = (ImageButton) findViewById(R.id.profile);
        btnChatting = (ImageButton) findViewById(R.id.chatting);
        btnSchedule = (ImageButton) findViewById(R.id.schedule);
        btnCalendar = (ImageButton) findViewById(R.id.calendar);
        btnEmoney = (ImageButton) findViewById(R.id.emoney);
        btnSecurity = (ImageButton) findViewById(R.id.security);

        btnProfile.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(DashboardActivity.this, MainActivity.class));
            }
        });

        btnChatting.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Chatting Feature Soon!", Toast.LENGTH_SHORT).show();
            }
        });

        btnSchedule.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Schedule Feature Soon!", Toast.LENGTH_SHORT).show();
            }
        });

        btnCalendar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Calendar Feature Soon!", Toast.LENGTH_SHORT).show();
            }
        });

        btnEmoney.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "eMoney Feature Soon!", Toast.LENGTH_SHORT).show();
            }
        });

        btnSecurity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(getApplicationContext(), "Security Feature Soon!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

