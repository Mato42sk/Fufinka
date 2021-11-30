package com.example.fuf

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_first.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_first)
    }

    fun Check1(view: View) {
        val answer1 = "marec"
        var Uanswer1 = editTV1.text.toString().toLowerCase()
        val img1 = R.drawable.img11
        if (answer1 == Uanswer1)
            imgView1.setImageResource(img1)
        else
            Toast.makeText(this@MainActivity, "Nesprávna odpoveď", Toast.LENGTH_SHORT).show()
    }

        fun Check2(view: View) {
            val img2 = R.drawable.img22
            val answer2 = "august"
            val Uanswer2 = editTV2.text.toString().toLowerCase()
            if (Uanswer2 == answer2)
                imgView2.setImageResource(img2)
            else
                Toast.makeText(this@MainActivity, "Nesprávna odpoveď", Toast.LENGTH_SHORT).show()
        }

        fun Check3(view: View) {
            val img3 = R.drawable.img33
            val answer3 = "30.01."
            val Uanswer3 = editTV3.text.toString().toLowerCase()
            if (Uanswer3 == answer3)
                imgView3.setImageResource(img3)
            else
                Toast.makeText(this@MainActivity, "Nesprávna odpoveď", Toast.LENGTH_SHORT).show()
        }

        fun Check4(view: View) {
            val img4 = R.drawable.img44
            val answer4 = "24.09."
            val Uanswer4 = editTV4.text.toString().toLowerCase()
            if (Uanswer4 == answer4)
                imgView4.setImageResource(img4)
            else
                Toast.makeText(this@MainActivity, "Nesprávna odpoveď", Toast.LENGTH_SHORT).show()
        }

        fun Check5(view: View) {
            val img5 = R.drawable.img55
            val answer5 = "postarik"
            val Uanswer5 = editTV5.text.toString().toLowerCase()
            if (Uanswer5 == answer5)
                imgView5.setImageResource(img5)
            else
                Toast.makeText(this@MainActivity, "Nesprávna odpoveď", Toast.LENGTH_SHORT).show()
        }

        fun Check6(view: View) {
            val img6 = R.drawable.img66
            val answer6 = "mimon"
            val Uanswer6 = editTV6.text.toString().toLowerCase()
            if (Uanswer6 == answer6)
                imgView6.setImageResource(img6)
            else
                Toast.makeText(this@MainActivity, "Nesprávna odpoveď", Toast.LENGTH_SHORT).show()
        }

        fun Check7(view: View) {
            val img7 = R.drawable.img77
            val answer7 = "muz v temnote 2"
            val Uanswer7 = editTV7.text.toString().toLowerCase()
            if (Uanswer7 == answer7)
                imgView7.setImageResource(img7)
            else
                Toast.makeText(this@MainActivity, "Nesprávna odpoveď", Toast.LENGTH_SHORT).show()
        }

        fun Check8(view: View) {
            val img8 = R.drawable.img88
            val answer8 = "sex on the beach"
            val Uanswer8 = editTV8.text.toString().toLowerCase()
            if (Uanswer8 == answer8)
                imgView8.setImageResource(img8)
            else
                Toast.makeText(this@MainActivity, "Nesprávna odpoveď", Toast.LENGTH_SHORT).show()
        }

 fun switch(view: View){
     setContentView(R.layout.activity_main)

 }
}