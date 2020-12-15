package org.vontech.bility_gradle_example

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

// MATERIAL RED 500, BLUE 500,
val COLORS = listOf("#FFFFFF", "#f44336", "#2196F3", "#FF9800")

class MainActivity : AppCompatActivity() {

    var counter = 0

    private lateinit var colorButton: Button
    private lateinit var coloredText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()

        colorButton = findViewById(R.id.colorButton)
        coloredText = findViewById(R.id.coloredText)

        colorButton.setOnClickListener {
            cycleColor()
        }
        coloredText.setBackgroundColor(Color.parseColor(COLORS[0]))
    }

    fun cycleColor() {
        counter++
        val index = counter % COLORS.size
        coloredText.setBackgroundColor(Color.parseColor(COLORS[index]))
    }

}
