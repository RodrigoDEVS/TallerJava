package taller.ejercicio9;

/*Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza todas las a del String
anterior por una e, adicionalmente concatenar a esta frase una adicional que ustedes quieran
incluir por consola y las muestre luego unidas.*/

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        String fraseOriginal = "La sonrisa sera la mejor arma contra la tristeza ";
        String fraseModificada = fraseOriginal.replace("a", "e");
        Scanner leer = new Scanner(System.in);
        System.out.println("Inspirate escribiendo una frase: ");
        String frase = leer.nextLine();
        System.out.println("frase = " + fraseModificada.concat(frase));
    }
}
