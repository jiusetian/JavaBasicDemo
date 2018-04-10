package com.javabasicdemo;

import android.util.Log;


public class AboutThread {

    public static void run() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Log.d("tag","调用了run");
            }
        });
        thread.run(); //run是线程启动后要执行的方法
        thread.start();
        Log.d("tag","调用了后面的代码" +
                "");
    }


}
