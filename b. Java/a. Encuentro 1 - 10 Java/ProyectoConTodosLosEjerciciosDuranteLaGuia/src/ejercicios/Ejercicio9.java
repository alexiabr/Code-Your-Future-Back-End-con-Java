
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Luciana
 */

/* Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break. */

public class Ejercicio9 {
    public static void main(String[] args) {
   int num, suma = 0, contador = 20;
   Scanner leer = new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero, aun le quedan " + contador + " intentos");
            num = leer.nextInt();
            contador--;
            if (num < 0) 
                continue;
            else {
            suma += num;
            }
           
        } while (num != 0 || contador == 0);
        System.out.println("Se capturo el numero y la suma de todos los numeros ingresados es " + suma);
    }
}
