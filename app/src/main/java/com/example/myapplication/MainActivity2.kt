package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Spinner
import androidx.constraintlayout.solver.state.State
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var layout = findViewById<ConstraintLayout>(R.id.CONTAINER)

        var spinner = findViewById<Spinner>(R.id.spinner)

        var btn = findViewById<Button>(R.id.clr_button)

        btn.setOnClickListener(View.OnClickListener {
            var color: String = spinner.selectedItem.toString()
            when(color){
                "RED" -> layout.setBackgroundColor(Color.RED)
                "BLUE" -> layout.setBackgroundColor(Color.BLUE)
                "YELLOW" -> layout.setBackgroundColor(Color.YELLOW)
                "GREEN" -> layout.setBackgroundColor(Color.GREEN)
            }
        })


    }
}