package com.example.coroutinesexample

import android.util.Log
import androidx.lifecycle.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    var a:Map<String, String>? = null
    var b:Map<String, String>? = null
    var c:Map<String, String>? = null
    var repo = MainRepo()


    val user = liveData(context = viewModelScope.coroutineContext) {
        a = repo.a().value
        emit(a)
        b = repo.b(a?.get("ping")!!).value
        emit(b)
        c = repo.c(b?.get("download")!!).value
        emit(c)
    }
}