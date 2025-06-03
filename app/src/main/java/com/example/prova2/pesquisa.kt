package com.example.prova2

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.SearchView
import androidx.appcompat.app.AppCompatActivity

class pesquisa : AppCompatActivity() {

    lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesquisa)

        val searchView = findViewById<SearchView>(R.id.pesquisa)
        val lista = findViewById<ListView>(R.id.ListaLojas)

        val lugares = arrayOf(
            "Pizzaria do Zé",
            "Smash Burguer",
            "Ragazzo",
            "KFC",
            "Habib's",
            "T-Bone",
            "Cantina Pátio Café",
            "Disco Voador",
            "Nord Sorvetes",
            "Pastel Bauru",
            "Açaiteria Tropical",
            "Subway",
            "Café da Vila",
            "Bauru Sushi",
            "Pão de Açúcar - Jd Estoril",
            "Extra - Bauru",
            "Estância Grill",
            "Coco Bambu",
            "Outback",
            "Pizzaria Villa Pizza"
        )

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, lugares)
        lista.adapter = adapter

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                adapter.filter.filter(newText)
                return true
            }
        })
    }
}
