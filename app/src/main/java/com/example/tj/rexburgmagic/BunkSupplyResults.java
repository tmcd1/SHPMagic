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
        String numberOfBedsString = intent.getStringExtra(GetDeliveryInfo.EXTRA_MESSAGE);

        TextView textView = findViewById(R.id.bedResults);
        textView.setText("Number of Bunks: ".concat(numberOfBedsString));

        // Calculate number of supplies from number of beds
        int numberOfBeds = Integer.parseInt(numberOfBedsString);

        String numHeadBoards = Integer.toString(2 * numberOfBeds);
        String numRunners = Integer.toString(4 * numberOfBeds);
        String numSafetyRails = Integer.toString(2 * numberOfBeds);
        String numSlats = Integer.toString(12 * numberOfBeds);
        String numLagsAndWashers = Integer.toString(20 * numberOfBeds);
        String numExtraSlats = Integer.toString(6 * numberOfBeds);
        String numExtraSafetyRails = Integer.toString(numberOfBeds);
        int extraRunners;
        if (numberOfBeds % 2 == 0) {
            extraRunners = numberOfBeds;
        }
        else{
            extraRunners = numberOfBeds + 1;
        }
        String numExtraRunners = Integer.toString(extraRunners);

        TextView topHeadBoards = findViewById(R.id.dispNumHeadBoards);
        topHeadBoards.setText("Top Head Boards: ".concat(numHeadBoards));

        TextView bottomHeadBoards = findViewById(R.id.dispNumBottomHeadBoards);
        bottomHeadBoards.setText("Bottom Head Boards: ".concat(numHeadBoards));

        TextView runners = findViewById(R.id.dispNumRunners);
        runners.setText("Runners: ".concat(numRunners));

        TextView safetyRails = findViewById(R.id.dispNumSafetyRails);
        safetyRails.setText("Safety Rails: ".concat(numSafetyRails));

        TextView slats = findViewById(R.id.dispNumSlats);
        slats.setText("Slats: ".concat(numSlats));

        TextView lags = findViewById(R.id.dispNumLags);
        lags.setText("Lags: ".concat(numLagsAndWashers));

        TextView washers = findViewById(R.id.dispNumWashers);
        washers.setText("Washers: ".concat(numLagsAndWashers));

        TextView extraSlats = findViewById(R.id.dispNumExtraSlats);
        extraSlats.setText("Slats: ".concat(numExtraSlats));

        TextView extraSafetyRails = findViewById(R.id.dispNumExtraSafetyRails);
        extraSafetyRails.setText("Safety Rails: ".concat(numExtraSafetyRails));

        TextView extraRunnersView = findViewById(R.id.dispNumExtraRunners);
        extraRunnersView.setText("Runners: ".concat(numExtraRunners));
    }
}
