package se.gritacademy.onlyactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        findViewById<Button>(R.id.button).setOnClickListener { v ->
            val intent = Intent(this, MainActivity3::class.java)
           // intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            //intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
            this.startActivity(intent)
        }
    }
}