package com.example.weightlossapp_dakota_mcdonough.login;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import com.example.weightlossapp_dakota_mcdonough.R;

import androidx.appcompat.app.AppCompatActivity;

public class LoginCheck extends AppCompatActivity {

    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //set up username text
        final EditText usernameEditText = findViewById(R.id.username);
        //set up password text
        final EditText passwordEditText = findViewById(R.id.password);
        //set up login button
        final Button loginButton = findViewById(R.id.login);
        //set up sign up button
        final Button signupButton = findViewById(R.id.signup);

        //create a listener to watch for a login attempt

    }

}
