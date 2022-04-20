package taller.ejercicio14;

/*Crear un programa que pida un numero por teclado y que imprima por pantalla los números
desde el numero introducido hasta 1000 con saldos de 2 en 2.*/

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numero = leer.nextInt();
        System.out.println(numero);
        while(numero<1000){
            numero += 2;
            System.out.println(numero);
        }
    }
}
