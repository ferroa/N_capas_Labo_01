package com.demo;

public class Main {
    public static void main(String[] args) {
        // Jugadores registrados
        Jugador jugador1 = new Jugador(1, "Pablo", 0,0);
        Jugador jugador2 = new Jugador(2, "Marcos", 0,0);
        Jugador jugador3 = new Jugador(3, "Pedro", 0,0);
        Jugador jugador4 = new Jugador(4, "Juan", 0,0);
        Jugador jugador5 = new Jugador(5, "Jose", 0,0);
        Jugador jugador6 = new Jugador(6, "Tobi", 0,0);

        // Crear equipos
        Equipo equipoA = new Equipo("Alfa");
        Equipo equipoB = new Equipo("Beta");

        // Poblar lista de jugadores del equipo A
        equipoA.nuevoJugador(jugador1);
        equipoA.nuevoJugador(jugador3);
        equipoA.nuevoJugador(jugador5);

        // Poblar  lista de jugadores del equipo B
        equipoB.nuevoJugador(jugador2);
        equipoB.nuevoJugador(jugador4);
        equipoB.nuevoJugador(jugador6);

        // Realizar partido
        Partido nuevoJuego = new Partido(equipoA, equipoB);
        nuevoJuego.realizarPartido();
        System.out.println(nuevoJuego);
    }
}

