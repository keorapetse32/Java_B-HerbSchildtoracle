/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter5;

/**
 *
 * @author keora
 */
public class NoZeroDiv2 {
    public static void main(String args[]) { 
 
    for(int i = -5; i < 6; i++)  
      if(i != 0 ? true : false)  
        System.out.println("100 / " + i + 
                           " is " + 100 / i); 
  }
}
