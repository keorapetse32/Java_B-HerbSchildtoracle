/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter6;

/**
 *
 * @author keora
 */
public class OverloadConsDemo {
   public static void main(String args[]) {    
    MyClass t1 = new MyClass();  
    MyClass t2 = new MyClass(88);  
    MyClass t3 = new MyClass(17.23);  
    MyClass t4 = new MyClass(2, 4);  
  
    System.out.println("t1.x: " + t1.x); 
    System.out.println("t2.x: " + t2.x); 
    System.out.println("t3.x: " + t3.x); 
    System.out.println("t4.x: " + t4.x); 
  }
}
