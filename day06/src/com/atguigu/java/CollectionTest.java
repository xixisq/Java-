package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Collection接口中声明的方法的测试
 *
 * @author ganccl
 * @create 2022-07-19 9:38
 */
public class CollectionTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry",20));

        //1.contains(Object obj):判断当前集合中是否包含obj
        boolean contains = coll.contains(123);
        System.out.println(contains);
        System.out.println(coll.contains(new String("Tom")));


        //2.containsALL
        Collection coll1 = Arrays.asList(123,4567);
        System.out.println(coll.containsAll(coll1));

    }

    @Test
    public void test2(){
        //3.remove()
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry",20));

        System.out.println(coll.remove(1234));

        //4.removeAll()
        Collection coll1 = Arrays.asList(123,456);
        coll.removeAll(coll1);
        System.out.println(coll);

        //5.retainAll()

        //6.equals()

        //7.hashCode()
        System.out.println(coll.hashCode());

        //8.集合 ---> 数组:toArray()

        //9.iterator:返回Iterator接口的实例，用于遍历集合元素。
    }




}
