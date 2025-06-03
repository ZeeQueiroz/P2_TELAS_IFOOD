package com.example.prova2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class pedidoConfirmado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_pedido_confirmado)

        val botaoVoltar: Button = findViewById(R.id.botaoVoltar)
        botaoVoltar.setOnClickListener {
            val intent = Intent(this, inicial::class.java)
            startActivity(intent)
        }
    }
    fun carregarImagem(view: View) {
        Toast.makeText(this, "Carregando imagem...", Toast.LENGTH_SHORT).show()
        val imagemCarregada = findViewById<ImageView>(R.id.imagemCarregada)
        val url = "https://upload.wikimedia.org/wikipedia/commons/5/56/Check_icon.png?uselang=pt-br"
        Glide.with(this).load(url).into(imagemCarregada)
    }
}