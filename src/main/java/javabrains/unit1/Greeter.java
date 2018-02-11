/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabrains.unit1;

/**
 *
 * @author Hubert
 */
public class Greeter {

    
    public void greet(Greeting greeting) {
        greeting.perform();
    }
    
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        //Greeting helloWorldGreeting = new HelloWorldGreeting();
        //greeter.greet(helloWorldGreeting);
        
        
        //to co powyżej można zrobić za pomocą klasy anonimowej i pozbyć się nadmiarowej klasy HelloWorldGreeting
        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World!");
            }
        };
        
        innerClassGreeting.perform();
        
        //to samo zapisane jako Lambda
        Greeting lambdaGreeting = () -> System.out.println("Hello World!");
        greeter.greet(lambdaGreeting);
        //to samo można wywołać tak:
        lambdaGreeting.perform();
    }
    
}
