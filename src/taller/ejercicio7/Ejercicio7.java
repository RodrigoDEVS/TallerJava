package taller.ejercicio7;

/*Lee un número por teclado y comprueba que este numero es mayor o igual que cero,
si no lo es lo volverá a pedir (do while), después muestra ese número por consola.*/

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numero;
        do{
            System.out.println("Ingrese el número para comprobar:");
            numero = leer.nextInt();
        }while(!(numero >= 0));
        System.out.println("Tu numero es:" + numero);
    }
}
