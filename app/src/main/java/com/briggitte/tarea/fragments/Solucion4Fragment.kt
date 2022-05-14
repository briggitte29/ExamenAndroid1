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

class Solucion4Fragment : Fragment(R.layout.fragment_solucion4) {

    private lateinit var numero:EditText
    private lateinit var suma:Button
    private lateinit var res:TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        numero= view.findViewById(R.id.txtNumenS)
        suma= view.findViewById(R.id.btnSumar)
        res= view.findViewById(R.id.txtSuma)

        suma.setOnClickListener {
            val sumaDigitos=sumaD(numero.text.toString().toInt())
            res.text=sumaDigitos.toString()
        }

    }

    private fun sumaD(num:Int):Int{
        var calculo=0
        if(numero.text.length!=4){
            Toast.makeText(context, "Solo numeros de 4 digitos", Toast.LENGTH_SHORT).show()
            numero.hasFocus()
        }else{
            val u=num%10
            val d=((num/10)%10)
            val c=(((num/10)/10)%10)
            val m=(((num/10)/10)/10)
            calculo=u+d+c+m
        }

        return calculo
    }


}

