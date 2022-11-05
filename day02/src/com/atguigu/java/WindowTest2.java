package com.atguigu.java;

/**
 * @author gccstart
 * @create 2021-12-07 9:30
 */

/**
 * 使用同步代码块解决继承Thread类的方式的线程安全问题
 *
 * 例子：创建三个窗口卖票，总票数为张，使用继承Thread类的方式
 *
 * 说明：在继承Thread类创建多线程的方式中，慎用this充当同步监视器。
 *
 *
 * @author gccstart
 * @create 2021-11-24 9:04
 */
class Window2 extends Thread{
    private static int ticket = 100;

    private static Object obj = new Object();
    @Override
    public void run() {
        while(true){

            synchronized(Window2.class){//Window.class只会实现一次
           // synchronized(obj){

                if(ticket > 0){

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(getName() + ":卖票，票号为：" + ticket);
                    ticket--;
                }else{
                    break;
                }
            }

        }
    }
}



public class WindowTest2 {

    public static void main(String[] args) {

        Window2 t1 = new Window2();
        Window2 t2 = new Window2();
        Window2 t3 = new Window2();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();


    }
}
