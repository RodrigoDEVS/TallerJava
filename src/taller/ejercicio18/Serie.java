package taller.ejercicio18;

public class Serie implements Entregable{

    //Atributos
    private String titulo="";
    private int numeroTemporadas=3;
    private boolean entregado=false;
    private String genero="";
    private String creador="";

    //Constructores
    public Serie() {
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    //Sobrescritura de métodos
    @Override
    public String toString() {
        return "Serie{" +
                "titulo: '" + titulo + '\'' +
                ", numeroTemporadas: " + numeroTemporadas +
                ", entregado: " + entregado +
                ", genero: '" + genero + '\'' +
                ", creador: '" + creador + '\'' +
                '}';
    }

    //Getters
    public String getTitulo() {
        return titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public String getCreador() {
        return creador;
    }

    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public boolean entregar() {
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
