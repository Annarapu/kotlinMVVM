package com.example.kotlinsample

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.kotlinsample.databinding.ActivityMainBinding

/**
 * Created by Annarapu Santhosh Reddy on 23/1/20.
 * Sureify Labs Technology Pvt Ltd
 * santhosh.annarapu@sureify.com
 */
class MainActivity : AppCompatActivity() {
   private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        /*
        * */
        /*val tvWelcome: TextView = findViewById(R.id.tv_welcome_greeting);
        tvWelcome.text = "Started Kotlin..!" // tvWelcome.setText("Started Kotlin..!")*/
    }

    public fun onGetStared() {
        activityMainBinding.tvWelcomeGreeting.text = "Started Kotlin..!"
    }

    private fun changeText() {
        val btnGetStarted: Button = findViewById(R.id.btn_get_started)
        btnGetStarted.setOnClickListener {
            val tvWelcome: TextView = findViewById(R.id.tv_welcome_greeting);
            tvWelcome.text = "Started Kotlin..!" // tvWelcome.setText("test")
        }
    }
}
