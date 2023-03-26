package mx.edu.itson.practica9g

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Principal : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)
        val tv_nombre: TextView = findViewById(R.id.tv_nombre)
        val tv_email: TextView = findViewById(R.id.tv_email)
        val btn_cerrar: Button = findViewById(R.id.btn_cerrar)
        val bundle = intent.extras

        if (bundle != null){
            val name = bundle.getString("name")
            val email = bundle.getString("email")
            tv_nombre.setText(name)
            tv_email.setText(email)
        }
        btn_cerrar.setOnClickListener {
            finish()
        }
    }
}