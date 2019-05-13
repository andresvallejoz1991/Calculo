/*
 Seleccion de 10 ecuaciones a resolver mediante ingreso por teclado de X
 */
package proyectocalculo;
import java.util.Scanner;
/**
 *
 * @author Andrés
 */
public class ProyectoCalculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner (System.in);
        int x;
        int i;
        int y;
    System.out.println("Ecuacion 1 (4x+6)");    
    for(i= 0; i<=5; i++){    
        System.out.println ("Ingrese el valor de X");
        x = sc.nextInt();
        y = 4*(x)+6;
        System.out.printf ("Valores X-Y \nX Y  \n%d %d ",+x,+y);
        System.out.println("");
     }
    System.out.println("Ecuacion 2 (2x^2+5)");   
    for(i= 0; i<=5; i++){    
        System.out.println ("Ingrese el valor de X");
        x = sc.nextInt();
        y = 2*(x*x)+5;
        System.out.printf ("Valores X-Y \nX Y  \n%d %d ",+x,+y);
        System.out.println("");
        
    }
    System.out.println("Ecuacion 3 (x^3-2x+8)");
     for(i= 0; i<=5; i++){    
        System.out.println ("Ingrese el valor de X");
        x = sc.nextInt();
        y =(x*x*x)-2*(x)+8;
        System.out.printf ("Valores X-Y \nX Y  \n%d %d ",+x,+y);
        System.out.println("");
        
    }
     System.out.println("Ecuacion 4 (√x+6)"); 
     for(i= 0; i<=5; i++){    
        System.out.println ("Ingrese el valor de X");
         float x1 = sc.nextInt();
        float y2 = (float) Math.pow((x1+6),(0.5));
        System.out.printf ("Valores X-Y \nX         \tY  \n%f1 %f1 ",+x1,+y2);
        System.out.println("");
    }
    System.out.println("Ecuacion 5 Log 4x+4");  
    for(i= 0; i<=5; i++){    
        System.out.println ("Ingrese el valor de X");
        double x2 = sc.nextInt();
        double y2 = Math.log10(x2*4+4);
        System.out.printf ("Valores X-Y \nX Y  \n%f1 %f1 ",+x2,+y2);
        System.out.println("");
    }
     System.out.println("Ecuacion 6 (8x+6)");    
    for(i= 0; i<=5; i++){    
        System.out.println ("Ingrese el valor de X");
        x = sc.nextInt();
        y = 4*(x)+6;
        System.out.printf ("Valores X-Y \nX Y  \n%d %d ",+x,+y);
        System.out.println("");
     }
     System.out.println("Ecuacion 7 (2x^2+5)");   
    for(i= 0; i<=5; i++){    
        System.out.println ("Ingrese el valor de X");
        x = sc.nextInt();
        y = 2*(x*x)+5;
        System.out.printf ("Valores X-Y \nX Y  \n%d %d ",+x,+y);
        System.out.println("");
        
    }
    System.out.println("Ecuacion 8 (4x^3-5x+13)");
     for(i= 0; i<=5; i++){    
        System.out.println ("Ingrese el valor de X");
        x = sc.nextInt();
        y =4*(x*x*x)-5*(x)+13;
        System.out.printf ("Valores X-Y \nX Y  \n%d %d ",+x,+y);
        System.out.println("");
        
    }
     System.out.println("Ecuacion 9 (√x^2+6x+2)"); 
     for(i= 0; i<=5; i++){    
        System.out.println ("Ingrese el valor de X");
         float x1 = sc.nextInt();
        float y2 = (float) Math.pow(((x1*x1)+(6*x1)),(0.5));
        System.out.printf ("Valores X-Y \nX         \tY  \n%f1 %f1 ",+x1,+y2);
        System.out.println("");
    }
     System.out.println("Ecuacion 10 log(√2x+6)");  
      for(i= 0; i<=5; i++){    
        System.out.println ("Ingrese el valor de X");
        double x2 = sc.nextInt();
        double y2 = Math.log10(Math.pow(x2*2+6, 0.5));
        System.out.printf ("Valores X-Y \nX \tY  \n%f1 %f1 ",+x2,+y2);
        System.out.println("");
    }
 
    }
}
