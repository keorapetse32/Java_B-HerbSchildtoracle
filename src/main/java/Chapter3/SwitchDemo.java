/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter3;

/**
 *
 * @author keora
 */
public class SwitchDemo {
     public static void main(String args[]) { 
    int i; 
 
    for(i=0; i<10; i++) 
      switch(i) { 
        case 0:  
          System.out.println("i is zero"); 
          break; 
        case 1:  
          System.out.println("i is one"); 
          break; 
        case 2:  
          System.out.println("i is two"); 
          break; 
        case 3:  
          System.out.println("i is three"); 
          break; 
        case 4:  
          System.out.println("i is four"); 
          break; 
        default:  
          System.out.println("i is five or more"); 
      } 
      
  }
}
