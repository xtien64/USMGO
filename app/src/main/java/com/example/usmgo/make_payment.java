package com.example.usmgo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.Dialog;

public class make_payment extends AppCompatActivity {
    Button button2, btnYes, btnNo;
    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_payment);
        myDialog = new Dialog(this);

        //button1 = findViewById(R.id.btn_payment1);
        button2 = findViewById(R.id.btn_payment2);

        /*button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), pay_cash.class);
                startActivity(i);
            }
        });*/

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), history_payment.class);
                startActivity(i);
            }
        });
    }

    public void showPopUp(View v){
        myDialog.setContentView(R.layout.activity_pay_cash);
        btnNo = (Button) myDialog.findViewById(R.id.btn_cash_no);
        btnYes = (Button) myDialog.findViewById(R.id.btn_cash_yes);
        btnNo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDialog.dismiss();
            }
        });

        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }
}