package com.example.beratbadanideal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    private lateinit var tinggi : EditText
    private lateinit var rblaki : RadioButton
    private lateinit var rbpuan : RadioButton
    private lateinit var hasil : TextView
    private lateinit var btn_hitung : Button
    private lateinit var refresh : ImageView

    private var tb : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tinggi = findViewById(R.id.id_tinggi)
        rblaki = findViewById(R.id.rb_Laki2)
        rbpuan = findViewById(R.id.rb_perempuan)
        hasil = findViewById<Button>(R.id.hasil)
        refresh = findViewById(R.id.refresh)
        btn_hitung = findViewById(R.id.btn_hitung)

        btn_hitung.setOnClickListener {
              tb = tinggi.text.toString().toInt()
            val itunglaki2 = (tb - 100) - ((tb - 100) * 0.10).toInt()
            val itungpuan = (tb - 100) - ((tb - 100) * 0.15).toInt()

            if (rblaki.isChecked) {
                hasil.setText(itunglaki2.toString() + "Kg")

            } else {
                hasil.setText(itungpuan.toString() + "Kg")
            }

        }
        refresh.setOnClickListener {
            hasil.text =""
        }
    }

}