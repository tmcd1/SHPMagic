package com.example.tj.rexburgmagic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class GetDeliveryInfo extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.tj.rexburgmagic.MESSAGE";

    public void getHowManySupplies(View view) {
        // Respond to button press in DeliveryInfo Activity
        Intent intent = new Intent(this, BunkSupplyResults.class);
        EditText editText = (EditText) findViewById(R.id.numBeds);
        String numOfBeds = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, numOfBeds);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_delivery_info);
    }
}
