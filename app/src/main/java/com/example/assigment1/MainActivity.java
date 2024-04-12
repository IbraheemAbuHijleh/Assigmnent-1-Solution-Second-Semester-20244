package com.example.assigment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     private EditText txtname;
     private EditText txtpass;

    private TextView txtres;
     private Switch checked;
     private SharedPreferences save;
     private SharedPreferences.Editor editor;
     public static final String Name="Name";
    public static final String Pass="Pass";
     public static final String Flag="Fales";

     private boolean falg=true;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Hoks();

        setupsheard();

        checked();

    }

    private void checked() {

        falg=save.getBoolean(Flag,false);

        if(falg){
            txtname.setText(save.getString(Name,""));

            txtpass.setText(save.getString(Pass,""));

            checked.setChecked(true);
        }

    }

    private void setupsheard() {

        save= PreferenceManager.getDefaultSharedPreferences(this);

        editor=save.edit();
    }

    private void Hoks() {

        txtname=findViewById(R.id.txtname);

        txtpass=findViewById(R.id.txtpass);

        checked=findViewById(R.id.checked);

        txtres=findViewById(R.id.txtres);
    }

    public void btnonclick(View view) {

        String name=txtname.getText().toString().trim();

        String pass=txtpass.getText().toString().trim();

        if(name.isEmpty() || pass.isEmpty()){

            txtres.setVisibility(View.VISIBLE);

            Toast.makeText(MainActivity.this," Please Enter Information",Toast.LENGTH_SHORT).show();
        }

        if(checked.isChecked()){

            editor.putString(Name,name);

            editor.putString(Pass,pass);

            editor.putBoolean(Flag,true);

            editor.commit();
        }

        Intent intent=new Intent(this, menue.class);

        startActivity(intent);
    }
    public void onStop(){

        super.onStop();

        String name=txtname.getText().toString().trim();

        String pass=txtpass.getText().toString().trim();

        if(checked.isChecked()){

            editor.putString(Name,name);

            editor.putString(Pass,pass);

            editor.putBoolean(Flag,true);

            editor.commit();
        }
    }
}