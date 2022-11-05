package com.atguigu.java1;

import com.atguigu.java.Person;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


/**
 * @author ganccl
 * @create 2022-10-04 21:11
 *
 * 1.Set接口中没有额外定义新的方法，使用的都是Collection中声明的方法
 *
 * 2.要求：向Set中添加的数据，其所在的类一定要重写hashCode（）和equals（）
 */
public class SetTest {

    /*
    * 一、Set:存储无序的、不可重复的数据
    * 1.无序性:不等于随机性
    *
    * 2.不可重复性：保证添加的元素按照equals（）判断时，不能返回true。
    *
    * 二、添加元素过程：以HashSet为例：
    *   我们向HashSet中添加元素a，首先调用元素a所在类的hashCode（）方法，计算元素a的哈希值，
    *   此哈希值接着通过某种算法计算出HashSet底层数组中的存放位置（即为：索引位置），判断数组此位置上是否已经有元素：
    *       如果此位置上没有其他元素，则元素a添加成功。--->情况1
    *       如果此位置上有其他元素b（或以链表形式存在的多个元素），则比较元素a和元素b的hash值：
    *           如果hash值不相同，则元素a添加成功。--->情况2
    *           如果hash值相同，进而需要调用元素a所在类的equals（）方法：true添加成功，false添加失败。--->情况3
    *
    *
    *   对于添加成功的情况2和3而言，元素a 与已经存在指定索引位置上数据以链表的方式存储。
    *   jdk 7：元素a放到数组中，指向原来的元素
    *   jdk 8：原来的元素在数组中，指向元素a
    *   总结：七上八下
    *
    * HashSet底层：数组+链表
    * */

    @Test
    public void test1(){
        Set set = new HashSet();
        set.add(456);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new Person("Tom",12));
        set.add(129);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    //LinkedHashSet的使用
    //LinkedHashSet作为HashSet的子类，在添加数据的同时，每个数据还维护了两个引用，记录
    //前一个数据和后一个数据
    //优点：对于频繁的遍历操作，效率高
    @Test
    public void test2(){
        Set set = new LinkedHashSet();
        set.add(456);
        set.add(123);
        set.add("AA");
        set.add("CC");
        set.add(new Person("Tom",12));
        set.add(129);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
