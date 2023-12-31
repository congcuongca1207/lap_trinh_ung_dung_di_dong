package tuan3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class T32adapter extends BaseAdapter {
    private ArrayList<T32contact> ls;
    private Context context;

    public T32adapter(ArrayList<T32contact> ls, Context context) {
        this.ls = ls;
        this.context = context;
    }
    //lay ve so luong items
    @Override
    public int getCount() {
        return 0;
    }
    //lay ve item
    @Override
    public Object getItem(int position) {
        return ls.get(position);
    }
    //lay ve id
    @Override
    public long getItemId(int position) {
        return position;
    }
    //tao view
    //gan du lieu
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //tao view
        ViewDN vax;
        // neu chua co vew thi tao view moi
        if(convertView == null)
        {
            vax = new ViewDN();
            convertView = LayoutInflater.from(context).inflate(R.layout.tuan32_listview_item, null);
            vax.img_hinh = convertView.findViewById(R.id.Tuan3Itemhinh);
            vax.tv_ten = convertView.findViewById(R.id.Tuan3listvew);
            vax.tv_tuoi = convertView.findViewById(R.id.Tuan3Itemtuoi);
            convertView.setTag(vax);
        }else{
            vax = (ViewDN) convertView.getTag();
        }
        vax.img_hinh.setImageResource(ls.get(position).getHinh());
        vax.tv_ten.setText(ls.get(position).getTen());
        vax.tv_tuoi.setText(ls.get(position).getTuoi());

        return convertView;
    }
    //dinh nghia view
    class ViewDN{
        ImageView img_hinh;
        TextView tv_ten, tv_tuoi;
    }
}
