package com.atguigu.java;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * /----Map:双列数据，存储key-value对的数据
 *      /---HashMap:作为Map的主要实现类；线程不安全，效率高；存储null的key和value
 *          /---LinkedHsahMap:保证在遍历map元素时，可以按照添加的顺序实现遍历
 *              原因：在原有的HashMap底层结构基础上，添加了一对指针，指向前一个和后一个元素
 *              频繁的遍历操作
 *      /---TreeMap:保证按照添加的key-value对进行排序，实现排序遍历
 *      /---Hashtable:作为古老的实现类;线程安全的，效率低
 *          /---Properties:
 *
 *
 *  面试题：
 *  1.HashMap的底层实现原理？
 *  2.HashMap 和 Hashtable的异同？
 *
 *  二、Map结构的理解
 *
 *  三、HashMap的底层实现原理？以jdk7为例说明：
 *
 *  五、Map中定义的方法
 *
 *
 * @author ganccl
 * @create 2022-10-13 14:55
 */
public class MapTest {

    @Test
    public void test2(){
        Map map = new HashMap();
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",56);
        map.put("AA",87);
        System.out.println(map);

        Map map1 = new HashMap();
        map1.put("CC",13);
        map1.put("DD",56);
        map.putAll(map1);
        System.out.println(map);
    }

    @Test
    public void test1(){
        Map map = new HashMap();
        map.put(null,1);
    }

}
