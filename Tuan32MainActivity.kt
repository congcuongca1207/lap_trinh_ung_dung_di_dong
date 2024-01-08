package tuan32

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.myapplication.R

class Tuan32MainActivity : AppCompatActivity() {
    var adap: Tuan32Adapter? = null
    var ls: ArrayList<Tuan32Contact> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuan32_main)
        var lv = findViewById<ListView>(R.id.listviewTuan32)//anh xa
        ls.add(Tuan32Contact("nguyen van A","18",R.drawable.android))
        ls.add(Tuan32Contact("nguyen Cong Cuong","21",R.drawable.hp))
        ls.add(Tuan32Contact("nguyen thai hao","23",R.drawable.android))
        ls.add(Tuan32Contact("nguyen van A","18",R.drawable.android))
        ls.add(Tuan32Contact("nguyen van A","18",R.drawable.android))

        adap = Tuan32Adapter(this, ls)
        lv.adapter = adap

    }
}
