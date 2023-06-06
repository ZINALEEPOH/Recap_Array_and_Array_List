package com.example.recaparrayandarraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    //String[] fruits;
    ArrayList<String> fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv=findViewById(R.id.textView);

        //fruits= new String[3];
        fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        String msg="Fruits\n";
        msg+="=====\n";
        //for(int i=0;i<fruits.length();i++){
            //msg+=fruits[i]+"\n";
        for(int i=0;i<fruits.size();i++){
            msg+=fruits.get(i)+"\n";
        }tv.setText(msg);
    }
}