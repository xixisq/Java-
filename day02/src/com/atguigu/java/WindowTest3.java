package com.atguigu.java;

/**
 *
 * 使用同步方法解决实现Runable接口的线程安全问题
 *
 * 关于同步方法的总结：
 * 1.同步方法仍然涉及到同步监视器，只是不需要我们显式的声明
 * 2.非静态的同步方法，同步监视器是：this
 *   静态的同步方法，同步监视器是：当前类本身
 *
 *
 * @author gccstart
 * @create 2021-12-07 9:54
 */

class Window3 implements Runnable{
    private static int ticket = 100;

    Object obj = new Object();
    @Override
    public void run() {

        while(true){


            show();

        }
    }

    private synchronized void show(){

        if (ticket > 0) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);


            ticket--;
        }
    }
}

public class WindowTest3 {
    public static void main(String[] args) {
        Window3 window3 = new Window3();


        Thread t1 =new Thread(window3);
        Thread t2 =new Thread(window3);
        Thread t3 =new Thread(window3);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}