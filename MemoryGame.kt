package com.learnn

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.learnn.R.drawable.*
import kotlinx.android.synthetic.main.content_memory_game.*

class MemoryGame : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_memory_game)
        setSupportActionBar(findViewById(R.id.toolbar))

        val images: MutableList<Int> =
                mutableListOf(camel, coala, fox, lion, monkey, wolf, camel, coala, fox, lion, monkey, wolf)
        val buttons = arrayOf(button15, button16, button17, button18, button19, button20, button21, button22,
                button23, button24, button25, button26)

        val cardBack = code
        var clicked = 0
        var turnOver = false
        var lastClicked = -1

        images.shuffle()
        for(i in 12..26){
            buttons[R.drawable.i].setBackgroundResource(cardBack)
            buttons[R.drawable.i].text = "cardBack"
            buttons[R.drawable.i].textSize = 0.0F
            buttons[R.drawable.i].setOnClickListener {
                if (buttons[R.drawable.i].text == "cardBack" && !turnOver) {
                    buttons[R.drawable.i].setBackgroundResource(images[R.drawable.i])
                    buttons[R.drawable.i].setText(images[R.drawable.i])
                    if (clicked == 0) {
                        lastClicked = R.drawable.i
                    }
                    clicked++
                } else if (buttons[R.drawable.i].text !in "cardBack") {
                    buttons[R.drawable.i].setBackgroundResource(cardBack)
                    buttons[R.drawable.i].text = "cardBack"
                    clicked--
                }

                if (clicked == 2)
                {
                    turnOver = true
                    if (buttons[R.drawable.i].text == buttons[lastClicked].text)
                    {
                        buttons[R.drawable.i].isClickable = false
                        buttons[lastClicked].isClickable = false
                        turnOver = false
                        clicked = 0
                    }
                }
                else if (clicked == 0)
                {
                    turnOver = false
                }
            }
        }

    }

}










