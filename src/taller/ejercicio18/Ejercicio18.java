package taller.ejercicio18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio18 {


    public static void main(String[] args) {
        Serie series[] = new Serie[5];
        Videojuego videojuegos[] = new Videojuego[5];

        Serie walking = new Serie("The Walking Dead", 11, "Terror", "Robert Kirkman");
        Serie tronos = new Serie("Juego de Tronos", 7, "Fantasía", "George R. R. Martin");
        Serie strain = new Serie("The Strain", 4, "Terror", "Guillermo del Toro");
        Serie loki = new Serie("Loki", 1, "Fantasia", "Michael Waldron");
        Serie invincible = new Serie("Invincible", 1, "Animada", "Robert Kirkman");

        series[0] = walking;
        series[1] = tronos;
        series[2] = strain;
        series[3] = loki;
        series[4] = invincible;

        Videojuego warcraft3 = new Videojuego("Warcraft III",30, "Estrategia", "Blizzard");
        Videojuego lol = new Videojuego("League of Legends",300, "MOBA", "Riot Games");
        Videojuego ffxv = new Videojuego("Final Fantasy XV",60, "RPG", "Square Enix");
        Videojuego bravely = new Videojuego("Bravely Default",50, "RPG", "Square Enix");
        Videojuego elden = new Videojuego("Elden Ring",60, "Rol", "Bandai Namco Entertainment");

        videojuegos[0] = warcraft3;
        videojuegos[1] = lol;
        videojuegos[2] = ffxv;
        videojuegos[3] = bravely;
        videojuegos[4] = elden;

        strain.entregar();
        loki.entregar();
        warcraft3.entregar();
        bravely.entregar();

        int cantEntregados = 0;
        List<Serie> entregados = new ArrayList<>();
        for(int i=0; i<series.length; i++){
            if(series[i].isEntregado()==true){
                System.out.println(series[i]);
                entregados.add(series[i]);
                cantEntregados += 1;
            }
        }
        System.out.println("cantEntregados = " + cantEntregados);

        int mayor = 0;
        String cadena = "";
        for(int i=0; i<videojuegos.length; i++){
            if((videojuegos[i].getHorasEstimadas())>mayor){
                mayor = videojuegos[i].getHorasEstimadas();
                cadena = videojuegos[i].toString();
            }
        }
        System.out.println("Videojuego con mas horas = " + cadena);

        int masTemporadas = 0;
        String serieMayor = "";
        for(int i=0; i<series.length; i++){
            if((series[i].getNumeroTemporadas())>masTemporadas){
                masTemporadas = series[i].getNumeroTemporadas();
                serieMayor=series[i].toString();
            }
        }
        System.out.println("Serie con Mas Temporadas = " + serieMayor);
    }
}
