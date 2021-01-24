package co.edu.unipiloto.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Bebidas extends AppCompatActivity {

    private ArrayList<String> lista=new ArrayList<String>();
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bebidas);

        lista.add("Latte");
        lista.add("Capuccino");
        lista.add("Filter");

        lv=(ListView)findViewById(R.id.list_viewBebidas);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lista);

        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position) {
                    case 0:
                        Intent i=new Intent(Bebidas.this,Latte.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1=new Intent(Bebidas.this,Capuccino.class);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2=new Intent(Bebidas.this,Filtter.class);
                        startActivity(i2);
                        break;
                }
            }
        });
    }
}