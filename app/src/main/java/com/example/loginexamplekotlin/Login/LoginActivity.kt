package com.example.loginexamplekotlin.Login

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.loginexamplekotlin.R
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity(), ILogingMVP.View {


    private lateinit var presenter: ILogingMVP.Presenter
    private lateinit var nombre: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        presenter = LoginPresenter(this)

        bLogin.setOnClickListener{
            presenter.loginButtonClicked()
        }

    }

    override fun getEmail(): String {
        return eEmail.text.toString()
    }

    override fun getPassword(): String = ePassword.text.toString()

    override fun getPhone(): String = ePhone.text.toString()

    override fun showMailError() {
       eEmail.error = "Debe digitar un correo electrónico"
    }

    override fun showPasswordError() {
       ePassword.error="Debe digitar una contraseña"
    }

    override fun showPhoneError() {
        ePhone.error= "Debe digitar un telefono"
    }


}
