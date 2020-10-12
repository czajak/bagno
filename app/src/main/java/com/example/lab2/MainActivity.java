package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    TextView textView;
    EditText editTextNumber;
    String editTextNumberValue;
    double wartosc;
    double wynik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.radio);
        textView = findViewById(R.id.text_view);
        Button buttonApply = findViewById(R.id.button);
        buttonApply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextNumber = findViewById(R.id.editTextNumber);
                if(editTextNumber != null)
                {
                    editTextNumberValue = editTextNumber.getText().toString();
                    wartosc = Double.parseDouble(editTextNumberValue.trim());
                    wynik=wartosc;
                }
                int radioId = radioGroup.getCheckedRadioButtonId();
                switch (radioId) {
                    case R.id.cm:
                        textView.setText("" +wynik);
                        break;
                    case R.id.km:
                        textView.setText("" +wynik/1000);
                        break;
                    case R.id.mile:
                        textView.setText("" +wynik*0.0000062137);
                        break;
                    case R.id.ly:
                        textView.setText("" +wynik*0.00000000000000010570);
                        break;
                    default:
                        textView.setText("error");
                        break;
                }
            }
        });
    }
}
