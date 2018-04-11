package com.javabasicdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import designModel.dynamicProxy.ProxyTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        String s=StringReverse.reverse("123466789");
//        Log.d("tag","反转后的字符串="+s);
//        LinkedList list=new LinkedList();
//        list.add("");
//
        //动态代理测试
        new ProxyTest().login();

    }
}
