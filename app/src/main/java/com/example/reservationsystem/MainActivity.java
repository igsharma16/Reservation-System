package com.example.reservationsystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.reservationsystem.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Call SignIn() function when the button of Sign in is clicked
    public void signIn(View view){

        EditText userId =  findViewById(R.id.userText);         //To access the user Id field
        EditText password = findViewById(R.id.password);         //To access the password Field

        String userText = userId.getText().toString();
        String passText = password.getText().toString();

        Intent intent = new Intent(this , First_Interface.class);  // To set Intent to Category Activity

        if(new SignIn().follow(userText , passText)) {
            startActivity(intent);
            Toast.makeText(this, "You are Successfully Logged In", Toast.LENGTH_SHORT).show();
        }
    }
}