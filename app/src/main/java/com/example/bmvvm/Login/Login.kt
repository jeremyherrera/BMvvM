package com.example.bmvvm.Login

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("msg")
    var mensaje:String,
    @SerializedName("error")
    var Error:Boolean,
    @SerializedName("content")
    var content: Content
)

