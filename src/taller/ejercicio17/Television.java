package taller.ejercicio17;

public class Television extends Electrodomestico{

    //Atributos
    private int resolucion = 20;
    private boolean sintonizadorTDT = false;

    //Constructor
    public Television(){
    }

    public Television(int precioBase, int peso) {
        super(precioBase, peso);
    }

    public Television(int resolucion, boolean sintonizadorTDT, int precioBase, String color, char consumoEnergetico, int peso){
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
}
