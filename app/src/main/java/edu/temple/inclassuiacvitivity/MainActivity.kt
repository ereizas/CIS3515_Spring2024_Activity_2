package edu.temple.inclassuiacvitivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner = findViewById<Spinner>(R.id.spinner)
        val displayTextView = findViewById<TextView>(R.id.textDisplay)
        val numArray = Array(50) {2*(it+1)}
        /*for(i in 0..49)
        {
            Log.d("Title","${numberArray[i]}")
        }*/
        spinner.adapter = ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,numArray)

        // TODO Step 3: Change TextView's text size to the number selected in the Spinner */
        //spinner.onItemSelectedListener = object: ...

    }
}