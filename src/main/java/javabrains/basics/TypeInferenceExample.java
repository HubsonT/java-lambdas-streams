/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabrains.basics;

/**
 *
 * @author Hubert
 */
public class TypeInferenceExample {

    public static void main(String[] args) {
        StringLengthLambda myLambda = s -> s.length();
        System.out.println(myLambda.getLength("Hello Lambda"));
        
    }
    
    
    interface StringLengthLambda {
        int getLength(String s);
    
    }
    
}
