package tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class Tuan3listvewMainActivity extends AppCompatActivity {

    ListView lv;
    T32adapter adapter;
    ArrayAdapter<T32contact> ls =new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan3listvew_main);
        lv = findViewById(R.id.Tuan3listvew);
        ls.add(new T32contact("nguyen van a", "18",R.drawable.ic_launcher_background));
        ls.add(new T32contact("nguyen van b", "19",R.drawable.ic_launcher_background));
        ls.add(new T32contact("nguyen van c", "20",R.drawable.ic_launcher_background));
        ls.add(new T32contact("nguyen van d", "21",R.drawable.ic_launcher_background));
        ls.add(new T32contact("nguyen van e", "22",R.drawable.ic_launcher_background));
        ls.add(new T32contact("nguyen van f", "23",R.drawable.ic_launcher_background));

    }
}
