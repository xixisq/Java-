package com.atguigu.java;

import org.junit.Test;

import java.util.*;

/**
 * @author ganccl
 * @create 2022-10-25 9:40
 *
 * 泛型的使用
 * 1.jdk 5.0新增的特性
 *
 * 2.在集合中使用泛型：
 *  总结：
 *  ①集合接口或集合类在jdk5.0时都修改为带泛型的结构
 *  ②在实例化集合类时，可以指明具体的泛型类型
 *  ③指明完以后，在集合类或接口中凡是定义类或接口时，内部结构使用到泛型的位置，都指定为实例化的泛型类型
 *  ④注意点：泛型的类型必须是类，不能是基本数据类型，需要用到基本数据类型的位置，拿包装类替换
 *
 * 3.如何自定义泛型结构：泛型类、泛型接口；泛型方法
 */
public class GenericTest {

    //在集合中使用泛型的情况,以ArrayList为例
    @Test
    public void test1(){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(78);
        list.add(90);
        list.add(79);
        list.add(89);
        //编译时，就会进行类型检查，保证数据的安全
//        list.add("Tom");

        for (Integer score : list){
            //避免了强转操作
            int stuScore = score;
            System.out.println(stuScore);
        }
    }

    //在集合中使用泛型的情况：以HashMap为例
    @Test
    public void test2(){
        Map<String,Integer> map = new HashMap<String,Integer>();

        map.put("Tom",87);
        map.put("Jerry",80);
        map.put("Jack",90);

        //泛型的嵌套
        Set<Map.Entry<String,Integer>> entry = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entry.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> e = iterator.next();
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key + "---" + value);
        }
    }
}
