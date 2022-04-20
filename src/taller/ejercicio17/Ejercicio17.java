package taller.ejercicio17;

import java.util.Arrays;

public class Ejercicio17 {

    public static void main(String[] args) {
        Electrodomestico electrodomesticos[] = new Electrodomestico[10];

        Electrodomestico nevera = new Electrodomestico(300, 30);
        Electrodomestico horno = new Electrodomestico(150, "negro", 'A', 15);
        Electrodomestico licuadora = new Electrodomestico(50, "Rojo", 'C', 5);
        Electrodomestico arrocera = new Electrodomestico(50, "Blanco", 'E', 3);
        Electrodomestico freidora = new Electrodomestico(100, "Negro", 'D', 7);
        Electrodomestico lavadora = new Electrodomestico(300, "Blanco", 'B', 35);
        Television plasma = new Television(100, 25);
        Television CRT = new Television(14, false, 50, "gris", 'A', 20);
        Television LCD = new Television(24, false, 100, "Negro", 'D', 20);
        Television LED = new Television(50, true, 150, "Gris", 'E', 10);

        electrodomesticos[0] = horno;
        electrodomesticos[1] = nevera;
        electrodomesticos[2] = licuadora;
        electrodomesticos[3] = arrocera;
        electrodomesticos[4] = freidora;
        electrodomesticos[5] = lavadora;
        electrodomesticos[6] = plasma;
        electrodomesticos[7] = CRT;
        electrodomesticos[8] = LCD;
        electrodomesticos[9] = LED;

        int total = 0;
        for(int i=0;i<electrodomesticos.length ; i++)
        {
            electrodomesticos[i].precioFinal();
            System.out.println((electrodomesticos[i] instanceof Television)?"Precio Final Televisor: "+electrodomesticos[i].precioBase:
                    "Precio Final Electrodomestico: "+electrodomesticos[i].precioBase);
            total += electrodomesticos[i].precioBase;
        }
        System.out.println("Total: "+total);
        //Arrays.asList(electrodomesticos).forEach(System.out::println);
    }
}
