package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 集合元素的遍历操作
 * @author ganccl
 * @create 2022-07-19 11:30
 */
public class IteratorTest {

    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry",20));

        Iterator iterator = coll.iterator();

//        for(int i = 0;i < coll.size();i++){
//            System.out.println(iterator.next());
//        }

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
