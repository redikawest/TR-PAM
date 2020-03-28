package com.example.tr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class tampil2 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil2);

        textView = (TextView) findViewById(R.id.txtitem);
        String Tempholder = getIntent().getStringExtra("Listviewclickvalue");
        textView.setText(Tempholder);
    }
}
