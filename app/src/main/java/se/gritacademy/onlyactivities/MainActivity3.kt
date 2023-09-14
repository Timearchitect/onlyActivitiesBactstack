package se.gritacademy.onlyactivities

import android.app.TaskStackBuilder
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        findViewById<Button>(R.id.button3).setOnClickListener { v ->

            val intent = Intent()
            intent.setClass(this, MainActivity::class.java)
            val stackBuilder: TaskStackBuilder = TaskStackBuilder.create(this)
            stackBuilder.addNextIntentWithParentStack(intent)
            stackBuilder.startActivities(Bundle())
        }


    }
}