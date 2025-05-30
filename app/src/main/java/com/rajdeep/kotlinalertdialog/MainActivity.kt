package com.rajdeep.kotlinalertdialog

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            showAlert()
        }

    }
    private fun showAlert(){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Snapchat")
            .setMessage("Do you want to uninstall the snapchat?")
            .setPositiveButton("Yes") {dialog , whicj ->
            Toast.makeText(this,"The app is successfully uninstalled",Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No") { dialog , which ->
                dialog.dismiss()
            }

        val alertdialog : AlertDialog = builder.create()
        alertdialog.show()

    }
}