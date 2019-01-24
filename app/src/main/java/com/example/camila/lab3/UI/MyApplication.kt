package com.example.camila.lab3.UI

import android.app.Application
import com.example.camila.lab3.Logic.Contacto

class MyApplication: Application(){
    //Se instancia una lista de objetos tipo contacto
    val contactos: ArrayList<Contacto> = arrayListOf(Contacto("Camila", "55249338", "gon18398@gmail.com"))

    fun add(persona: Contacto){
        contactos.add(persona)
    }
}