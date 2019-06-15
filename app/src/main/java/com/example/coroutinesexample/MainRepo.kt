package com.example.coroutinesexample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.delay

class MainRepo {

    var ds: MyDataSource = MyDataSource()
    suspend fun a(): LiveData<Map<String, String>> {
        var data = ds.a()
//        var data = MutableLiveData<String>()
        delay(3000)
//        data.postValue("Raghav")
        return data
    }
    suspend fun b(a: String): LiveData<Map<String, String>>{
        var data = ds.b(a)
        delay(1000)
        return data
    }
    suspend fun c(b: String): LiveData<Map<String, String>>{
        var data = ds.c(b)
        delay(3000)
        return data
    }
}