package Tuan2java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.myapplication.R;

public class TUAN21secondActivity extends AppCompatActivity {

    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan21second);
        tv1 = findViewById(R.id.tuan21textView);
        //don du lieu
        Intent i1 = getIntent();
        //do hang
        String CHUOI1 = i1.getExtras().getString("so1");
        String CHUOI2 = i1.getExtras().getString("so2");
        //
        float so1 = Float.parseFloat(CHUOI1);
        float so2 = Float.parseFloat(CHUOI2);
        float tong = so1 + so2;
        tv1.setText(String.valueOf(tong));
    }
}
