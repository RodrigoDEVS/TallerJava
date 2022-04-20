package taller.ejercicio18;

public class Videojuego implements Entregable{

    //Atributos
    private String titulo = "";
    private int horasEstimadas = 10;
    private boolean entregado = false;
    private String genero = "";
    private String compania = "";

    //Constructores
    public Videojuego() {
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    //Sobrescritura de metodos
    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo: '" + titulo + '\'' +
                ", horasEstimadas: " + horasEstimadas +
                ", entregado: " + entregado +
                ", genero: '" + genero + '\'' +
                ", compania: '" + compania + '\'' +
                '}';
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCompania() {
        return compania;
    }

    //Setters

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public boolean entregar() {
        //return entregado?false:true;
        return this.entregado = true;
    }

    @Override
    public boolean devolver(){
        return this.entregado = false;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {

        return 0;
    }
}
