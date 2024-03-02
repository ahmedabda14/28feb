/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg28feb;
import java.io.IOException;
/**
 *
 * @author ahmed
 */
public class TestThrows1 {
    void m()throws IOException{
        throws new IOException("Device error");
    }
    void n()throws IOException{
        m();
    }
    void p(){
        try{
            n();
        }catch(Exception e){System.out.println("exception handled");}
    }
    
        public static void main(String[] args) {
            TestThrows1 obj=  new TestThrows1();
            obj.p();
            System.out.println("normal flow...");
            
        }
}
