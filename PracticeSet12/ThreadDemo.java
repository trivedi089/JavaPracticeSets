import java.util.*;

public class ThreadDemo {

    public static void main(String[] args){

        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }
    
}

class MyThread1 extends Thread{
    public void run(){
        while(true)
        System.out.println("Thread1 is working");
    }
}

class MyThread2 extends Thread{
    public void run(){
        while(true)
        System.out.println("Thread2 is working");
    }
}
