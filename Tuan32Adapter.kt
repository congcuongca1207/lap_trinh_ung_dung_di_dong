package tuan32

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.R

class Tuan32Adapter(context: Context, ls:ArrayList<Tuan32Contact>): BaseAdapter() {
    var ls : ArrayList<Tuan32Contact> = ls
    var context: Context = context

    // lay ve tong so item
    override fun getCount(): Int {
        return ls.size
    }
    //lay ve item hien tai
    override fun getItem(position: Int): Any {
        return ls.get(position)
    }
    //lay ve id item
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    //tao view
    //gan du lieu
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var c = convertView
        //1.tao view
        var vax: ViewAx
        //1.1 neu chua co thi tao view moi
        if (convertView == null){
            vax = ViewAx()//tao view moi
            //generate layout
            c = LayoutInflater.from(context).inflate(R.layout.tuan321_item_view,null)
            //anh xa tung thanh phan
            vax.img_hinh = c.findViewById(R.id.t32ItemHinh)
            vax.tv_ten = c.findViewById(R.id.t32ItemTen)
            vax.tv_tuoi = c.findViewById(R.id.t32ItemTuoi)
            c.tag = vax
        }
        //1.2 neu co roi thi dung view cu
        else{
            vax = c!!.tag as ViewAx
        }
        //2.gan du lieu cho view
        vax.img_hinh!!.setImageResource(ls[position].Hinh!!)
        vax.tv_ten!!.text = ls[position].Ten!!
        vax.tv_tuoi!!.text = ls[position].Tuoi!!
        return c!!
    }
    //khai bao lop anh xa ItemView
    inner class ViewAx{
        var img_hinh: ImageView? = null
        var tv_ten: TextView?= null
        var tv_tuoi: TextView? = null
    }

}
