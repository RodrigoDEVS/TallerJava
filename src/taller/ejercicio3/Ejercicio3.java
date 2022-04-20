package taller.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public double areaCirculo(double radio){
        double area;
        double operacion = (Math.pow(radio,2))*(Math.PI);
        return area =  operacion;
    }

    public static void main(String[] args) {
        Ejercicio3 ejercicio = new Ejercicio3();

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Radio del círculo: ");
        double radio = Double.parseDouble(leer.next());

        System.out.println("El area del círculo es: " + ejercicio.areaCirculo(radio));


    }
}
