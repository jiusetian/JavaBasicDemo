package com.javabasicdemo;


public class StringReverse {

    /**
     * 反转字符串，利用递归
     * 就是每次都取第一个字符，到最后就是取最后一个字符，但是递归函数是从最底层开始返回的，就是最底层那里开始执行，所以
     * 就相当于最开始取的是最后一个字符，然后倒数第二个，这样不停相加就是相反顺序的字符串了
     */

    public static String  reverse(String originStr){
        if(originStr == null || originStr.length() <= 1)
            return originStr;

        return reverse(originStr.substring(1)) + originStr.charAt(0);
    }
}
