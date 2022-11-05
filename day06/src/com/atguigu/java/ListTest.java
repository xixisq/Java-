package com.atguigu.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 1.List接口框架
 * /-----Collection接口：单列集合，用来存储一个一个的对象
 *      /-----List接口：存储有序的、可重复的数据。--->“动态”数组，替换原有的数组
 *           /-----ArrayList：作为List接口的主要实现类，线程安全的，效率高；底层使用Object[] elementData存储
 *           /-----LinkedList：对于频繁的插入、删除操作，使用此类效率比ArrayList高；底层使用的是双向链表存储
 *           /-----Vector：作为List接口的古老实现类，线程安全的，效率低；底层使用Object[] elementData存储
 *
 * 2.ArrayList的源码分析：
 *  2.1 jdk 7情况下
 *   ArrayList list = new ArrayList();//底层创建了长度是10的Object[]数组elementdata
 *   list.add(123);//elementData[0] = new Integer(123);
 *   ...
 *   list.add(11);//如果此次的添加导致底层elementData数组容量不够，则扩容。
 *   默认情况下，扩容为原来的容量的1.5倍，同时需要将原有数组中的数据复制到新的数组中。
 *
 *   结论：建议开发中使用带参的构造器：ArrayList list = new ArrayList(int capacity);
 *
 *
 *  2.2 jdk 8中ArrayList的变化
 *      ArrayList list = new ArrayList();//底层Object[] elementData初始化为{}，并没有创建长度为10的数组
 *      list.add(123);//第一次调用add()时，底层才创建了长度为10的数组，并将数据123添加到elementData[0]
 *      ...
 *      后续的添加和扩容与jdk 7无异
 *
 *  2.3 小结：jdk7中的ArrayList的创建类似于单例的饿汉式，而jdk8中的ArrayList的对象的创建
 *            类似于单例的懒汉式，延迟了数组的创建，节省内存。
 *
 * 3.LinkedList的源码分析
 *      LinkedList list = new LinkedList();内部声明了Node类型的first和last属性，默认值为null
 *      list.add(123);//将123封装到Node中，创建了Node对象
 *
 * 面试题：ArrayList、LinkedList、Vector三者的异同？
 * 同：三个类都是实现了List接口，存储数据的特点相同：存储有序的、可重复的数据
 * 不同：
 * @author gccstart
 * @create 2022-03-01 9:38
 */
public class ListTest {

    /*
    * 总结常用方法
    * 增：add(Object obj)
    * 删：remove(int index) / remove(Object object)
    * 改：set(int index,Object ele)
    * 查：get(int index)
    * 插：add(int index，Object ele)
    * 长度：size()
    * 遍历：①Iterator迭代器方式
    *       ②增强for循环
    *       ③普通的循环
    *
    * */

    @Test
    public void test2(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");

        //方式一：Iterator迭代器方式
        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("***********");
        //方式二：增强for循环
        for(Object obj : list){
            System.out.println(obj);
        }

        System.out.println("**********");
        //方式三：普通for循环
        for (int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }
    }

    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add(new Person("Tom",12));
        list.add(456);

//        int index = list.indexOf(456);
//        int lastIndexOf = list.lastIndexOf(456);
//        System.out.println(index);
//        System.out.println(lastIndexOf);

        list.set(1,"CC");
        System.out.println(list);

        //subList 左闭右开子集和
        System.out.println(list.subList(3, 4));
    }

}
