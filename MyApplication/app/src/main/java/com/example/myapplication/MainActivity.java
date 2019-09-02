package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   // public static final String TAG = "MainActivity";
    public static final String TAG = MainActivity.class.getSimpleName();

    //decl
    Button greetingBtn;
    EditText  nameEdt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ins


       greetingBtn = findViewById(R.id.greetint_btn);
       nameEdt = findViewById(R.id.name_edt);
        greetingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name= nameEdt.getText().toString();
               // Log.d(TAG, "I am clicked");
                Toast.makeText(MainActivity.this, " Welcome to CMPS-312 lab" + name,Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, " Welcome to CMPS-312 lab" + name,Toast.LENGTH_LONG).show();
            }
        });
//        for (int i = 0; i <10; i++) {
//            Log.d(TAG, i + "");
//            Log.i(TAG, i + "");
//            Log.e(TAG, i + "");
//
//        }
    }
}
