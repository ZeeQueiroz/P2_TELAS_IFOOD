package com.example.prova2

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class inicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_inicial)

        setSupportActionBar(findViewById(R.id.toolbar))

        val botãoPizza1: Button = findViewById(R.id.botãoPizza1)
        botãoPizza1.setOnClickListener {
            val intent = Intent(this, detalhesProduto::class.java)
            startActivity(intent)
        }

        val botaoCupom: ImageButton = findViewById(R.id.botaoCupom)
        botaoCupom.setOnClickListener {
            val intent = Intent(this, listaCupons::class.java)
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

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.telanotificacoes -> {
                val intent = Intent(this, notificacoes::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
