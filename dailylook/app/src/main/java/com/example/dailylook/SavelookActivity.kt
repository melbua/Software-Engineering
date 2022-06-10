package com.example.dailylook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.dailylook.databinding.ActivitySavelookBinding

class SavelookActivity : AppCompatActivity() {
    lateinit var binding : ActivitySavelookBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySavelookBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addBtn.setOnClickListener {
            //추가하기 버튼 이후 룩 조회 화면으로 이동
            val intent = Intent(this,CombinationListActivity::class.java)
            startActivity(intent)
        }

        binding.backButton.setOnClickListener {
            //뒤로가기 버튼, 전체조회 하면으로 back
            val intent = Intent(this,MyclosetActivity::class.java)
            startActivity(intent)
        }

        binding.ibMenu.setOnClickListener {
            val items = arrayOf("룩 조회","룩 추가", "로그아웃", "회원탈퇴")

            val builder = AlertDialog.Builder(this)
                .setTitle("Select Item")
                .setItems(items) { dialog, which ->
                    if (which == 0) {
                        val intent = Intent(this, CombinationListActivity::class.java)
                        startActivity(intent)
                    }
                    else if (which == 1){
                        val intent = Intent(this, MakelookActivity::class.java)
                        startActivity(intent)
                    }
                    else if (which == 3) {
                        val intent = Intent(this, SecessionActivity::class.java)
                        startActivity(intent)
                    }
                    //eles if 로 각 which마다 전환 구현
                }
                .show()
        }

    }

    private fun toast(s: String) {
        Toast.makeText(this,s, Toast.LENGTH_SHORT).show()

    }
}