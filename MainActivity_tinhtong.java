package tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

public class MainActivity_tinhtong extends AppCompatActivity {
    //khai bao cac control
    EditText text1, text2;
    Button button;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tinhtong);
        // anh xa cac control
        text1 = findViewById(R.id.txt1);
        text2 = findViewById(R.id.txt2);
        button = findViewById(R.id.btn);
        tv1 = findViewById(R.id.txtkq);

        //xu ly su kien
        button.setOnClickListener(v -> {
            //creat function add
            tinhtong();
        });
    }

    private void tinhtong() {
        //lay du lieu nhap vao tu editext1
        String str1 = text1.getText().toString();
        float so1 = Float.parseFloat(str1);
        //lay du lieu nhap
        String str2 = text1.getText().toString();
        float so2 = Float.parseFloat(str2);

        float tong = so1 + so2;
        //đưa ra màn hình vào textview
        tv1.setText(String.valueOf(tong));
    }
}