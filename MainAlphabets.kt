package com.learnn

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class MainAlphabets : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_alphabets)
        var alpha = Array<String>(26) { " " }
        var j = 65
        for (i in 0..25) {
           alpha[i] = j.toChar().toString()
            j++
        }

        val gridview: GridView = findViewById<View>(R.id.gridview) as GridView
        var adapter = ArrayAdapter<String>(applicationContext, android.R.layout.simple_dropdown_item_1line, alpha)
        gridview.adapter= adapter

        gridview.setOnItemClickListener{ adapterView, view, i, l ->
            var intent = Intent(applicationContext, Alphabets::class.java)
                intent.putExtra("name", alpha[i])
                startActivity(intent)
        }

    }
}

