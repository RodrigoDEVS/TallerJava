package taller.ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Persona persona1 = new Persona();

        Scanner leer = new Scanner(System.in);
        System.out.println("Escriba el Nombre: ");
        persona1.setNombre(leer.nextLine());
        System.out.println("Escriba la Edad: ");
        persona1.setEdad(leer.nextInt());
        System.out.println("Escriba el Sexo: (H (hombre), M (Mujer)");
        persona1.setSexo(leer.next().charAt(0));
        System.out.println("Escriba el Peso: ");
        persona1.setPeso(leer.nextInt());
        System.out.println("Escriba la Altura: ejemplo(1,70)");
        persona1.setAltura(leer.nextFloat());

        Persona persona2 = new Persona("Paola Andrea Gallego", 41, 'M');

        Persona persona3 = new Persona();

        persona3.setNombre("Andres Lopez");
        persona3.setEdad(16);
        persona3.setSexo('H');
        persona3.setPeso(60);
        persona3.setAltura(1.69f);


        System.out.println(persona1);
        persona1.calcularIMC();
        persona1.esMayorDeEdad();
        System.out.println(persona2);
        persona2.calcularIMC();
        persona2.esMayorDeEdad();
        System.out.println(persona3);
        persona3.calcularIMC();
        persona3.esMayorDeEdad();
    }
}
