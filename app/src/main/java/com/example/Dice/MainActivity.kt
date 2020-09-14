package com.example.Dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollbutton: Button = findViewById(R.id.roll_butoon)
        rollbutton.text = "let's Roll"
        rollbutton.setOnClickListener {
           rolldice()
        }
        diceImage = findViewById(R.id.dice_image)
    }

    private fun rolldice() {

        val randomNumber = (1..6).random()
        
        val drawableResources = when (randomNumber){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else ->R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResources)
    }
}