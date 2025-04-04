package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    List <Jugador> jugadores;

    // Constructor
    public Equipo(String nombre) {
        this.nombre = nombre;
        jugadores = new ArrayList<Jugador>();
    }

    // Agregar un jugador
    public void nuevoJugador(Jugador nuevo) {
        jugadores.add(nuevo);
    }

    // Consultar lista de jugadores
    public List <Jugador> listarJugadores() {
        return jugadores;
    }

    // Consultar jugador
    public Jugador buscarJugador(int index) {
        return jugadores.get(index);
    }
}
