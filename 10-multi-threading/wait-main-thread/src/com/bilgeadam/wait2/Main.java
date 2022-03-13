package com.bilgeadam.wait2;

import com.bilgeadam.wait2.threads.CountThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CountThread countThread = new CountThread();
        countThread.start();
        do{
            /*System.out.println(countThread.isAlive());
            Thread.sleep(1);*/
        }while (countThread.isAlive());

        System.out.println(countThread.isAlive() + " main thread tamamlandı.");
    }
}
