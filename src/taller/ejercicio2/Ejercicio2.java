package taller.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public void numeroMayor(int valor1, int valor2){
        if(valor1>valor2){
            System.out.println("Valor1 es mayor que Valor2");
        }
    }

    public void numeroMenor(int valor1, int valor2){
        if(valor1<valor2){
            System.out.println("Valor1 es menor que Valor2");
        }
    }

    public static void numerosIguales(int valor1, int valor2){
        if(valor1==valor2){
            System.out.println("Los números son iguales");
        }
    }

    public static void main(String[] args) {

        Ejercicio2 ejercicio = new Ejercicio2();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        int valor1 = leer.nextInt();
        System.out.println("Ingrese el segundo valor");
        int valor2 = leer.nextInt();

        ejercicio.numeroMayor(valor1, valor2);
        ejercicio.numeroMenor(valor1, valor2);
        ejercicio.numerosIguales(valor1, valor2);
    }
}
