package com.company;

public class Task1_3 {
    public static void main(String[] args) {

        System.out.println("Main thread started...");
        for(int i=1; i < 6; i++)
            new JThread1("JThread " + i).start();
        System.out.println("Main thread finished...");
    }
}

class JThread1 extends Thread {

    JThread1(String name){
        super(name);
    }

    public void run(){

        System.out.printf("%s started... \n", Thread.currentThread().getName());
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s fiished... \n", Thread.currentThread().getName());
    }
}

