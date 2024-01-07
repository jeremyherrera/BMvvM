package com.example.bmvvm.Login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class LoginViewModelFactory(private val repositoryLogin: RepositoryLogin): ViewModelProvider.Factory {


    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return LoginViewModel(repositoryLogin) as T
    }
}