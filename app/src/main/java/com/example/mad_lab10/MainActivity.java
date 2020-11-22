package com.example.mad_lab10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText value;
    RadioButton celsiusRadiobtn, fahrenheitRadioBtn;
    TextView ans;
    Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        value = findViewById(R.id.editTextValue);
        celsiusRadiobtn = findViewById(R.id.celsiusRadioBtn);
        fahrenheitRadioBtn = findViewById(R.id.fahrenheitRadioBtn);
        ans = findViewById(R.id.ans);
        btnConvert = findViewById(R.id.btnConvert);

        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (value.getText().length() == 0){
                    Toast.makeText(MainActivity.this, "Please enter a Number", Toast.LENGTH_SHORT).show();
                    return;
                }

                float inputValue = Float.parseFloat(value.getText().toString());

                if (celsiusRadiobtn.isChecked()){
                    ans.setText("Result :" + String.valueOf(convertToCelcious(inputValue)) + " 'C");
                    celsiusRadiobtn.setChecked(true);
                    fahrenheitRadioBtn.setChecked(false);
                }
                else{
                    ans.setText("Result : " + String.valueOf(convertTofarenhight(inputValue)) + " 'F");
                    fahrenheitRadioBtn.setChecked(true);
                    celsiusRadiobtn.setChecked(false);
                }
            }
        });
    }

    public static float convertToCelcious(float number){
        return ((number - 32) * 5 /9);
    }

    public static float convertTofarenhight(float number){
        return ((number * 9) / 5) + 32;
    }

}