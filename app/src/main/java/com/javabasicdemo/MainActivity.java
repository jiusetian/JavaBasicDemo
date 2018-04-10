package com.javabasicdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String s=StringReverse.reverse("123466789");
        Log.d("tag","反转后的字符串="+s);
        LinkedList list=new LinkedList();
        list.add("");

        AboutThread.run();
    }
}
