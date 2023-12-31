package Tuan2java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication.R;

public class TUAN22listMainActivity extends AppCompatActivity {

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan22list_main);
        lv = findViewById(R.id.tuan22listview);
        //nguon du lieu
        String[] arr = new String[]{"mon 1", "tuan2", "mon3", "4", "5", "Tuan6","aaa", "bbb"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr);
        lv.setAdapter(adapter);
    }
}
