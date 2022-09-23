package com.learnn

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Colors : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_colors)

            val click1 =
                    findViewById<View>(R.id.button8) as Button
            val click2 =
                    findViewById<View>(R.id.button9) as Button
            val click3 =
                    findViewById<View>(R.id.button10) as Button
            val click4 =
                    findViewById<View>(R.id.button11) as Button
            val click5 =
                    findViewById<View>(R.id.button12) as Button
            val click6 =
                    findViewById<View>(R.id.button13) as Button
            val mp1 = MediaPlayer.create(applicationContext, R.raw.sound1)
            val mp2 = MediaPlayer.create(applicationContext, R.raw.sound2)
            val mp3 = MediaPlayer.create(applicationContext, R.raw.sound3)
            val mp4 = MediaPlayer.create(applicationContext, R.raw.sound4)
            val mp5 = MediaPlayer.create(applicationContext, R.raw.sound5)
            val mp6 = MediaPlayer.create(applicationContext, R.raw.sound6)
            val elem = View.OnClickListener { v ->
                when (v.id) {
                    R.id.button8 -> mp1.start()
                    R.id.button9 -> mp2.start()
                    R.id.button10 -> mp3.start()
                    R.id.button11 -> mp4.start()
                    R.id.button12 -> mp5.start()
                    R.id.button13 -> mp6.start()
                }
            }
            click1.setOnClickListener(elem)
            click2.setOnClickListener(elem)
            click3.setOnClickListener(elem)
            click4.setOnClickListener(elem)
            click5.setOnClickListener(elem)
            click6.setOnClickListener(elem)
        }
    }
