package com.galaxe.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    lateinit var textView: TextView
    lateinit var bt1: Button
    lateinit var bt2: Button
    lateinit var bt3: Button
    lateinit var bt4: Button
    lateinit var bt5: Button
    lateinit var bt6: Button
    lateinit var bt7: Button
    lateinit var bt8: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)

        bt1 = findViewById(R.id.fade_in)
        bt2 = findViewById(R.id.fade_out)
        bt3 = findViewById(R.id.zoom_in)
        bt4 = findViewById(R.id.zoom_out)
        bt5 = findViewById(R.id.slide_down)
        bt6 = findViewById(R.id.slide_up)
        bt7 = findViewById(R.id.bounce)
        bt8 = findViewById(R.id.rotate)

        bt1.setOnClickListener {
            textView.visibility = View.VISIBLE
            val animation = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            textView.startAnimation(animation)
        }
        bt2.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.fade_out)
            textView.startAnimation(animation)
            Handler().postDelayed({
                textView.visibility = View.GONE
            }, 1000)
        }
        bt3.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
            textView.startAnimation(animation)
        }
        bt4.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
            textView.startAnimation(animation)
        }
        bt5.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.slide_down)
            textView.startAnimation(animation)
        }
        bt6.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.slide_up)
            textView.startAnimation(animation)
        }
        bt7.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
            textView.startAnimation(animation)
        }
        bt8.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.rotate)
            textView.startAnimation(animation)
        }

    }

}