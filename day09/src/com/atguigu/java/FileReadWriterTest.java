package com.atguigu.java;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author ganccl
 * @create 2022-10-31 20:36
 *
 * 一、流的分类：
 * 1.操作数据单位：字节流、字符流
 * 2.数据的流向：输入流、输出流
 * 3.流的角色：字节流、处理流
 *
 * 二、流的体系结构
 * 抽象基类                     节点流                               缓冲流（处理流的一种）
 * InputStream                 FileInputStream                    BufferedInputStream
 * OutputStream                FileOutputStream                   BufferedOutputStream
 * Reader                      FileReader                         BufferedReader
 * Writer                      FileWriter                         BufferedWriter
 *
 *
 */
public class FileReadWriterTest {

    /*
    * 将day09下的hello.txt文件内容读入程序中，并输出到控制台
    * */
    @Test
    public void testFileReader() {
        FileReader fr = null;
        try {
            //1.实例化File类的对象，指明要操作的文件
            File file = new File("hello.txt");
            //2.提供具体的流
            fr = new FileReader(file);

            //3.数据的读入
//        int data = fr.read();
//        while (data != -1){
//            System.out.print((char)data);
//            data = fr.read();
//        }
            int data;
            while ((data = fr.read()) != -1){
                System.out.print((char) data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //4.流的关闭操作
            try {
                if (fr == null){
                    fr.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

    //对read()操作的升级：使用read重载方法
    @Test
    public void testFileReader1(){
        FileReader fr = null;
        try {
            //1.File类的实例化
            File file = new File("hello.txt");

            //2.FileReader流的实例化
            fr = new FileReader(file);

            //3.读入的操作
            char[] cbuf = new char[5];
            int len = 0;
            while ((len = fr.read(cbuf)) != -1){
                //方式一：
//                for (int i = 0; i < len; i++) {
//                    System.out.print(cbuf[i]);
//                }

                //方式二：
                String str = new String(cbuf,0,len);
                System.out.print(str);
            }
            fr.read(cbuf);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

            //4.流的关闭
            try {
                if (fr != null)
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

    /*
    * 从内存中写出数据到硬盘的文件里
    * 说明：
    * 1.输出操作，对应的File可以不存在
    *   如果不存在，在输出的过程中，会自动创建此文件
    *   如果存在：FileWriter(file,false)/FileWriter(file) 覆盖
    *           FileWriter(file,true) 追加操作
    *
    * */
    @Test
    public void testFileWriter() throws IOException {
        //1.提供File类对象，指明写出到的文件
        File file = new File("hello1.txt");

        //2.提供FileWriter的对象，用于数据的写出
        FileWriter fw = new FileWriter(file);

        //3.写出的操作
        fw.write("I have a dream!\n");
        fw.write("You need to have a dream!");

        //4.流资源的关闭
        fw.close();
    }

    @Test
    public void testFileReaderFileWriter(){
        FileReader fr = null;
        FileWriter fw = null;
        try {
            //1.创建File类的对象，指明读入和写出的文件
            File srcFile = new File("hello.txt");
            File destFile = new File("hello2.txt");

            //2.创建输入流和输出流的对象
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            //3.数据的读入和写出操作
            int len;
            char[] cbuf = new char[5];
            while ((len = fr.read(cbuf)) != -1){
                fw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //4.流资源的关闭
            try {
                if (fw != null){
                    fw.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try {
                if (fr != null){
                    fr.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
