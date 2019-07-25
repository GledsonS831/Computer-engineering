package br.com.bb;



import java.util.*;
import java.util.Comparator.*;
public class cadastro {
    public static void main(String[] args){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    for (int i = 0; i < 10; i++) {
                        System.out.println(i);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    notify();
                }
            }
        };
        Thread t = new Thread(r1);
        t.start();
        synchronized(t){
            try{
                System.out.println("esperar algo");
                t.wait();
            }catch (Exception e){}
        }
        Thread t2 = new Thread(r1);
        t2.start();

    }
}
