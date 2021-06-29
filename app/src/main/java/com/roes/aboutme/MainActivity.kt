package com.roes.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDone: Button = findViewById(R.id.button_Done)

        btnDone.setOnClickListener(){
            val txtResult: TextView = findViewById(R.id.textView_Result)
            val txtName: TextView = findViewById(R.id.nickname_edit)

            txtResult.text = txtName.text.toString()
            txtResult.visibility = View.VISIBLE
            btnDone.visibility = View.GONE
            txtName.visibility = View.GONE

        }
    }
}