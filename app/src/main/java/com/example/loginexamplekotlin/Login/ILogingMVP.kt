package com.example.loginexamplekotlin.Login

interface ILogingMVP {
    interface View {
        fun getEmail(): String
        fun getPassword(): String
        fun getPhone(): String
        fun showMailError()
        fun showPasswordError()
        fun showPhoneError()
    }
    interface Presenter {
        fun loginButtonClicked()
    }
    interface Model {
        fun sendData(mail: String, password: String, phone: String)
    }
}