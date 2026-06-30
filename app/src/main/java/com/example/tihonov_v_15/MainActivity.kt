package com.example.tihonov_v_15

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnLogout: Button
    private lateinit var btnOnline: Button
    private lateinit var btnSnapshot: Button
    private lateinit var btnSettings: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogout = findViewById(R.id.btnLogout)
        btnOnline = findViewById(R.id.btnOnline)
        btnSnapshot = findViewById(R.id.btnSnapshot)
        btnSettings = findViewById(R.id.btnSettings)

        btnLogout.setOnClickListener {
            Toast.makeText(this, "Выход из системы", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, LoginActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }

        btnOnline.setOnClickListener {
            Toast.makeText(this, "Онлайн-консультация", Toast.LENGTH_SHORT).show()
        }

        // ОТКРЫВАЕМ СТРАНИЦУ КАМЕРЫ
        btnSnapshot.setOnClickListener {
            val intent = Intent(this, CameraActivity::class.java)
            startActivity(intent)
        }

        btnSettings.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}