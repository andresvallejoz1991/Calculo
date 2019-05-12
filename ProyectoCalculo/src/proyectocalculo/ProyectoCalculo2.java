/*
 Seleccion de 10 ecuaciones a resolver mediante ingreso por teclado de X
 */
package proyectocalculo;

import java.util.Scanner;

/**
 *
 * @author Andrés,Ricardo,Genesis
 */
public class ProyectoCalculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int x;
        int i;
        int y;
        int limite;
        String opcion;
        System.out.println("______________________________________\n"
                + "Eliga una de la siguentes ecuaciones\n"
                + " 1.  Ecuacion 1 (4x+6)              \n"
                + " 2.  Ecuacion 2 (2x^2+5)            \n"
                + " 3.  Ecuacion 3 (x^3-2x+8)          \n"
                + " 4   Ecuacion 4 (√x+6)              \n"
                + " 5.  Ecuacion 5 Log 4x+4\")         \n"
                + " 6.  Ecuacion 6 (8x+6)              \n"
                + " 7.  Ecuacion 7 (2x^2+5)            \n"
                + " 8.  Ecuacion 8 (4x^3-5x+13)        \n"
                + " 9.  Ecuacion 9 (√x^2+6x+2)         \n"
                + " 10. Ecuacion 10 log(√2x+6)         \n"
                + "____________________________________\n"
                + "Escriba la opcion:");
        opcion = sc.next();
        System.out.println("Cuantos numeros en x desea");
        limite = sc.nextInt();
        switch (opcion) {
            case "1":
                for (i = 0; i <= limite; i++) {
                    System.out.println("Ingrese el valor de X");
                    x = sc.nextInt();
                    y = 4 * (x) + 6;
                    tabla = String.format("%s\n%d\t%d ", tabla, x, y);
                }
                break;
            case "2":
                System.out.println("Ecuacion 2 (2x^2+5)");
                for (i = 0; i <= limite; i++) {
                    System.out.println("Ingrese el valor de X");
                    x = sc.nextInt();
                    y = 2 * (x * x) + 5;
                    tabla = String.format("%s\n%d\t%d ", tabla, x, y);
                }
                break;
            case "3":
                System.out.println("Ecuacion 3 (x^3-2x+8)");
                for (i = 0; i <= limite; i++) {
                    System.out.println("Ingrese el valor de X");
                    x = sc.nextInt();
                    y = (x * x * x) - 2 * (x) + 8;
                    tabla = String.format("%s\n%d\t%d ", tabla, x, y);
                }
                break;
            case "4":
                System.out.println("Ecuacion 4 (√x+6)");
                for (i = 0; i <= limite; i++) {
                    System.out.println("Ingrese el valor de X");
                    float x1 = sc.nextInt();
                    float y2 = (float) Math.pow((x1 + 6), (0.5));
                    tabla = String.format("%s\n%f\t%f ", tabla, x1, y2);
                }
                break;
            case "5":
                System.out.println("Ecuacion 5 Log 4x+4");
                for (i = 0; i <= limite; i++) {
                    System.out.println("Ingrese el valor de X");
                    double x2 = sc.nextInt();
                    double y2 = Math.log10(x2 * 4 + 4);
                    tabla = String.format("%s\n%f\t%f ", tabla, x2, y2);
                }
                break;
            case "6":
                System.out.println("Ecuacion 6 (8x+6)");
                for (i = 0; i <= limite; i++) {
                    System.out.println("Ingrese el valor de X");
                    x = sc.nextInt();
                    y = 4 * (x) + 6;
                    tabla = String.format("%s\n%d\t%d ", tabla, x, y);
                }
                break;
            case "7":
                System.out.println("Ecuacion 7 (2x^2+5)");
                for (i = 0; i <= limite; i++) {
                    System.out.println("Ingrese el valor de X");
                    x = sc.nextInt();
                    y = 2 * (x * x) + 5;
                    tabla = String.format("%s\n%d\t%d ", tabla, x, y);
                }
                break;
            case "8":
                System.out.println("Ecuacion 8 (4x^3-5x+13)");
                for (i = 0; i <= limite; i++) {
                    System.out.println("Ingrese el valor de X");
                    x = sc.nextInt();
                    y = 4 * (x * x * x) - 5 * (x) + 13;
                    tabla = String.format("%s\n%d\t%d ", tabla, x, y);
                }
                break;
            case "9":
                System.out.println("Ecuacion 9 (√x^2+6x+2)");
                for (i = 0; i <= liite; i++) {
                    System.out.println("Ingrese el valor de X");
                    float x1 = sc.nextInt();
                    float y2 = (float) Math.pow(((x1 * x1) + (6 * x1)), (0.5));
                    tabla = String.format("%s\n%f\t%f ", tabla, x1, y2);
                }
                break;
            case "10":
                System.out.println("Ecuacion 10 log(√2x+6)");
                for (i = 0; i <= limite; i++) {
                    System.out.println("Ingrese el valor de X");
                    double x2 = sc.nextInt();
                    double y2 = Math.log10(Math.pow(x2 * 2 + 6, 0.5));
                    tabla = String.format("%s\n%f\t%f ", tabla, x2, y2);
                }
                break;
            default:
                System.out.println("no se ah seleccionado una ecuacion");
        }
    }
}
