package br.com.fiap.pedro_pires

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var usuarioEditText: EditText
    private lateinit var senhaEditText: EditText
    private lateinit var acessarButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usuarioEditText = findViewById(R.id.usuario)
        senhaEditText = findViewById(R.id.senha)
        acessarButton = findViewById(R.id.btnAcessar)

        acessarButton.setOnClickListener {
            performLogin()
        }
    }

    private fun performLogin() {
        val usuario = usuarioEditText.text.toString()
        val senha = senhaEditText.text.toString()

        val storedUsuario = "BahPPCanovas"
        val storedSenha = "senha123"

        if (usuario == storedUsuario && senha == storedSenha) {
            Toast.makeText(this, "Login bem-sucedido!", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Usuário ou senha incorretos", Toast.LENGTH_LONG).show()
        }
    }
}