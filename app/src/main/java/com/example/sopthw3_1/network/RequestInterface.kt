package com.example.sopthw3_1.network

import android.telecom.Call
import com.example.sopthw3_1.data.RequestLogin
import com.example.sopthw3_1.data.ResponseLogin
import retrofit2.http.Body
import retrofit2.http.POST

interface RequestInterface{
    @POST("/user/signin")
    fun requestLogin(@Body body : RequestLogin) : retrofit2.Call<ResponseLogin>
}