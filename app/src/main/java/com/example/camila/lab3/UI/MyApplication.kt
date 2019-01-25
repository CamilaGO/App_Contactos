package com.example.camila.lab3.UI

import android.app.Application
import com.example.camila.lab3.Logic.Contacto

class MyApplication: Application(){
    //Se instancia una lista de objetos tipo contacto y un int que tendra el numero de contacto elegio en el main
    val contactos: ArrayList<Contacto> = arrayListOf(Contacto("Camila", "55249338", "gon18398@uvg.edu.gt"))
    private var choosen: Int = 0

    fun add(persona: Contacto){
        contactos.add(persona)
    }

    fun setChoosen(lugar: Int){
        this.choosen=lugar
    }

    //Metodosque devuelven los datos del usuario seleccionado
    fun getName():String{
        var persona: Contacto = contactos.get(choosen)
        var nombre: String = persona.getName()
        return nombre
    }
    fun getPhone():String{
        var persona: Contacto = contactos.get(choosen)
        var phone: String = persona.getPhone()
        return phone
    }

    fun getMail():String{
        var persona: Contacto = contactos.get(choosen)
        var mail: String = persona.getMail()
        return mail
    }
}