package com.demo;

public class Jugador {
    private int id;
    private String nombre;
    private int partidosJugados;
    private int golesMarcados;
    // Constructor
    public Jugador(int id, String nombre, int partidosJugados, int golesMarcados) {
        this.nombre = nombre;
        this.partidosJugados = partidosJugados;
        this.golesMarcados = golesMarcados;
    }
    // Getters
    public String getNombre() {
        return nombre;
    }
    public int getPartidosJugados() {
        return partidosJugados;
    }
    public int getGolesMarcados() {
        return golesMarcados;
    }
    // toString para imprimir el objeto
    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", partidosJugados=" + partidosJugados +
                ", golesMarcados=" + golesMarcados +
                '}';
    }
}
