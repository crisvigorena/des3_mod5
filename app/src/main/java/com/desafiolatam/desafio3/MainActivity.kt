package com.desafiolatam.desafio3

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.desafiolatam.desafio3.base.BaseActivity
import com.desafiolatam.desafio3.base.BaseListener
import com.desafiolatam.desafio3.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(),BaseListener,View.OnClickListener{




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding.cardView1.setOnClickListener(this)
        binding.cardView2.setOnClickListener(this)
        binding.cardView3.setOnClickListener(this)
        binding.cardView3.setOnClickListener(this)
        binding.cardview4.setOnClickListener(this)

    }
        override fun onClick(view: View) {
            // Verificamos qué vista fue clicada y ejecutamos la acción correspondiente


            // Puedes ocupar este ejemplo para navegar entre activities

            when (view.id) {
                R.id.cardView1 -> {
                    startActivity(Intent(this, SecondActivity::class.java))
                }
                R.id.cardView2 -> {
                    startActivity(Intent(this, ThirdActivity::class.java))
                }
                R.id.cardView3 -> {
                    startActivity(Intent(this, FourthActivity::class.java))
                }
                R.id.cardview4 -> {
                    startActivity(Intent(this, FiveActivity::class.java))
                }
            }
        }




    override fun getViewBinding(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)




}