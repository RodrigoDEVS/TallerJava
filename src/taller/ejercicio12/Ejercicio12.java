package taller.ejercicio12;

//Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12 implements Comparable{

    public static void main(String[] args) {
        String comparacion="";

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la primer palabra");
        String palabra1 = leer.nextLine();
        System.out.println("Ingrese la segunda palabra");
        String palabra2 = leer.nextLine();

        char[] StringtoChar = palabra1.toCharArray();
        Arrays.sort(StringtoChar);
        String palabra1Ordenada = new String(StringtoChar);
        System.out.println("palabra1Ordenada = " + palabra1Ordenada);

        char[] StringtoChar2 = palabra2.toCharArray();
        Arrays.sort(StringtoChar2);
        String palabra2Ordenada = new String(StringtoChar2);
        System.out.println("palabra2Ordenada = " + palabra2Ordenada);

        String sumas = palabra1Ordenada+palabra2Ordenada;

        System.out.println(palabra1.equals(palabra2)?"Las palabras son iguales":"Las palabras son diferentes");
        System.out.println("diferencia entre las palabras: " + sumas.replaceAll("(.*)\\1+", ""));
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
