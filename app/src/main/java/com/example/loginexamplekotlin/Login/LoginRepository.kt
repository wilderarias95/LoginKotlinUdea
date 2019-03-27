package com.example.loginexamplekotlin.Login

class LoginRepository: ILoginRepository {
    private lateinit var model: ILogingMVP.Model

    constructor(model: ILogingMVP.Model){
        this.model = model
    }
}