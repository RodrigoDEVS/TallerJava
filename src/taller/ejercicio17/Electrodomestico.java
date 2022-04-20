package taller.ejercicio17;

public class Electrodomestico {

    //Atributos
    protected int precioBase = DEFAULT_PRICE;
    protected String color = DEFAULT_COLOR;
    protected char consumoEnergetico = DEFAULT_ENERGY;
    protected int peso = DEFAULT_WEIGHT;

    //Constantes
    public static final int DEFAULT_PRICE = 100;
    public static final String DEFAULT_COLOR = "blanco";
    public static final char DEFAULT_ENERGY = 'F';
    public static final int DEFAULT_WEIGHT = 5;

    //Constructores
    public Electrodomestico() {
    }

    public Electrodomestico(int precioBase, int peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarConsumoEnergetico();
    }

    public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        comprobarColor();
        comprobarConsumoEnergetico();
    }

    //Setters
    public void setColor(String color){
        this.color = color;
        comprobarColor();
    }

    public void setConsumoEnergetico(char consumoEnergetico){
        this.consumoEnergetico=consumoEnergetico;
        comprobarConsumoEnergetico();
    }

    //Getters
    public String getColor() {
        return this.color;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    //Metodos
    public void comprobarColor(){
        if(color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") ||
                color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("azul") ||
                color.equalsIgnoreCase("gris")){
            this.color=color;
        }else{
            System.out.println("Colores permitidos: blanco, negro, rojo, azul y gris");
            this.color=DEFAULT_COLOR;
        }
    }

    public void comprobarConsumoEnergetico(){
        if(consumoEnergetico==('A') || consumoEnergetico==('B') || consumoEnergetico==('C') || consumoEnergetico==('D') ||
                consumoEnergetico==('E') || consumoEnergetico==('F')){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            System.out.println("Valores permitidos: A, F");
            this.consumoEnergetico=DEFAULT_ENERGY;
        }
    }

    public void precioFinal(){
        if(consumoEnergetico==('A')){
            this.precioBase=DEFAULT_PRICE;
        }else if(consumoEnergetico==('B')){
            this.precioBase=80;
        }else if(consumoEnergetico==('C')){
            this.precioBase=60;
        }else if(consumoEnergetico==('D')){
            this.precioBase=50;
        }else if(consumoEnergetico==('E')){
            this.precioBase=30;
        }else if(consumoEnergetico==('F')){
            this.precioBase=10;
        }
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
