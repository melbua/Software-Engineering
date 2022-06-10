    package com.example.myclosey

    import android.R
    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.view.View
    import android.widget.AdapterView
    import android.widget.ArrayAdapter
    import android.widget.Toast
    import com.example.myclosey.databinding.ActivityMainBinding


    class MainActivity : AppCompatActivity() {
        lateinit var binding: ActivityMainBinding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding=ActivityMainBinding.inflate(layoutInflater)
            val view=binding.root
            setContentView(view)

            val itemList = listOf("카테고리 선택", "상의", "하의","신발")
            val adapter = ArrayAdapter(this, R.layout.simple_list_item_1, itemList)
            binding.spinner.adapter = adapter

            binding.spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
                override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long){
                    if(position != 0) Toast.makeText(this@MainActivity, itemList[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                }
            }
        }
    }
