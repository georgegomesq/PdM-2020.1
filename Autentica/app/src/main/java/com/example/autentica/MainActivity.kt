package com.example.autentica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var etUsuario: EditText
    private lateinit var etSenha: EditText
    private lateinit var btCancelar: Button
    private lateinit var btSalvar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.etUsuario = findViewById(R.id.etUsuario)
        this.etSenha = findViewById(R.id.etSenha)
        this.btCancelar = findViewById(R.id.btCancelar)
        this.btSalvar = findViewById(R.id.btSalvar)

        this.btCancelar.setOnClickListener({
            Log.i("APP_AUTENTICA", "i - Cancelou")
            Log.e("APP AUTENTICA"," e - Cancelou")
            Log.w("APP AUTENTICA", "w - Cancelou")
            this.etUsuario.text.clear()
            this.etSenha.text.clear()
            Toast.makeText(this, "Voce cancelou!", Toast.LENGTH_SHORT).show()
        })

        this.btSalvar.setOnClickListener(OnClickBotao())
    }

    inner class OnClickBotao: View.OnClickListener {
        override fun onClick(v: View?) {
            var usuario = this@MainActivity.etUsuario.text.toString()
            var senha = this@MainActivity.etSenha.text.toString()

            Log.i("APP_AUTENTICA", "$usuario - $senha")

            if (usuario == "admin" && senha == "1234"){
                Toast.makeText(this@MainActivity, "Sucesso!", Toast.LENGTH_SHORT).show()
                Log.i("APP_AUTENTICA", "Deu Certo!")
            }else{
                Toast.makeText(this@MainActivity, "Erro!", Toast.LENGTH_SHORT).show()
                Log.i("APP_AUTENTICA", "Deu errado!")
            }
        }
    }
}
