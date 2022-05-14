package com.briggitte.tarea.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.briggitte.tarea.R

class Solucion2Fragment : Fragment(R.layout.fragment_solucion2) {

    private lateinit var numero: EditText
    private lateinit var botton:Button
    private lateinit var txtuni:TextView
    private lateinit var txtdesc:TextView


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        botton= view.findViewById(R.id.btnM)
        numero= view.findViewById(R.id.txtNum)
        txtuni= view.findViewById(R.id.uni)
        txtdesc= view.findViewById(R.id.dec)

        botton.setOnClickListener {
            componen(numero.text.toString().toInt())
        }

    }

    private fun componen(num:Int){
        if(numero.text.length!=3){
            Toast.makeText(context, "Solo numero de 3 digitos", Toast.LENGTH_SHORT).show()
            numero.hasFocus()
        }else{
            val u=num%10
            val d=((num/10)%10).toInt()
            val c=(((num/10)/10)).toInt()
            txtuni.text="Unidades: ${u.toString()}"
            txtdesc.text="Decena: ${d.toString()}"
        }

    }

}