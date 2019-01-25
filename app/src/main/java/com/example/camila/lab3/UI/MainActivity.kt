package com.example.camila.lab3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.camila.lab3.Logic.Contacto
import com.example.camila.lab3.UI.CrearActivity
import com.example.camila.lab3.UI.MyApplication
import com.example.camila.lab3.UI.VerActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Se obtiene y guarda la lista de contactos
        var context: MyApplication = applicationContext as MyApplication
        //Se instancia el listview y su adaptador
        val listViewPeople = findViewById<ListView>(R.id.listview_people)
        var adapter: ArrayAdapter<Contacto> = ArrayAdapter<Contacto>(this, R.layout.listview_item, context.contactos)
        listViewPeople.setAdapter(adapter)

        //Si presiona a un contacto se direcciona a la activity con la informacion del mismo
        listViewPeople.setOnItemClickListener { parent, view, position, id ->
            //Se agrega la opcion elegida y se muestra un mensaje
            val mostrar = Intent(this, VerActivity::class.java)
            context.setChoosen(position)
            startActivity(mostrar)
        }


    }
    //Boton para ver activity de nuevo contacto
    fun onClick_Crear(view: View){
        val intent = Intent(this, CrearActivity::class.java)
        startActivity(intent)
    }





}
