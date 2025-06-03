package com.example.prova2

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class listaCupons : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lista_cupons)

        val arrayAdapter: ArrayAdapter<*>
        val cupons = arrayOf(
            "🎁 R$10 de desconto - Pedido mínimo R$50",
            "🚚 Frete grátis em pedidos acima de R$30",
            "🔥 20% off na primeira compra",
            "🍕 Cupom PIZZOU - 15% na categoria Pizzas",
            "🍔 Cupom LANCHOU - 10% em lanches",
            "💸 R$5 de volta no próximo pedido",
            "🎉 Desconto surpresa até R$20",
            "🛍️ Cupom MERCADO - 12% em mercados",
            "❤️ Leve 2 e pague 1 em parceiros selecionados",
            "⭐ 25% off hoje - Válido até as 23h59",
            "🤑 R$15 OFF em pedidos acima de R$60",
            "🎂 Cupom ANIVERSARIO - 30% no mês do seu aniversário"
        )
        val lista = findViewById<ListView>(R.id.lista)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, cupons)
        lista.adapter = arrayAdapter

    }
}