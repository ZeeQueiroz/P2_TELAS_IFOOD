package com.example.prova2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class perfil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_perfil)

        val botaoFavorito: Button = findViewById(R.id.botaoFavorito)
        botaoFavorito.setOnClickListener {
            val intent = Intent(this, favoritos::class.java)
            startActivity(intent)
        }

        val botaoFormasPgto: Button = findViewById(R.id.botaoFormasPgto)
        botaoFormasPgto.setOnClickListener {
            val intent = Intent(this, formasPgto::class.java)
            startActivity(intent)
        }

        val botaoConfiguracao: Button = findViewById(R.id.botaoConfiguracao)
        botaoConfiguracao.setOnClickListener {
            val intent = Intent(this, configuracoes::class.java)
            startActivity(intent)
        }

        val botaoSair: Button = findViewById(R.id.botaoSair)
        botaoSair.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val telaInicio: ImageButton = findViewById(R.id.telaInicio)
        telaInicio.setOnClickListener {
            val intent = Intent(this, inicial::class.java)
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