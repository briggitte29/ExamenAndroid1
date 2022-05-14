package com.briggitte.tarea.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.briggitte.tarea.R

class Solucion1Fragment : Fragment(R.layout.fragment_solucion1) {

    private lateinit var boton:Button
    private lateinit var edit:EditText
    private lateinit var resultado:TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        boton=view.findViewById(R.id.btnP)
        edit=view.findViewById(R.id.txtCantidad)
        resultado=view.findViewById(R.id.txtRes)

        boton.setOnClickListener(object:View.OnClickListener{
            override fun onClick(p0: View?) {
                val paga=proceso(edit.text.toString().toInt())
                resultado.text=paga.toString()
            }

        })

    }

    private fun proceso(cantidad:Int): Int {
        return if(cantidad<5){
            cantidad*800
        }else{
            cantidad*700
        }

    }

}