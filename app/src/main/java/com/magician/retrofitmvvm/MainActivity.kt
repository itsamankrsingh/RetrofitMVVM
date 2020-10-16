package com.magician.retrofitmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.magician.retrofitmvvm.Repository.Repository
import com.magician.retrofitmvvm.ViewModel.MainViewModel
import com.magician.retrofitmvvm.ViewModel.MainViewModelFactory

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val repository = Repository()
        val viewModelFactory = MainViewModelFactory(repository)
        viewModel = ViewModelProvider(this, viewModelFactory)
            .get(MainViewModel::class.java)
        viewModel.getPost()
        viewModel.myResponse.observe(this, Observer {
            Log.d("RESPONSE","userId-> "+it.userId.toString())
            Log.d("RESPONSE","id-> "+it.id.toString())
            Log.d("RESPONSE","body-> "+it.body)
            Log.d("RESPONSE","title-> "+it.title)
        })
    }
}