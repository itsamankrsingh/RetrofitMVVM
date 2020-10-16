package com.magician.retrofitmvvm.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.magician.retrofitmvvm.Repository.Repository
import com.magician.retrofitmvvm.model.Post
import kotlinx.coroutines.launch

class MainViewModel(val repository: Repository) : ViewModel() {

    val myResponse: MutableLiveData<Post> = MutableLiveData()

    fun getPost() {
        viewModelScope.launch {
            val response = repository.getPost()
            myResponse.value = response
        }
    }

}