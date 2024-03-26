package com.chusdevil.listanuevapantalla

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), ListaAdapter.ClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lista = findViewById<RecyclerView>(R.id.rvLista)
        val adapter = ListaAdapter(this)
        lista.layoutManager = LinearLayoutManager(this)
        lista.adapter = adapter


    }

    override fun onClick(elementoTexto: String, posicion: Int) {

        val intent = Intent(this, PantallaNueva::class.java)
        intent.putExtra("elemento", elementoTexto)
        intent.putExtra("posicion", posicion.toString())
        startActivity(intent)

    }
}




