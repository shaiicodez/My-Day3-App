package com.example.myday3app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // [1] call button
        val rollButton = findViewById<Button>(R.id.button)
        // [2] activate button
        rollButton.setOnClickListener { rollDice() }


    }

    private fun rollDice() {
        // [3] call image view
        val imageDice = findViewById<ImageView>(R.id.img_dice)

        // [4] create dice object
        val dice = Dice(6)

        // check the rolled dice
        when(dice.roll()){
            1 -> imageDice.setImageResource(R.drawable.dice_1)
            2 -> imageDice.setImageResource(R.drawable.dice_2)
            3 -> imageDice.setImageResource(R.drawable.dice_3)
            4 -> imageDice.setImageResource(R.drawable.dice_4)
            5 -> imageDice.setImageResource(R.drawable.dice_5)
            6 -> imageDice.setImageResource(R.drawable.dice_6)

        }
    }
} // End class MainActivity

