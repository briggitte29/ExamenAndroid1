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

class Solucion3Fragment : Fragment(R.layout.fragment_solucion3) {

    private lateinit var Numer:EditText
    private lateinit var Analizar:Button
    private lateinit var res:TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Numer= view.findViewById(R.id.txtNumenP)
        Analizar= view.findViewById(R.id.btnP)
        res= view.findViewById(R.id.txtAna)

        Analizar.setOnClickListener {
            val solucion=isPerfecto(Numer.text.toString().toInt())
            res.text=solucion
        }

    }

    private fun isPerfecto(num:Int):String{

        if(num>0){
            var con=0

            for(i in 1..num-1){
                if(num%i==0){
                    con+=i
                }
            }
            return if(con==num){
                "Numero Perfecto"
            }else{
                "No es perfecto"
            }
        }else{
            Toast.makeText(context, "Numeros mayores a 0", Toast.LENGTH_SHORT).show()
            return ""
        }
    }

}