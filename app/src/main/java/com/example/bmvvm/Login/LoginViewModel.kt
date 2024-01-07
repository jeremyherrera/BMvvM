package com.example.bmvvm.Login

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import okhttp3.ResponseBody
import retrofit2.Response

class LoginViewModel(private val repositoryLogin: RepositoryLogin): ViewModel() {

    var pushrespLogin : MutableLiveData<Response<ResponseBody>> = MutableLiveData()

    fun shoveLogin(
        postLog: PostLogin
    ){
        viewModelScope.launch {
            val response = repositoryLogin.pshPotsLogin(
                postLog
            )
            pushrespLogin.value = response
        }


    }
}