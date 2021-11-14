package com.example.lab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.example.lab3.databinding.ActivityThirdBinding

class ActivityThird : AppCompatActivity() {
    var binding: ActivityThirdBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        title = "Activity 3"
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val view: View = binding!!.root
        setContentView(view)
        binding!!.bnToSecond.setOnClickListener { finish() }
        binding!!.bnToFirst.setOnClickListener {
            setResult(RESULT_OK)
            finish()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.my_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.activity_about) {
            val intent = Intent(this@ActivityThird, ActivityAbout::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}