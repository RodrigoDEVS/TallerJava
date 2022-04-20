package taller.ejercicio10;

//Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase completa:");
        String frase = leer.nextLine();
        System.out.println("Tu frase sin espacios: " + frase.replace(" ", ""));
    }
}
