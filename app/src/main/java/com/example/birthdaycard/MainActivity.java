package com.example.birthdaycard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    EditText editText3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         editText1 = findViewById(R.id.receiver_edittext);
         editText2= findViewById(R.id.sender_edittext);
         editText3 = findViewById(R.id.message_edittext);


        Button button1 = findViewById(R.id.make_card_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);

                String message1 =editText1.getText().toString();
                String message2 =editText2.getText().toString();
                String message3 =editText3.getText().toString();

                intent.putExtra("EXTRA_MESSAGE1",message1);
                intent.putExtra("EXTRA_MESSAGE2",message2);
                intent.putExtra("EXTRA_MESSAGE3",message3);
                startActivity(intent);

            }
        });
    }

    }



