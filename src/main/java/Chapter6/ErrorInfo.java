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
public class ErrorInfo {
    String msgs[] = { 
    "Output Error", 
    "Input Error", 
    "Disk Full", 
    "Index Out-Of-Bounds" 
  }; 
  int howbad[] = { 3, 3, 2, 4 }; 
 
  Err getErrorInfo(int i) { 
    if(i >=0 & i < msgs.length) 
      return new Err(msgs[i], howbad[i]); 
    else 
      return new Err("Invalid Error Code", 0); 
  }
}
