package com.example.kursovaya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class LaunchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch)
        var timer = object :CountDownTimer(3000, 1000)
        {
            override fun onTick(p0: Long) {//Таймер

            }

            override fun onFinish() {
                var intent = Intent(this@LaunchActivity, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
            }
        timer.start()
        }
    }
