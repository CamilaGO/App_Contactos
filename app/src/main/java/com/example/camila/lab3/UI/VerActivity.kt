package com.example.camila.lab3.UI

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.camila.lab3.MainActivity
import com.example.camila.lab3.R
import com.example.camila.lab3.R.string.phone
import kotlinx.android.synthetic.main.activity_ver.*

class VerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ver)

        var context: MyApplication = applicationContext as MyApplication
        //Se llenan los textviews con la informacion del contacto seleccionado
        val name = findViewById(R.id.fillName) as TextView
        name.text = context.getName()
        val phone = findViewById(R.id.fillPhone) as TextView
        phone.text = context.getPhone()
        val mail = findViewById(R.id.fillMail) as TextView
        mail.text = context.getMail()


    }

    //Boton para ver activity de nuevo contacto
    fun onClick_Home(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)

    }

    fun sendMail(view: View){
        val intent = Intent(this, CorreoActivity::class.java)
        startActivity(intent)
    }

    fun makeCall(view: View){
        val intent: Intent = Intent(Intent.ACTION_DIAL)
        var context: MyApplication = applicationContext as MyApplication
        val phone = findViewById(R.id.fillPhone) as TextView
        phone.text = context.getPhone()
        intent.setData(Uri.parse("tel:${phone.text}"))
        startActivity(intent)

    }




}
