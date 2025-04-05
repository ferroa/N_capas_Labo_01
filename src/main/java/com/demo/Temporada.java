package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Temporada {
    List<Equipo> equipos;
    List<Partido> partidos;
    List<Jugador> jugadores;

    // Constructor
    public Temporada() {
        equipos = new ArrayList<>();
        partidos = new ArrayList<>();
        jugadores = new ArrayList<>();
    }

    // Método para ingresar los jugadores
    public void ingresarJugador (Jugador jugador) {
        jugadores.add(jugador);
    }

    // Método para agregar un equipo
    public void ingresarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }

    // Método para realizar los partidos de la temporada
    public void nuevoPartido() {
        for (int i = 0; i < equipos.size(); i++) {
            if (i + 1 < equipos.size()) {
                Partido partido = new Partido(equipos.get(i), equipos.get(i + 1));
                partido.realizarPartido();
                partidos.add(partido);
            }
        }
    }

    // Método para mostrar los resultados de la temporada
    public void resultadosTemporada() {
        for (Partido partido : partidos) {
            System.out.println(partido); // Muestra la información de cada partido disputado durante la temporada
        }
    }

    // Método para definir los jugadores que marcaron más de 5 goles en la temporada
    public void goleadoresTemporada() {
        List <Jugador> goleadores = jugadores.stream()
                .filter(jugador -> jugador.getGolesMarcados() > 5)
                .toList();

        for (Jugador jugador : goleadores) {
            System.out.println("Nombre: " + jugador.getNombre());
        }
    }
}
