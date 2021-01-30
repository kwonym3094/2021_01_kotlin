package com.example.a2021_01_kt_example.viewmodel

import android.view.View
import android.widget.Toast
import androidx.databinding.ObservableField
import java.util.*

class ViewModel {
    // ObservableField: 변하는 것을 감지해줌
    val text = ObservableField<String>("")

    fun showText(view: View) {

    }
}