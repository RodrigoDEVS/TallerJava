package taller.ejercicio4;

/*Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA.
El IVA sera una constante que sera del 21%.*/

import java.util.Scanner;

public class Ejercicio4 {

    private final double IVA = 0.21;

    public double precioFinal(double valor){
        double impuesto = valor * IVA;
        double total = impuesto + valor;
        return total;
    }
    public static void main(String[] args) {
        Ejercicio4 ejercicio = new Ejercicio4();

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor del artículo: ");
        double valor = leer.nextDouble();

        System.out.println("El valor con IVA incluido es: " + ejercicio.precioFinal(valor));
    }
}
