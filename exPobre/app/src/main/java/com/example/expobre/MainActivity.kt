package com.example.expobre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvNumeros: TextView
    private lateinit var btNumeros: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.tvNumeros = findViewById(R.id.tvNumeros)
        this.btNumeros = findViewById(R.id.btNumeros)

        //forma 1
        //gerarNovoJogo(null)

        //forma 2
        //this.btNumeros.setOnClickListener( { gerarNovoJogo(it) })

        //forma 3
        //this.btNumeros.setOnClickListener {
        //    this.gerarNovoJogo(null)
        //}

        //forma 4
        this.btNumeros.setOnClickListener(OnClickBotao())
    }

    /*
    fun gerarNovoJogo(view: View?) {
        this.tvNumeros.text = Megasena.getInstance().joinToString(" ")
    }
    */

    inner class OnClickBotao : View.OnClickListener{
        override fun onClick(v: View?) {
            this@MainActivity.tvNumeros.text = Megasena.getInstance().joinToString(" ")
        }

    }
}
