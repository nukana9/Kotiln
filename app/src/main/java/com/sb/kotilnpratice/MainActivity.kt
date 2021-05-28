package com.sb.kotilnpratice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.sb.kotilnpratice.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view= binding.root
        setContentView(view)
        binding.tvHeader.text="Sample Program"
        binding.tvTitle.text="Addtion of two number"

    }

    fun OnAdition(view: View) {
        var numberone:Int=Integer.parseInt(binding.etNumberone.text.toString())
       var  numbertwo:Int=Integer.parseInt(binding.etNumbertwo.text.toString())
        val sum= numberone + numbertwo
        binding.tvResult.text="Result:  $sum"
    }
}