package com.example.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var diceImage:ImageView
    lateinit var rollButton: Button
    lateinit var dice2Image:ImageView
    lateinit var buttonClear:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //MARK: -References to the Layout Activity
         diceImage = findViewById(R.id.dice_image)
        rollButton = findViewById(R.id.roll_button)
        dice2Image = findViewById(R.id.dice2_image)
        buttonClear =findViewById(R.id.clearButton)


        rollButton.setOnClickListener{
            rollDice(diceImage)
            rollDice(dice2Image)
        }

        buttonClear.setOnClickListener {
            clearAll(diceImage)
            clearAll(dice2Image)
        }




    }



    private fun rollDice(imageView: ImageView){
        Toast.makeText(this,"button clicked",
            Toast.LENGTH_SHORT).show()
        val randomNum:Int =(1..6).random()
        val drawableResource = when(randomNum){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        imageView.setImageResource(drawableResource)

    }

    private fun clearAll(imageView: ImageView){
        imageView.setImageResource(R.drawable.empty_dice)
    }




}