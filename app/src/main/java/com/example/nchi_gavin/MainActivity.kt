package com.example.nchi_gavin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClicked(view:View){
        if (K_E.isChecked)txt_result.text="Kenya: Yes we talk English as our first language"
        if (U_G.isChecked)txt_result.text="Uganda: Yes, but we prefer Luganda"
        if (T_Z.isChecked)txt_result.text="Tanzania: Yes, but we prefer Swahili. Ooliskia wapi!!!"
    }
    fun onSelect(view: View){
        if (yes.isChecked)txt_result1.text="Yes I am a certified Developer"
        if (no.isChecked)txt_result1.text="No, I'm not certified"
    }
}
