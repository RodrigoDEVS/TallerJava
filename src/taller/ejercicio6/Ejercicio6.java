package taller.ejercicio6;

//Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle for.

public class Ejercicio6 {
    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++){
            System.out.println((i%2)==0?"Numero Par: "+i:"Numero Impar: "+ i);
        }
    }
}
