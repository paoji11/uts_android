package com.paoji.uts_18090080.activity.login

import com.paoji.uts_18090080.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}