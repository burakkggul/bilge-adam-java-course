package com.bilgeadam.wait3;

import com.bilgeadam.wait3.threads.CountThread;

public class Main {
    public static void main(String[] args) {
        CountThread countThread = new CountThread();
        CountThread countThread2 = new CountThread();
        CountThread countThread3 = new CountThread();
        CountThread countThread4 = new CountThread();
        countThread.start();
        countThread2.start();
        countThread3.start();
        countThread4.start();

        /*try{
            countThread.join();
            countThread2.join();
            countThread3.join();
            countThread4.join();
        }catch (InterruptedException interruptedException){
            System.err.println(interruptedException.getMessage());
        }*/


        System.out.println("main thread başarılı bir şekilde tamamlandı.");
    }
}
