package com.example.camila.lab3.UI

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.camila.lab3.Logic.Contacto
import com.example.camila.lab3.MainActivity
import com.example.camila.lab3.R
import kotlinx.android.synthetic.main.activity_crear.*

class CrearActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear)

    }

    //Boton para ver activity de nuevo contacto
    fun onClick_Home(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    //Boton para crear el contacto
    fun onClick_Add(view: View){
        //Se guardan los datos de los inputs
        val editTextName = nameInput.text.toString()
        val editTextPhone = phoneInput.text.toString()
        val editTextMail = emailInput.text.toString()
        //Se crea un contacto con los datos recibidos
        val newContact = Contacto(editTextName, editTextPhone, editTextMail)
        //Se agrega el contacto nuevo al arrayList de MyApplication
        var context: MyApplication = applicationContext as MyApplication
        context.add(newContact)
        //Se muestra el toast de la acción exitosa
        
    }
}
