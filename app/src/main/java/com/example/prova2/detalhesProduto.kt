package com.example.prova2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class detalhesProduto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detalhes_produto)

        val botaoAdicionar: Button = findViewById(R.id.botaoAdicionar)
        botaoAdicionar.setOnClickListener {
            val intent = Intent(this, carrinho::class.java)
            startActivity(intent)
        }

    }
}