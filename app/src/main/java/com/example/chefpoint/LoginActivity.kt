package com.example.chefpoint

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    lateinit var btn_home:Button
    lateinit var btn_create:Button
    lateinit var btn_search:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btn_home=findViewById(R.id.btn_home)
        btn_create=findViewById(R.id.btn_create)
        btn_search=findViewById(R.id.btn_search)


        btn_home.setOnClickListener {
            val intent=Intent(this,HomeActivity::class.java)
            startActivity(intent)
            btn_create.setOnClickListener {
                val intent=Intent(this,CreateActivity::class.java)
                startActivity(intent)
                btn_search.setOnClickListener {
                    val intent=Intent(this,SearchActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}