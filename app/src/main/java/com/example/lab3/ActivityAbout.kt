package com.example.lab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lab3.R

class ActivityAbout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        title = "Activity about"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}