package javabrains.basics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hubert
 */
public class RunnableExample {

    public static void main(String[] args) {
        
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside Runnable");
            }
        });
        
        myThread.start();
        
        Thread myLambdaThread = new Thread(()->System.out.println("Printed inside Lambda Runnable"));
        
        myLambdaThread.start();
    }
}
