package com.example.prova2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val edtUsuario = findViewById<EditText>(R.id.campoUsuario)
        val edtSenha = findViewById<EditText>(R.id.campoSenha)
        val btnLogin = findViewById<Button>(R.id.login)

        btnLogin.setOnClickListener {
            val usuario = edtUsuario.text.toString()
            val senha = edtSenha.text.toString()

            if (usuario == "igor@gmail.com" && senha == "123") {
                Toast.makeText(this, "Login bem-sucedido", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, inicial::class.java))
                finish()
            } else {
                Toast.makeText(this, "Usuário ou senha inválidos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}