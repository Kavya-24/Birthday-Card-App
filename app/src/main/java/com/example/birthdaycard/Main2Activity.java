package com.example.birthdaycard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        TextView textView1 = findViewById(R.id.receiver_edittext);
        TextView textView2 = findViewById(R.id.sender_edittext);
        TextView textView3 = findViewById(R.id.message_edittext);
        String message1= Objects.requireNonNull(getIntent().getExtras()).getString("EXTRA_MESSAGE1");
        String message2=getIntent().getExtras().getString("EXTRA_MESSAGE2");
        String message3=getIntent().getExtras().getString("EXTRA_MESSAGE3");
        textView1.setText(message1);
        textView2.setText(message2);
        textView3.setText(message3);

        Button button2 = findViewById(R.id.go_back_button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}
