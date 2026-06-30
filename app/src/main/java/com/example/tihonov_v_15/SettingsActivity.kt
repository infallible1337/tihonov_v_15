package com.example.tihonov_v_15

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {

    private lateinit var chkPolicyValidity: CheckBox
    private lateinit var chkActivePromotions: CheckBox
    private lateinit var chkNotifyResults: CheckBox
    private lateinit var btnResetSettings: Button
    private lateinit var btnBackMain: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        chkPolicyValidity = findViewById(R.id.chkPolicyValidity)
        chkActivePromotions = findViewById(R.id.chkActivePromotions)
        chkNotifyResults = findViewById(R.id.chkNotifyResults)
        btnResetSettings = findViewById(R.id.btnResetSettings)
        btnBackMain = findViewById(R.id.btnBackMain)

        btnResetSettings.setOnClickListener {
            chkPolicyValidity.isChecked = true
            chkActivePromotions.isChecked = true
            chkNotifyResults.isChecked = false
            Toast.makeText(this, "Настройки сброшены", Toast.LENGTH_SHORT).show()
        }

        btnBackMain.setOnClickListener {
            finish()
        }
    }
}