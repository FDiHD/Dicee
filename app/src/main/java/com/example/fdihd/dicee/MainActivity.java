package com.example.fdihd.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button rollButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollButton = findViewById(R.id.rollButton);
        final ImageView dice1 = findViewById(R.id.image_Dice1);
        final ImageView dice2 = findViewById(R.id.image_Dice2);
        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dice", "Button was pressced");
                Random randomNumerGenerator = new Random();
                int number = randomNumerGenerator.nextInt(6);
                Log.d("DICE", "THE RANDOM NR IS: " + number);
                dice1.setImageResource(diceArray[number]);
                number = randomNumerGenerator.nextInt(6);
                dice2.setImageResource(diceArray[number]);
            }
        });


    }
}
