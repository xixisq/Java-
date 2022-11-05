package com.atguigu.java;

import org.junit.Test;

/**
 * @author gccstart
 * @create 2022-02-24 19:53
 */
public class StringMethodTest {

    @Test
    public void test4(){
        String str1 = "北京尚硅谷教育北京";
        String str2 = str1.replace("北","东");
        System.out.println(str1);
        System.out.println(str2);

        System.out.println("********************");
        String str = "12hello34world5java7891mysql456";
        String string = str.replaceAll("\\d+",",").replaceAll("^,|,$","");
        System.out.println(string);


        System.out.println("********************");
        str = "12345";
        //判断str字符串中是否全部由数字组成，即有1-n个数字组成
        boolean matches = str.matches("\\d+");
        System.out.println(matches);
        String tel = "0571-4534289";
        //判断这是否是一个杭州的固定电话
        boolean result = tel.matches("0571-\\d{7,8}");
        System.out.println(result);

        System.out.println("********************");
        str = "hello|world|java";
        String[] strs = str.split("\\|");
        for(int i = 0;i < strs.length;i++){
            System.out.println(strs[i]);
        }
        System.out.println();
        str2 = "hello.world.java";
        String[] strs2 = str2.split("\\.");
        for(int i = 0;i < strs2.length;i++){
            System.out.println(strs2[i]);
        }
    }

    @Test
    public void test3(){
        String str1 = "helloworld";
        boolean b1 = str1.endsWith("rld");
        System.out.println(b1);

        boolean b2 = str1.startsWith("He");
        System.out.println(b2);

        boolean b3 = str1.startsWith("ll",2);
        System.out.println(b3);

        String str2 = "wo";
        System.out.println(str1.contains(str2));

        System.out.println(str1.indexOf("lo"));
        System.out.println(str1.indexOf("lo", 5));

        String str3 = "hellorworld";
        System.out.println(str3.lastIndexOf("or"));
        System.out.println(str3.lastIndexOf("or",6));

        //什么情况下，indexOf(str)和lastIndexOf(str)返回值相同？
        //情况一：存在唯一的str
        //情况二：不存在str

    }

    @Test
    public void test2(){
        String s1 = "HelloWorld";
        String s2 = "helloworld";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3 = "abc";
        String s4 = s3.concat("def");
        System.out.println(s4);

        String s5 = "abc";
        String s6 = new String("abe");
        System.out.println(s5.compareTo(s6));

        String s7 = "北京尚硅谷教育";
        String s8 = s7.substring(2);
        System.out.println(s7);
        System.out.println(s8);

        String s9 = s7.substring(2, 5);//左闭右开
        System.out.println(s9);

    }

    @Test
    public void test1(){
        String s1 = "HelloWorld";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(9));

        System.out.println(s1.isEmpty());
        String s2 = s1.toLowerCase();//s1不变
        System.out.println(s1);
        System.out.println(s2);

        String s3 = "   he  ll o  wo rl d   ";
        String s4 = s3.trim();//去除首尾的空格
        System.out.println("------" + s3 + "-------");
        System.out.println("------" + s4 + "-------");
    }
}
