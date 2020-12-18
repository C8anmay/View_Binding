package com.acm.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.acm.viewbinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import android.view.LayoutInflater as LayoutInflater1

class MainActivity : AppCompatActivity() {
    //activity main to ActivityMainBinding
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        //Log.d("error","error")
        val view=binding.root
        setContentView(view)
       // binding.txtText.text="0"

        //view model
        val viewmodel:ViewModel= ViewModelProvider(this).get(ViewModel::class.java)
        txtText.text=viewmodel.getC().toString()
        btnClick.setOnClickListener {
            viewmodel.setC()
            txtText.text=viewmodel.getC().toString()
        }
    }
}