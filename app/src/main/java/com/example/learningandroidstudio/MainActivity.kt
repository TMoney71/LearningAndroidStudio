package com.example.learningandroidstudio


import android.content.Intent
import android.graphics.Point
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Display
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout


private lateinit var display: Display
private var dx: Float = 0.0f
private var dy: Float = 0.0f
private lateinit var size: Point


//@Suppress("DEPRECATION")

class MainActivity : AppCompatActivity() {


//    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        size = Point()
//        display = windowManager.defaultDisplay
//        display.getSize(size)


        val pageone = findViewById<ImageButton>(R.id.Grass)
        pageone.setOnClickListener {
            intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)};


        }
//        override fun Ontouch(view: View, motionEvent: MotionEvent): Boolean {
//            when (motionEvent.getAction()) {
//                motionEvent.ACTION_DOWN -> {
//                    dx = view.getX() - motionEvent.getRawX()
//                    dy = view.getY() - motionEvent.getRawY()
//                }
//                motionEvent.ACTION_MOVE -> {
//                    view_touch.animate()
//                        .x(motionEvent.rawX + dx)
//                        .y(motionEvent.rawY + dy)
//                        .setDuration(0)
//                        .start()
//                    }
//                motionEvent.ACTION_DOWN -> {
//                    view_touch.animate()
//                        .x(left_margin_guideline.getLeft().toFloat())
//                        .y(top_margin_guideline.getTop().toFloat())
//                        .setDuration(250)
//                        .start()
//                }
//                else -> {
//                    return false
//                    }
//                }
//            return true
//            }
    }
