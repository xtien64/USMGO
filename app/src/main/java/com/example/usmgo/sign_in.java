package com.example.usmgo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class sign_in extends AppCompatActivity {
    private Button button_Psg;
    private Button button_Dv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        button_Psg = (Button) findViewById(R.id.button_passenger);
        button_Psg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPassenger();
            }
        });

        button_Dv = (Button) findViewById(R.id.button_driver);
        button_Dv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDriver();
            }
        });
        }

        public void openPassenger() {
            Intent intent = new Intent(this, passenger.class);
            startActivity(intent);
        }
        public void openDriver() {
            Intent intent = new Intent(this, driver.class);
            startActivity(intent);
        }
}
