package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(findViewById(R.id.tvBoxOne), findViewById(R.id.tvBoxTwo),
                findViewById(R.id.tvBoxThree), findViewById(R.id.tvBoxFour),
                findViewById(R.id.tvBoxFive), findViewById(R.id.constrainLayout),
                findViewById(R.id.btnRed), findViewById(R.id.btnYellow),
                findViewById(R.id.btnGreen))

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }

    }

    private fun makeColored(view: View) {
        when (view.id) {
            R.id.tvBoxOne -> view.setBackgroundColor(Color.DKGRAY)
            R.id.tvBoxTwo -> view.setBackgroundColor(Color.GRAY)

            R.id.tvBoxThree -> view.setBackgroundColor(resources.getColor(android.R.color.holo_green_light))
            R.id.tvBoxFour -> view.setBackgroundColor(resources.getColor(android.R.color.holo_green_dark))
            R.id.tvBoxFive -> view.setBackgroundColor(resources.getColor(android.R.color.holo_green_light))

            R.id.btnRed -> findViewById<TextView>(R.id.tvBoxThree).setBackgroundResource(R.color.my_red)
            R.id.btnYellow -> findViewById<TextView>(R.id.tvBoxFour).setBackgroundResource(R.color.my_yellow)
            R.id.btnGreen -> findViewById<TextView>(R.id.tvBoxFive).setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}