package com.example.mytoolbar_a189629;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent intent;

        if(item.getItemId() == R.id.menu_notification){
            Toast.makeText(MainActivity.this, "Notification", Toast.LENGTH_SHORT).show();
            intent = new Intent(MainActivity.this, NotificationActivity.class);
            startActivity(intent);
        }else if(item.getItemId() == R.id.menu_setting){
            Toast.makeText(MainActivity.this, "Setting", Toast.LENGTH_SHORT).show();
            intent = new Intent(MainActivity.this, SettingActivity.class);
            startActivity(intent);
        }else if(item.getItemId() == R.id.menu_sync){
            Toast.makeText(MainActivity.this, "Sync", Toast.LENGTH_SHORT).show();
            intent = new Intent(MainActivity.this, SyncActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}