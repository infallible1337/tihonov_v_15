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

        // Закрыть камеру
        btnClose.setOnClickListener {
            finish()
        }

        // Переворот камеры (просто анимация/уведомление)
        btnFlip.setOnClickListener {
            // Просто показываем, что кнопка работает
        }

        // Кнопка съемки (просто эффект)
        btnCapture.setOnClickListener {
            // Просто показываем, что кнопка работает
        }
    }
}