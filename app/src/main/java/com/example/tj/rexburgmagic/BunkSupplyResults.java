package com.example.tj.rexburgmagic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BunkSupplyResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bunk_supply_results);

        // Get number of beds from intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(GetDeliveryInfo.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.bedResults);
        textView.setText(message);
    }
}
