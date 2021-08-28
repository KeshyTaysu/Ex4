/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exf4;

/**
 *
 * @author user
 */
public class Exf4 {

    /**
     * @param args the command line arguments
     */
   static void lou(int x) {
     
      if (x>1){
      System.out.println("Você pode continuar");
      }
      
      else {
              
          System.out.println("Você não pode continuar");
              }
   }
    public static void main(String[] args) {
        int x=2;
        lou(x);
    }
    
}

