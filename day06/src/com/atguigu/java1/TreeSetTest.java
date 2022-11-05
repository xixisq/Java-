package com.atguigu.java1;

import com.atguigu.java.Person;
import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author ganccl
 * @create 2022-10-05 15:34
 *
 * 1.向TreeSet中添加的数据，要求是相同类的对象
 * 2.两种排序方式：自然排序 和 定制排序
 */
public class TreeSetTest {

    @Test
    public void test1(){
        Set set = new TreeSet();


        set.add(new Person("Tom",12));
        set.add(new Person("Jerry",32));
        set.add(new Person("Jim",2));
        set.add(new Person("Mike",65));
        set.add(new Person("Jack",33));
        set.add(new Person("Jack",56));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }


    @Test
    public void test2(){
        Comparator com = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {

                if(o1 instanceof Person && o2 instanceof Person){
                    Person p1 = (Person) o1;
                    Person p2 = (Person) o2;
                    return Integer.compare(p1.getAge(),p2.getAge());
                }else {
                    throw new RuntimeException("输入的类型不匹配");
                }
            }
        };

        TreeSet set = new TreeSet(com);

        set.add(new Person("Tom",12));
        set.add(new Person("Jerry",32));
        set.add(new Person("Jim",2));
        set.add(new Person("Mike",65));
        set.add(new Person("Jack",33));
        set.add(new Person("Mary",33));
        set.add(new Person("Jack",56));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
