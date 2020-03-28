package com.example.tr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        final ListView listView = (ListView) findViewById(R.id.listview);
        final String[] values = new String[]
                {
                        "Guci",
                        "Waduk Penjalin",
                        "Curug",
                        "Pantai Alam Indah"
                };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2, android.R.id.text1, values);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Templistview = values[position].toString();
                Intent intent = new Intent(list.this, tampil2.class);
                intent.putExtra("Listviewclickvalue", Templistview);
                startActivity(intent);
            }
        });
    }
}
