package taller.ejercicio16;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Persona {

    //Atributos
    private String nombre="";
    private int edad=0;
    private int DNI;
    private char sexo='H';
    private int peso=0;
    private float altura=0;

    //Constructores
    public Persona(){
        this.comprobarSexo();
        this.generaDNI();
    }

    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.comprobarSexo();
        this.generaDNI();
    }

    public Persona(String nombre, int edad, char sexo, int peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.comprobarSexo();
        this.generaDNI();
    }

    //Metodos
    public double calcularIMC(){
        double formula = peso/(Math.pow(altura, 2));
        if(formula<20){
            formula=-1;
            System.out.println(this.nombre + " Por debajo de su peso ideal");
        }else if(formula>=20 && formula<=25){
            formula=0;
            System.out.println(this.nombre + " Se encuentra en su peso ideal");
        }else if(formula>25){
            formula=1;
            System.out.println(this.nombre + " Persona con sobrepeso");
        }else{
            System.out.println(this.nombre + " No indicó los datos de peso y altura");
        }
        return formula;
    }

    public boolean esMayorDeEdad(){
        boolean mayor = edad>=18?true:false;
        System.out.println(mayor?this.nombre+" Es mayor de edad":this.nombre+" Es menor de edad");
        return mayor;
    }

    private void comprobarSexo(){
        if(this.sexo!='H' && this.sexo!='M'){
            this.sexo='H';
        }
    }

    private void generaDNI(){
        Random aleatorio = new Random();
        int random = 11111111 + aleatorio.nextInt(99999999 - 11111111);
        this.DNI = random;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre: '" + nombre + '\'' +
                ", edad: " + edad +
                ", DNI: " + DNI +
                ", sexo: " + sexo +
                ", peso: " + peso +
                ", altura: " + altura +
                '}';
    }

    //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
        this.comprobarSexo();
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
