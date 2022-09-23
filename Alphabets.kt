package com.learnn

import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Alphabets : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alphabets)
        var name = intent.getStringExtra("name")?.toLowerCase()
        Toast.makeText(applicationContext, name, Toast.LENGTH_LONG).show()

        var id = resources.getIdentifier(name, "drawable", packageName)
        val imageView = findViewById<View>(R.id.imageView) as ImageView
        imageView.setImageResource(id)


        var mid = resources.getIdentifier(name, "raw", packageName)
        var mp = MediaPlayer.create(applicationContext, mid)
        mp.start()


    }


}

