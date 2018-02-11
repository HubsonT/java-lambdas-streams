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
        
        greeter.greet(new HelloWorldGreeting());
        
    }
    
}
