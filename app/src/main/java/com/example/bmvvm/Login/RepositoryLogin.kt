package com.example.bmvvm.Login

import okhttp3.ResponseBody
import retrofit2.Response

class RepositoryLogin {

    suspend fun pshPotsLogin(
        postLog : PostLogin
    ): Response<ResponseBody> {
        return LoginInstance.apiLog.pushPostLogin(
            postLog.username,
            postLog.password,
            postLog.platform,
            postLog.version,
            postLog.build,
            postLog.modelDevice,
            postLog.nameDevice,
            postLog.versionSystem,
            postLog.tokendevice
        )
    }
}