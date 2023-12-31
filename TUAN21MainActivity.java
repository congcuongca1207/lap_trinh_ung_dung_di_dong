package Tuan2java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;

public class TUAN21MainActivity extends AppCompatActivity {

    EditText txt1,txt2;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan21_main3);
        txt1 = findViewById(R.id.Tuan21text1);
        txt2 = findViewById(R.id.Tuan21text2);
        btn1 = findViewById(R.id.button21);
        btn1.setOnClickListener(v -> {
            Intent i =new Intent(TUAN21MainActivity.this, TUAN21secondActivity.class);
            //du lieu vao
            i.putExtra("so1", txt1.getText().toString());
            i.putExtra("so2", txt2.getText().toString());
            //khoi hanh
            startActivity(i);
        });
    }
}
