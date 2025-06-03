package com.example.prova2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class favoritos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_favoritos)

        val telaInicio: ImageButton = findViewById(R.id.telaInicio)
        telaInicio.setOnClickListener {
            val intent = Intent(this, inicial::class.java)
            startActivity(intent)
        }

        val telaperfil: ImageButton = findViewById(R.id.telaperfil)
        telaperfil.setOnClickListener {
            val intent = Intent(this, perfil::class.java)
            startActivity(intent)
        }

        val telahistorico: ImageButton = findViewById(R.id.telahistorico)
        telahistorico.setOnClickListener {
            val intent = Intent(this, historico::class.java)
            startActivity(intent)
        }

        val telabusca: ImageButton = findViewById(R.id.telabusca)
        telabusca.setOnClickListener {
            val intent = Intent(this, pesquisa::class.java)
            startActivity(intent)
        }
    }
}