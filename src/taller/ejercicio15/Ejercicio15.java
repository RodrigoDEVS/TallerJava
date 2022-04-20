package taller.ejercicio15;

/*Hacer un programa que muestre el siguiente menú de opciones
        ******GESTION CINEMATOGRÁFICA********
1-NUEVO ACTOR
2-BUSCAR ACTOR
3-ELIMINAR ACTOR
4-MODIFICAR ACTOR
5-VER TODOS LOS ACTORES
6-VER PELICULAS DE LOS ACTORES
7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
8-SALIR
EL SISTEMA SOLO VA A SALIR CUANDO SE DIGITE EL NUMERO 8,MIENTRAS SE DIGITE UNA DE LAS CINCO OPCIONES DEBE SEGUIR
MOSTRADO EL MENU Y SI EL USUARIO DIGITA UN NUMERO QUE NO ESTA EN EL MENU SE DEBE ARROJAR UN MENSAJE" OPCION INCORRECTO".
Y MOSTRAR EL MENU NUEVAMENTE.
PISTA:CONVINAR SWICHT Y ALGUNO DE LOS BUCLES.*/

import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("               ******GESTION CINEMATOGRÁFICA********         \n1-NUEVO ACTOR\n2-BUSCAR ACTOR\n" +
                    "3-ELIMINAR ACTOR\n4-MODIFICAR ACTOR\n5-VER TODOS LOS ACTORES\n6-VER PELICULAS DE LOS ACTORES\n" +
                    "7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n8-SALIR");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1: {
                    System.out.println("Seleccionaste Nuevo Actor");
                    break;
                }
                case 2: {
                    System.out.println("Seleccionaste Buscar Actor");
                    break;
                }
                case 3: {
                    System.out.println("Seleccionaste Eliminar Actor");
                    break;
                }
                case 4: {
                    System.out.println("Seleccionaste Modificar Actor");
                    break;
                }
                case 5: {
                    System.out.println("Seleccionaste Ver Todos Los Actores");
                    break;
                }
                case 6: {
                    System.out.println("Seleccionaste Ver Peliculas de los Actores");
                    break;
                }
                case 7: {
                    System.out.println("Seleccionaste Ver Categoria de las Peliculas de los Actores");
                    break;
                }
                case 8: {
                    System.out.println("Hasta Pronto");
                    break;
                }
                default: {
                    System.out.println("Opción Inválida");
                }
            }
        } while (opcion != 8);
    }
}
