/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg28feb;

/**
 *
 * @author ahmed
 */
public class ExceptionDemo2 {
            public static void main(String[] args) {
                
                try{
                    int result=divide(10,0);
                   System.out.println("result "+result);
                } catch (ArithmeticException e){
       System.out.println("Arithmetic exception is captured"+e.getMessage());}
                System.out.println("Program continues after throw-catch block");

}
            
            private static int divide(int dividend, int divisor)throws ArithmeticException{
                if (divisor==0){
                    throw new ArithmeticException(" cannot divide by 0") ;
                    //System.out.println(" cannot divide by 0");
                }
                return dividend/divisor;
            }
}