package com.atguigu.java;

import org.junit.Test;

import java.util.Arrays;

/**
 * 涉及到String类与其他结构的转换
 *
 * @author gccstart
 * @create 2022-02-25 16:30
 */
public class StringTest1 {

    /*
    String 与 byte[]之间的转换
    String --> byte[]:调用String的getBytes()
    byte[] --> String:调用String的构造器
    * */
    @Test
    public void test3(){
        String str1 = "abc123中国";
        byte[] bytes = str1.getBytes();
        System.out.println(Arrays.toString(bytes));

        System.out.println("************");

        String str2 = new String(bytes);
        System.out.println(str2);
    }

    /*
    * String 与 char[]之间的转换
    * String --> char[]:调用String的toCharArray()
    * char[] --> String:调用String的构造器
    *
    * */
    @Test
    public void test2(){
        String str1 = "abc123";

        char[] charArray = str1.toCharArray();
        for(int i = 0;i < charArray.length;i++){
            System.out.println(charArray[i]);
        }

        char[] arr = new char[]{'h','e','l','l','o'};
        String str2 = new String(arr);
        System.out.println(str2);

    }

    /*
    * 复习：
    * String 与基本数据类型、包装类之间的转换。
    * String --> 基本数据类型、包装类：调用包装类的静态方法：parseXxx(str)
    * 基本数据类型、包装类 --> String:调用String重载的valueOf(xxx)
    *
    * */

    @Test
    public void test1(){
        String str1 = "123";
//        int num = (int)str1;//错误的
        int num = Integer.parseInt(str1);

        String str2 = String.valueOf(num);//"123"

    }
}
