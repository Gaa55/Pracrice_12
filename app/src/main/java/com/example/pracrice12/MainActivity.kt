package com.example.pracrice12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Click(view: View)
    {
        val rb1: RadioButton = findViewById(R.id.radioButton)
        val rb2: RadioButton = findViewById(R.id.radioButton2)
        val rb3: RadioButton = findViewById(R.id.radioButton3)
        val rg: RadioGroup = findViewById(R.id.rg1)
        val picUp:ImageView=findViewById(R.id.imageView)
        val pic1:ImageView=findViewById(R.id.imageView2)

        val pic2:ImageView=findViewById(R.id.imageView3)

        val pic3:ImageView=findViewById(R.id.imageView4)
        pic3.visibility=View.INVISIBLE
        val chbx1:CheckBox=findViewById(R.id.checkBox)
        val chbx2:CheckBox=findViewById(R.id.checkBox2)
        val chbx3:CheckBox=findViewById(R.id.checkBox3)

            if (rb1.isChecked==true) picUp.setImageResource(R.drawable.apple)
            else if (rb2.isChecked==true) picUp.setImageResource(R.drawable.pear)
            else if (rb3.isChecked==true) picUp.setImageResource(R.drawable.grape)

        if (chbx1.isChecked==true)
        {
            pic1.visibility=View.VISIBLE
        }
        else pic1.visibility=View.INVISIBLE

        if (chbx2.isChecked==true)
        {
            pic2.visibility=View.VISIBLE
        }
        else pic2.visibility=View.INVISIBLE

        if (chbx3.isChecked==true)
        {
            pic3.visibility=View.VISIBLE
        }
        else pic3.visibility=View.INVISIBLE

    }
}
