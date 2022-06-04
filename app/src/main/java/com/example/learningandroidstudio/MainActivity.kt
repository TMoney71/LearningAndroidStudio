package com.example.learningandroidstudio

import android.content.Intent
import android.graphics.Point
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.ImageButton



abstract class MainActivity : AppCompatActivity(), View.OnTouchListener {

    private lateinit var display : Display
    private  var dx : Float = 0.0f
    private  var dy : Float = 0.0f
    private lateinit var size : Point

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pageone = findViewById<ImageButton>(R.id.Grass)
        pageone.setOnClickListener {
            intent = Intent(this, MainActivity2::class.java)
            startActivity(intent);

        size = Point()
        display = windowManager.defaultDisplay
        display.getSize(size)
        }

    override fun Ontouch(view: View, motionEvent: MotionEvent): Boolean {
        when (motionEvent.getAction()) {
            motionEvent.ACTION_DOWN -> {
                dx = view.getX() - motionEvent.getRawX()
                dy = view.getY() - motionEvent.getRawY()

            }
            motionEvent.ACTION_MOVE -> {
                view_touch.animate()
                    .x(motionEvent.rawX + dx )
                    .y(motionEvent.rawY + dy)
                    .setDuration(0)
                    .start()
            }
            motionEvent.ACTION_DOWN -> {
                view_touch.animate()
                    .x(left_margin_guideline.getLeft().toFloat())
                    .y(top_margin_guideline.getTop().toFloat())
                    .setDuration(250)
                    .start()
            }
            else -> {
                return false
            }
        }
        return true
    }
    }
}