/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg28feb;

/**
 *
 * @author ahmed
 */
public class TestThrow1 {
    static void validateAge(int age){
        try{
        if(age<18)
            throw new ArithmeticException("not valid");
        else
            System.out.println("Welcome to vote");
    }catch(ArithmeticException e){System.out.println(e);}
    }
    public static void main(String[] args) {
            validateAge(2);       
                    }
    
}
