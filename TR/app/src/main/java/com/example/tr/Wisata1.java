package com.example.tr;



import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.fragment.app.ListFragment;

public class Wisata1 extends ListFragment {
    String[] data = {"Budi", "Cici"};
    String [] data2 = {"12345", "54321"};
    public Wisata1(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_wisata1, container, false);
    }

    @Override
    public void onCreate(Bundle savedInstance){
        super.onCreate(savedInstance);

        setListAdapter(new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, data));
    }

    @Override
    public void onListItemClick (ListView l, View v, int position, long id){
        TextView txt1 = getActivity().findViewById(R.id.textView2);
        TextView txt2 = getActivity().findViewById(R.id.textView3);

        txt1.setText("Name : "+data[position]);
        txt2.setText("Phone : "+data2[position]);

    }

    @Override
    public void onStart (){
        super.onStart();
    }

}


