/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg28feb;

/**
 *
 * @author ahmed
 */
public class multipleCatch {
            public static void main(String[] args) {
try{
    try{
        System.out.println("going to dive");
        int b=39/0;
        
    }catch(ArithmeticException e){System.out.println(e);}
    try{
    int a[] =new int[5];
    a[5]=4;
}//catch(ArithmeticException e){System.out.println("cannot complete task");}
catch (ArrayIndexOutOfBoundsException e){System.out.println(/*"task 1 is completed"*/e);}
//catch(Exception e){System.out.println("task 2 is completed");}
  
    System.out.println("other statement");
}catch (Exception e){System.out.println("handled");}
System.out.println("normal flow...");
}
}

