package com.example.tihonov_v_15

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CameraActivity : AppCompatActivity() {

    private lateinit var btnClose: Button
    private lateinit var btnFlip: Button
    private lateinit var btnCapture: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)

        btnClose = findViewById(R.id.btnClose)
        btnFlip = findViewById(R.id.btnFlip)
        btnCapture = findViewById(R.id.btnCapture)

        btnClose.setOnClickListener {
            finish()
        }

        btnFlip.setOnClickListener {
            // Переворот камеры (заглушка)
        }

        btnCapture.setOnClickListener {
            // Съемка (заглушка)
        }
    }
}