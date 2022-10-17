package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    TextView textView;
    EditText editText;
    Toast toast ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("NonConstantResourceId")
    public void apply(View view){
        editText = findViewById(R.id.enter);
        textView = findViewById(R.id.result);
        radioGroup = findViewById(R.id.radioGroup);
        if (editText.length()==0){
            toast = Toast.makeText(this,"\"Enter\" field is empty",Toast.LENGTH_SHORT);
            toast.show();
        }
        else {
            switch (radioGroup.getCheckedRadioButtonId()) {

                case R.id.b_black:
                    textView.setTextColor(getResources().getColor(R.color.black));
                    break;
                case R.id.b_pink:
                    textView.setTextColor(getResources().getColor(R.color.pink));
                    break;
                case R.id.b_purple:
                    textView.setTextColor(getResources().getColor(R.color.purple));
                    break;

            }
            textView.setText(editText.getText());
        }

    }
    public void delete(View view){
        textView = findViewById(R.id.result);
        textView.setText(null);
    }

}