package com.example.practica03dsm104_01
import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import com.example.practica03dsm104_01.MiLifeCycleObserver
import com.example.practica03dsm104_01.R

/**
 * Actividad principal que registra el observador del ciclo de vida.
 */
class MainActivity : AppCompatActivity() {
    // Declaración de los TextViews para mostrar la información en pantalla
    private lateinit var txtAbierto: TextView
    private lateinit var txtSuspendido: TextView
    private lateinit var txtCerrado: TextView
    private lateinit var txtEstado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Asocia el layout XML con esta actividad
        setContentView(R.layout.activity_main)
        // Inicializa los TextViews con sus IDs del layout
        txtAbierto = findViewById(R.id.txtAbierto)
        txtSuspendido = findViewById(R.id.txtSuspendido)
        txtCerrado = findViewById(R.id.txtCerrado)
        txtEstado = findViewById(R.id.txtEstado)
        // Registra el observador del ciclo de vida para esta actividad
        // El observador recibirá las llamadas de los eventos del ciclo de vida
        lifecycle.addObserver(
            MiLifeCycleObserver(
                this,
                txtAbierto,
                txtSuspendido,
                txtCerrado,
                txtEstado
            )
        )
    }
}


