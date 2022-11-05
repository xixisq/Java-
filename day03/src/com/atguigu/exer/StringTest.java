package com.atguigu.exer;

/**
 * 一道面试题
 * @author gccstart
 * @create 2022-02-23 20:52
 */
public class StringTest {
    String str = new String("good");
    char[] ch = {'t','e','s','t'};

    public void change(String str,char ch[]){
        str = "test ok";
        ch[0] = 'b';
    }

    public static void main(String[] args){
        StringTest ex = new StringTest();
        ex.change(ex.str,ex.ch);
        System.out.println(ex.str);//good
        System.out.println(ex.ch);//best
    }
}
