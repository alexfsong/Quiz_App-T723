package com.songalexander.quizapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button submitButton;
    EditText typeJaunt;
    TextView readJaunt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        readJaunt = findViewById(R.id.textBox);
        typeJaunt = findViewById(R.id.responseEditText);
        submitButton = findViewById(R.id.click_button);
        submitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.i("testButton", "What you said: " + typeJaunt.getText().toString());
                readJaunt.setText(readJaunt.getText().toString()+ " " +typeJaunt.getText().toString());
            }
        });
        typeJaunt.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(typeJaunt.getText().toString().equals("TJ")){
                    readJaunt.setText("TJ Rocks!");
                    typeJaunt.setText("");
                    typeJaunt.setHint("That's a good name.");
                }
            }
        });
    }
}
