package com.example.coroutinesexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.delay

class MyDataSource {

    suspend fun a(): LiveData<Map<String, String>>{
        var data = MutableLiveData<Map<String, String>>()
        var map = HashMap<String, String>()
        map.put("ping", "Coroutine")
        data.postValue(map)
        return data
    }
    suspend fun b(a: String): LiveData<Map<String, String>> {
        var data = MutableLiveData<Map<String, String>>()
        var map = HashMap<String, String>()
        map.put("download", "LiveData")
        data.postValue(map)
        return data
    }
    suspend fun c(b: String): LiveData<Map<String, String>> {
        var data = MutableLiveData<Map<String, String>>()
        var map = HashMap<String, String>()
        map.put("upload", "Example")
        data.postValue(map)
        return data
    }
}