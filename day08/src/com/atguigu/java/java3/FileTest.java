package com.atguigu.java.java3;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * File类的使用
 *
 * 1.File类的一个对象，代表一个文件或一个文件目录（俗称：文件夹）
 * 2.File类声明在java.io包下
 *
 *
 *
 * @author ganccl
 * @create 2022-10-29 20:07
 */
public class FileTest {
    /*
    * 如何创建File类的实例
    *
    * */
    @Test
    public void test1(){
        //构造器1
        File file1 = new File("hello.txt");
        File file2 = new File("D:\\workspace_idea1\\JavaSenior\\day08\\he.txt");

        System.out.println(file1);
        System.out.println(file2);

        //构造器2
        File file3 = new File("D:\\workspace_idea1","JavaSenior");
        System.out.println(file3);

        //构造器3
        File file4 = new File(file3,"hi.txt");
        System.out.println(file4);
    }

    @Test
    public void test2(){
        File file1 = new File("hello.txt");
        File file2 = new File("d:\\io\\hi.txt");

        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(new Date(file1.lastModified()));
        System.out.println();

        System.out.println(file2.getAbsoluteFile());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());
    }

    @Test
    public void test3(){
        File file = new File("D:\\workspace_idea1\\JavaSenior");

        String[] list = file.list();
        for(String s : list){
            System.out.println(s);
        }
        System.out.println();

        File[] files = file.listFiles();
        for(File f : files){
            System.out.println(f);
        }



    }

    /*
     * public boolean renameTo(File dest):把文件重命名为指定的文件路径
     * 比如：file1.renameTo(file2)为例：
     *   要想保证返回true，需要file1在硬盘中存在，且file2不能存在
     *
     * */
    @Test
    public void test4(){
        File file1 = new File("hello.txt");
        File file2 = new File("D:\\io\\hi.txt");

        boolean rename = file2.renameTo(file1);
        System.out.println(rename);
    }

    @Test
    public void test6() throws IOException {
        //文件创建
        File file1 = new File("hi.txt");
        if(!file1.exists()){
            file1.createNewFile();
            System.out.println("创建成功");
        }else {
            file1.delete();
            System.out.println("删除成功");
        }
        //文件目录的创建
    }
}
