package com.atguigu.java;

import org.junit.Test;

/**
 * 关于StringBuffer和StringBuilder的使用
 * 对比String、StringBuffer、StringBuilder三者的效率：
 * 从高到低排序：StringBuilder > StringBuffer > String
 *
 *
 * @author gccstart
 * @create 2022-02-26 10:21
 */
public class StringBufferBuliderTest {

    /*
    * 总结：
    * 增：append(xxx)
    * 删：delete(int start,int end)
    * 改：setCharAt(int a,char ch) / replace(int start,int end,String str)
    * 查：charAt(int n)
    * 插：insert(int offset,xxx)
    * 长度：length();
    * 遍历：for() + charAt() / toString()
    * */

    @Test
    public void test2(){
        StringBuffer s1 = new StringBuffer("abc");
        s1.append(1);
        s1.append('1');
        System.out.println(s1);

//        s1.delete(2,4);
//        s1.replace(2,4,"hello");
//        s1.insert(2,"false");
//        s1.reverse();
        String s2 = s1.substring(1, 3);
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s2);

    }

    /*
    * String、StringBuffer、StringBuilder三者的异同？
    * String:不可变的字符序列
    * StringBuffer:可变的字符序列：线程安全的，效率较低；
    * StringBuilder:可变的字符序列：线程不安全的，效率高
    * */
}
