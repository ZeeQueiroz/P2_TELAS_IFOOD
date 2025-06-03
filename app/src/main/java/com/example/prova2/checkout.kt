package com.example.prova2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class checkout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_checkout)

        val botaoConfirmarPedido: Button = findViewById(R.id.botaoConfirmarPedido)
        botaoConfirmarPedido.setOnClickListener {
            val intent = Intent(this, carregamento::class.java)
            startActivity(intent)
        }

        val botaoCancelamento: Button = findViewById(R.id.botaoCancelamento)

        botaoCancelamento.setOnClickListener {
            val dialogBuilder = AlertDialog.Builder(this)
            dialogBuilder.setTitle("Cancelar Pedido")
            dialogBuilder.setMessage("Tem certeza de que deseja cancelar o pedido e voltar para a tela inicial?")

            dialogBuilder.setPositiveButton("Sim") { dialog, _ ->
                val intent = Intent(this, inicial::class.java)
                startActivity(intent)
                finish()
            }

            dialogBuilder.setNegativeButton("Não") { dialog, _ ->
                dialog.dismiss()
            }

            val alertDialog = dialogBuilder.create()
            alertDialog.show()
        }
    }
}