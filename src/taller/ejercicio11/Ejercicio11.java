package taller.ejercicio11;

/*Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola,
indicar cual es la longitud de esta frase, adicionalmente cuantas vocales tiene de “a,e,i,o,u”.*/

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {
        String vocal="aeiou";
        int numeroVocales=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase completa: ");
        String frase = leer.nextLine();
        System.out.println("La longitud de la frase ingresada es de: " + frase.length());

        for(int i=0; i<frase.length(); i++){
            for(int j=0; j<vocal.length(); j++){
                if(frase.charAt(i)==vocal.charAt(j)){
                    numeroVocales++;
                }
            }
        }
        System.out.println("La cantidad de vocales en la frase es: " + numeroVocales);
    }
}
