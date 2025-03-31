package za.co.varsitycollege.graceast10497375assignment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Scanner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.txeFoodie)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

            val TimeeditText = findViewById<EditText>(R.id.TimeeditText)

            val BeginButton = findViewById<Button>(R.id.BeginButton)

            val RestartButton = findViewById<Button>(R.id.RestartButton)

            fun suggestmeal(hour: Int) {
                if (hour in 6..9) {//Morning 6am to 9am
                    println("Morning(6am to 9am): How about a hearty breakfast like scrambled eggs or avocado toast?")
                }
                if (hour in 10..11) {//midmorning:10am to 11am
                    println("A light snack like a smoothie or a granola bar would be great!")
                }
                if (hour in 12..14) {//afternoon: 12pm to 14pm
                    println("It's lunchtime! A sandwich or a burger would be perfect to refuel!")
                }
                if (hour in 15..16) {//midafternoon: 3pm to 4pm
                    println("How about some nuts or yogurt?")
                }
                if (hour in 17..19) {//dinner: 5pm to 7pm
                    println("What a day! Some butter chicken or lasagne would make a great dinner!")
                }
                if (hour in 20..22) {//dessert: 8pm to 10pm
                    println("treat yourself to some ice cream or chocolate cake")
                }

            }

            fun main() {
                val scanner = Scanner(System.`in`)

                println("Enter the time in hours (0-23):")
                val inputTime = scanner.nextInt()

                if(inputTime in 0..23) {
                    suggestmeal(inputTime)
                } else {
                    println("Invalid time. Please enter a value between 0 and 23")
                }
            }

            


        }
    }
}