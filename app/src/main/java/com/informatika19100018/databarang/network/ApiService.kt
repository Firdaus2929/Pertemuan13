package com.informatika19100018.databarang.network

import ...

interface ApiService {
    @GET( value: "users")
    fun getUser() : Call<List<ResponseUsersItem?>>
}