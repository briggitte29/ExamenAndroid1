package com.briggitte.tarea.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.briggitte.tarea.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class PrincipalFragment : Fragment(R.layout.fragment_principal) {

    private lateinit var bottom:BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(savedInstanceState==null){
            activity?.supportFragmentManager!!.beginTransaction()
                .add(R.id.fragmentcontainer,Solucion1Fragment())
                .commit()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bottom=view.findViewById(R.id.bottom_navigation)

        bottom.setOnNavigationItemSelectedListener { item ->
            when(item.itemId){
                R.id.pc1 -> {
                    parentFragmentManager.beginTransaction()
                        .replace(R.id.fragmentcontainer,Solucion1Fragment()).commit()
                    true
                }
                R.id.pc2 ->{
                    activity?.supportFragmentManager!!.beginTransaction()
                        .replace(R.id.fragmentcontainer, Solucion2Fragment()).commit()
                    true
                }
                R.id.pc3 ->{
                    parentFragmentManager.beginTransaction()
                        .replace(R.id.fragmentcontainer, Solucion3Fragment()).commit()
                    true
                }
                R.id.pc4 ->{
                    parentFragmentManager.beginTransaction()
                        .replace(R.id.fragmentcontainer, Solucion4Fragment()).commit()
                    true
                }
                else -> false
            }
        }
    }
}