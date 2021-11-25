/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter7;

/**
 *
 * @author keora
 */
public class Truck extends Vehicle {
    private int cargocap; // cargo capacity in pounds  
  
  // This is a constructor for Truck.  
  Truck(int p, int f, int m, int c) {  
    /* Initialize Vehicle members using 
       Vehicle's constructor. */ 
    super(p, f, m);  
 
    cargocap = c;  
  }  
 
  // Accessor methods for cargocap. 
  int getCargo() { return cargocap; } 
  void putCargo(int c) { cargocap = c; }
}
