package taller.ejercicio1;

public class Ejercicio1 {
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

        Ejercicio1 ejercicio = new Ejercicio1();
        int valor1 = 10;
        int valor2 = 20;

        ejercicio.numeroMayor(valor1, valor2);
        ejercicio.numeroMenor(valor1, valor2);
        ejercicio.numerosIguales(valor1, valor2);
    }
}
