
package ejerciciosdelfinaldelaguia;

import java.util.Scanner;

/**
 *
 * @author Luciana
 */

/* EJERCICIO 13
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *

*/
public class Ejercicio13 {
    
    
    public static void dibujarCuadrado() {
    Scanner scanner = new Scanner(System.in);
    int num;
        System.out.println("Ingrese un numero: ");
        num = scanner.nextInt();
        for (int i = 0; i< num; i++) {
            
           for (int j = 0; j < num; j++) {
            if (i == 0 || i == num-1 || j == 0 || j == num-1) {
                System.out.print("*");
            }
            else 
                   System.out.print(" ");
        }
            System.out.print("\n "); 
     }
   }
    
    public static void main(String[] args) {
    dibujarCuadrado();
    }
}

