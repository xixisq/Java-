package com.atguigu.java;

/**
 * 例子：创建三个窗口卖票，总票数为张，使用实现Runable接口的方式
 * 存在线程的安全问题，待解决
 *
 * @author gccstart
 * @create 2021-11-24 9:43
 */
class Window1 implements Runnable{
    private static int ticket = 100;
    @Override
    public void run() {

        while(true){
            if(ticket > 0){
                System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
                ticket--;
            }else{
                break;
            }
        }
    }
}
public class WindowTest1 {
    public static void main(String[] args) {
        Window1 window1 = new Window1();


        Thread t1 =new Thread(window1);
        Thread t2 =new Thread(window1);
        Thread t3 =new Thread(window1);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
