package com.chusdevil.listanuevapantalla

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter


class ListaAdapter(val click: ClickListener) :
    Adapter<ElementoViewHolder>() {

    interface ClickListener {
        fun onClick(elemento: String, posicion: Int)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElementoViewHolder {
        val elementoDeXml =
            LayoutInflater.from(parent.context).inflate(R.layout.elemento_lista, parent, false)
        val elemento = ElementoViewHolder(elementoDeXml)
        return elemento
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: ElementoViewHolder, position: Int) {
        var posicion = position
        var elemento = "Elemento"
        holder.insertarDatos("$elemento $posicion")

        holder.itemView.setOnClickListener {
            click.onClick(elemento, posicion)
        }

    }


}