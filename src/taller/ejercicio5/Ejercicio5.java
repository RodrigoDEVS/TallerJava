package taller.ejercicio5;

//Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.

public class Ejercicio5 {
    public static void main(String[] args) {
        int numero = 1;
        while(numero <= 100){
            System.out.println((numero%2)==0?"Numero Par: "+numero:"Numero Impar: "+ numero);
            numero = numero ++;
        }
    }
}
