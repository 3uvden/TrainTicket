package com.example.traintickets;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText nameIn;
    private EditText addressIn;
    private EditText emailIn;
    private Button button;

    private String name;
    private String address;
    private String email;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameIn = findViewById(R.id.nameIn);
        addressIn = findViewById(R.id.addressIn);
        emailIn = findViewById(R.id.emailIn);
        button = findViewById(R.id.button);

        button.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {


            name = nameIn.getText().toString();
            address = addressIn.getText().toString();
            email = emailIn.getText().toString();

            User user = new User(name, address, email);


            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);


            intent.putExtra(User.class.getSimpleName(), user);


            startActivity(intent);
        }
    };
}