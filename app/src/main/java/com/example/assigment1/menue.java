package com.example.assigment1;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

public class menue extends AppCompatActivity {


    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menue);

        list = findViewById(R.id.main_menu);


        Intent intent = getIntent();


        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0 ){

                    Intent intent=new Intent(menue.this, Inf.class);

                 startActivity(intent);
                }
                if(position == 1 ){

                    Intent intent=new Intent(menue.this, Quiz.class);

                    startActivity(intent);
                }
            }


        };

        list.setOnItemClickListener(itemClickListener);
    }
}
