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
public class SubStr {
    public static void main(String args[]) {  
    String orgstr = "Java makes the Web move."; 
 
    // construct a substring 
    String substr = orgstr.substring(5, 18); 
 
     
    System.out.println("orgstr: " + orgstr); 
    System.out.println("substr: " + substr); 
 
  }
}
