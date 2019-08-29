package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText username,passeword;
    Button buttonsubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.usertxt);
        passeword = (EditText) findViewById(R.id.motpasstxt);
        buttonsubmit = (Button)findViewById(R.id.butSubmit);

        buttonsubmit.setOnClickListener(this);
    }


@Override

    public void onClick(View view) {

        if(view==buttonsubmit){

            Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
            startActivity(intent);
        }

    }
}
