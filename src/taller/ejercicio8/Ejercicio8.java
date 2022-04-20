package taller.ejercicio8;

/*Crea una aplicación por consola que nos pida un día de la semana y que nos diga si es un día laboral o no.
Usa un switch para ello.*/

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Selecciona una opción para un día de la semana: \n 1.Lunes.\n 2.Martes.\n 3.Miercoles.\n " +
                "4.Jueves.\n 5.Viernes.\n 6.Sabado.\n 7.Domingo.");
        int dias = leer.nextInt();
        String mensaje = "es dia laboral";
        switch (dias){
            case 1: {
            }
            case 2: {
            }
            case 3: {
            }
            case 4: {
            }
            case 5: {
                System.out.println(mensaje);;
                break;
            }
            case 6: {
                System.out.println("Sabado  no es día laboral");
                break;
            }
            case 7: {
                System.out.println("El domingo es el día de descanso");
                break;
            }
            default:{
                System.out.println("Ingrese un día válido");
            }
        }
    }
}
