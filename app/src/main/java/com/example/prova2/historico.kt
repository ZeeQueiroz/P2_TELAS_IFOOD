package com.example.prova2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class historico : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_historico)

        val telaperfil: ImageButton = findViewById(R.id.telaperfil)
        telaperfil.setOnClickListener {
            val intent = Intent(this, perfil::class.java)
            startActivity(intent)
        }

        val telabusca: ImageButton = findViewById(R.id.telabusca)
        telabusca.setOnClickListener {
            val intent = Intent(this, pesquisa::class.java)
            startActivity(intent)
        }

        val telaInicio: ImageButton = findViewById(R.id.telaInicio)
        telaInicio.setOnClickListener {
            val intent = Intent(this, inicial::class.java)
            startActivity(intent)
        }

        val botaoComprarDnv = findViewById<Button>(R.id.botaoComprarDnv)
        botaoComprarDnv.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Este restaurante está fechado no momento")
                .setMessage("Mas você pode olhar o cardápio à vontade e voltar quando ele estiver aberto.")
                .setNeutralButton("OK") { dialog, _ ->
                    dialog.dismiss()
                }
                .show()
        }
    }
}
