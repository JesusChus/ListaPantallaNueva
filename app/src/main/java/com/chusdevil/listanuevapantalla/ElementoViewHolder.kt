package com.chusdevil.listanuevapantalla

import android.view.View
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView.ViewHolder

open class ElementoViewHolder(view: View) : ViewHolder(view) {

    val elementoTexto = view.findViewById<TextView>(R.id.tvElemento)

    fun insertarDatos(valor: String) {
        elementoTexto.text = valor


    }

}