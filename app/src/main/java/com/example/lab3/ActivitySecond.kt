package com.example.lab3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.example.lab3.databinding.ActivitySecondBinding

class ActivitySecond : AppCompatActivity() {
    var binding: ActivitySecondBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        title = "Activity 2"
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val view: View = binding!!.root
        setContentView(view)
        binding!!.bnToFirst.setOnClickListener { finish() }
        binding!!.bnToThird.setOnClickListener {
            val intent = Intent(this@ActivitySecond, ActivityThird::class.java)
            startActivityForResult(intent, 1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                finish()
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.my_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.activity_about) {
            val intent = Intent(this@ActivitySecond, ActivityAbout::class.java)
            startActivity(intent)
        }
        return super.onOptionsItemSelected(item)
    }
}