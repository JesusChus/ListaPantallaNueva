package com.chusdevil.listanuevapantalla

import android.os.Bundle
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity


class PantallaNueva : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_pantalla_nueva)
        val texto = findViewById<TextView>(R.id.nuevaPantalla)
        val todo = intent.extras?.getString("elemento")
        val numero = intent.extras?.getString("posicion")
        texto.text = "$todo $numero"


    }
}