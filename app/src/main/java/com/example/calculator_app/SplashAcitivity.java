package com.example.calculator_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class SplashAcitivity extends AppCompatActivity {

    String permissions[] = {"android.permission.WRITE_EXTERNAL_STORAGE","android.permission.CALL_PHONE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_acitivity);

        requestPermissions(permissions,80);




    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if(requestCode == 80)
        {
            if(grantResults[0] == PackageManager.PERMISSION_GRANTED)
            {
                Toast.makeText(this,"permissions allowed",Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(this,"permissions denied",Toast.LENGTH_LONG).show();
            }
        }
    }
}