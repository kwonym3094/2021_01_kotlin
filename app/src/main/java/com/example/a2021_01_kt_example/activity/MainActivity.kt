package com.example.a2021_01_kt_example.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.a2021_01_kt_example.R
import com.example.a2021_01_kt_example.databinding.ActivityMainBinding
import com.example.a2021_01_kt_example.viewmodel.ViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // navigation controller 나중에 init 해줄거기 때문에 lateinit
    lateinit var navController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = nav_host_fragment.findNavController()



        
    }
}