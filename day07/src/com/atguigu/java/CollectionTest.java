package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author ganccl
 * @create 2022-10-22 16:15
 *
 * Collection:操作Collection、Map的工具类
 *
 * 面试题：Collection 和 Collections的区别？
 *
 */
public class CollectionTest {

    @Test
    public void test1(){
        List list = new ArrayList();

        list.add(123);
        list.add(123);
        list.add(123);
        list.add(97);
        list.add(23);
        list.add(-97);
        list.add(0);

        System.out.println(list);

//        Collections.reverse(list);
//        Collections.shuffle(list);
//        Collections.swap(list,1,2);
        int frequency = Collections.frequency(list, 123);
        System.out.println(frequency);
    }
}
