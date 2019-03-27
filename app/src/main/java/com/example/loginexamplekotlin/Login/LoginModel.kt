package com.example.loginexamplekotlin.Login

class LoginModel: ILogingMVP.Model {
    private lateinit var presenter: ILogingMVP.Presenter
    private lateinit var repository: ILoginRepository

    constructor(presenter: ILogingMVP.Presenter){
        this.presenter = presenter
        repository = LoginRepository(this)

    }

    override fun sendData(mail: String, password: String, phone: String) {

    }
}