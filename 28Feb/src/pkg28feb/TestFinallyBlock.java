/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg28feb;

/**
 *
 * @author ahmed
 */
public class TestFinallyBlock {
                public static void main(String[] args) {
                    
                    try{
                        int data =25/0;
                        System.out.println(data);
                    }
                    catch(NullPointerException e){System.out.println(e);}
          finally{System.out.println("Finally block is always excecuted");}
                    System.out.println("rest of the code...");
                }
}
