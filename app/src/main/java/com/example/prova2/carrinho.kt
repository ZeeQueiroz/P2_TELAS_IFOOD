package com.example.prova2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class carrinho : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_carrinho)

        val botaoFinalizar: Button = findViewById(R.id.botaoFinalizar)
        botaoFinalizar.setOnClickListener {
            val intent = Intent(this, checkout::class.java)
            startActivity(intent)
        }
    }
}