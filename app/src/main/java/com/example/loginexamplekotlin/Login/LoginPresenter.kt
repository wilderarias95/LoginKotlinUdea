package com.example.loginexamplekotlin.Login

class LoginPresenter() : ILogingMVP.Presenter {

    private lateinit var view: ILogingMVP.View
    private lateinit var model: ILogingMVP.Model

    constructor(view: ILogingMVP.View) : this(){
        this.view = view
        model=LoginModel(this)
    }

    override fun loginButtonClicked() {
        var mail = view.getEmail()
        var password = view.getPassword()
        var phone = view.getPhone()

        if(mail.equals(""))
            view.showMailError()
        else
            if(password.equals(""))
                view.showPasswordError()
            else
                if(phone.equals(""))
                    view.showPhoneError()
                else
                    model.sendData(mail, password, phone)
    }


}

