/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocalculo;
import java.util.Scanner;
/**
 *
 * @author Andrés
 */
public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int i;
     System.out.println("Ecuacion 8 (4x^3-5x+13)");
     for(i= 0; i<=5; i++){    
        System.out.println ("Ingrese el valor de X");
        int x = sc.nextInt();
        int y =4*(x*x*x)-5*(x)+13;
        System.out.printf ("Valores X-Y \nX Y  \n%d %d ",+x,+y);
        System.out.println("");
          
      }
     }
}
    
    
