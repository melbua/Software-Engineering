package com.example.dailylook

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dailylook.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(){

    lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener {
            //로그인 성공 시 화면 전환 , 로그인 조건 코드 써야됨
            val intent = Intent(this,MyclosetActivity::class.java)
            startActivity(intent)
        }
        binding.signupBtn.setOnClickListener {
            intent = Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }

        binding.findidBtn.setOnClickListener {
            intent = Intent(this,FindIdActivity::class.java)
            startActivity(intent)
        }

        binding.findpwBtn.setOnClickListener {
            intent = Intent(this,FindPwdActivity::class.java)
            startActivity(intent)
        }
    }


}