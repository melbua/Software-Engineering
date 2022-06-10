package com.example.dailylook

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.example.dailylook.databinding.ActivityMakelookBinding


class MakelookActivity : AppCompatActivity() {

    lateinit var binding: ActivityMakelookBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMakelookBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backButton.setOnClickListener {
            //뒤로가기 버튼, 전체조회 하면으로 back
            val intent = Intent(this, MyclosetActivity::class.java)
            startActivity(intent)
        }
        binding.ibMenu.setOnClickListener {
            val items = arrayOf("룩 조회", "로그아웃", "회원탈퇴")

            val builder = AlertDialog.Builder(this)
                .setTitle("Select Item")
                .setItems(items) { dialog, which ->
                    if (which == 0) {
                        val intent = Intent(this, CombinationListActivity::class.java)
                        startActivity(intent)
                    } else if (which == 2) {
                        val intent = Intent(this, SecessionActivity::class.java)
                        startActivity(intent)
                    }
                    //eles if 로 각 which마다 전환 구현
                }
                .show()
        }

    }

    private fun toast(s: String) {
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show()

    }
}