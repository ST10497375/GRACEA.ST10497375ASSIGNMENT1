package za.co.varsitycollege.graceast10497375assignment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

            val txeTimeEditText = findViewById<EditText>(R.id.txeTimeEditText)

            val btnBeginButton = findViewById<Button>(R.id.btnBeginButton)

            val btnRestartButton = findViewById<Button>(R.id.btnRestartButton)

            val txeTextView = findViewById<TextView>(R.id.txeTextView)

        btnBeginButton.setOnClickListener {
            val message = when (txeTimeEditText.text.toString()) {
                "morning" -> "start the day with some avocado toast and a warm cup of coffee"
                "midmorning" -> "time for a light snack! Have some yogurt or fruit"
                "afternoon" -> "lunch time! Have quesadilla or a warm bowl of ramen"
                "midafternoon" -> "have something small for some extra fuel! have a sandwich or a sweet donut"
                "dinner" -> "what a day! have some alfredo pasta or some stir-fried rice to fuel such a long day"
                "dessert" -> "time for a sweet treat! Have a piece of cake or a cold bowl of ice cream"

                else -> "error. please enter an accepted prompt"
            }
            txeTextView.text = message









                

        }

        btnRestartButton.setOnClickListener{
            txeTimeEditText.text.clear()
            txeTextView.text = ""
        }
    }
}