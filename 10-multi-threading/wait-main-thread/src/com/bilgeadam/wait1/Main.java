package com.bilgeadam.wait1;

import com.bilgeadam.wait1.threads.CountThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(5000);
        CountThread countThread = new CountThread();
        countThread.start();
        Thread.sleep(10000);
    }
}
