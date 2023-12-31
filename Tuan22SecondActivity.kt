package tuan22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myapplication.R

class Tuan22SecondActivity : AppCompatActivity() {
    var Tv1: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan22_second)
        Tv1 = findViewById(R.id.Tuan22tv)
        var i1 =intent
        val Chuoi1 = i1.extras!!.getString("so1")
        val Chuoi2 = i1.extras!!.getString("so2")

        val So1 = Chuoi1!!.toFloat()
        val So2 = Chuoi2!!.toFloat()
        val tong = So1 + So2
        Tv1!!.text = tong.toString()
    }
}
