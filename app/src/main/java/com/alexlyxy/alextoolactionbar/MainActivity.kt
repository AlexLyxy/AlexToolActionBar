package com.alexlyxy.alextoolactionbar

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "AlexLyxy"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // if(item.itemId == android.R.id.home) finish()         If One Item
        when (item.itemId) {
           // android.R.id.home -> finish()
            android.R.id.home -> {
                Toast.makeText(this, "HOME", Toast.LENGTH_LONG).show()
            }
            R.id.sync -> {
                Toast.makeText(this, "SYNC", Toast.LENGTH_LONG).show()
            }
            R.id.search -> {
                Toast.makeText(this, "SEARCH", Toast.LENGTH_LONG).show()

            }
            R.id.save -> {
                Toast.makeText(this, "SAVE", Toast.LENGTH_LONG).show()

            }
            R.id.delete -> {
                Toast.makeText(this, "DELETE", Toast.LENGTH_LONG).show()
            }
        }
        return true
    }
}