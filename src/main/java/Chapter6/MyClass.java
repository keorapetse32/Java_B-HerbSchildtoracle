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
public class MyClass {
  private int alpha; // private access 
  public int beta; // public access 
  int gamma; // default access
 
  /* Methods to access alpha.  It is OK for a 
     member of a class to access a private member 
     of the same class. 
  */ 
  void setAlpha(int a) { 
    alpha = a;  
  } 
 
  int getAlpha() { 
    return alpha; 
  }
  
  int x;  
  
  MyClass() { 
    System.out.println("Inside MyClass()."); 
    x = 0; 
  } 
 
  MyClass(int i) {  
    System.out.println("Inside MyClass(int)."); 
    x = i;  
  } 
 
  MyClass(double d) { 
    System.out.println("Inside MyClass(double)."); 
    x = (int) d; 
  } 
 
  MyClass(int i, int j) { 
    System.out.println("Inside MyClass(int, int)."); 
    x = i * j; 
  }
}
