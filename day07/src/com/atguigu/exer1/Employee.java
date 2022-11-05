package com.atguigu.exer1;

/**
 * 定义一个Employee类
 * 该类包含：private成员变量name，age，birthday,其中birthday为MyDate类的对象；
 * 并为每一个属性定义getter，setter方法；并重写toString方法输出name,age,birthday
 *
 * @author ganccl
 * @create 2022-10-12 19:16
 */
public class Employee implements Comparable{
    private String name;
    private int age;
    private MyDate birthday;

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        if(o instanceof Employee){
            Employee e = (Employee) o;
            return this.name.compareTo(e.name);
        }
        throw new RuntimeException("输入的类型不匹配");
    }
}
