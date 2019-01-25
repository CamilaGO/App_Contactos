package com.example.camila.lab3.Logic

class Contacto(private val name: String, private val phone: String, private val mail: String){
    //Los parametros del constructor anterior son los atributos  y los getters los crea kotlin automaticamente

    //Funcion que devuelve solo el nombre del contacto
    override fun toString(): String{
        return this.name
    }
    fun getName(): String{
        return this.name
    }
    fun getPhone(): String{
        return this.phone
    }
    fun getMail(): String{
        return this.mail
    }
}