package com.example.practiceandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private EditText txt1;
    private EditText txt2;
    private TextView result;
    private RadioButton r1,r2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v == btn) {
                    double num1 = Double.parseDouble(txt1.getText().toString());
                    double num2 = Double.parseDouble(txt2.getText().toString());
                    if (r1.isChecked()) {
                        double kq = 3.14*num1*num1 + 2*3.14*num1*num2;
                        result.setText("Diện tích: " + kq);
                    }
                    if (r2.isChecked()) {
                        double kq = 3.14*num1*num1*num2;
                        result.setText("Thể tích: " + kq );
                    }
                }
            }
        });
    }

    private void init() {
        btn = findViewById(R.id.button_submit);
        txt1 = findViewById(R.id.text_input1);
        txt2 = findViewById(R.id.text_input2);
        result = findViewById(R.id.text_result);
        r1 = findViewById(R.id.dien_tich);
        r2 = findViewById(R.id.the_tich);
    }
}