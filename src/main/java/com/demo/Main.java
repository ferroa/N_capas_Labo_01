package com.demo;

public class Main {
    public static void main(String[] args) {
        /* Jugadores registrados
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
         */
        // Inicializar temporada
        Temporada temporada = new Temporada();

        // Agregar jugadores
        Jugador jugador = new Jugador(1, "Pablo", 0, 0);
        Jugador jugador2 = new Jugador(2, "Pedro", 0, 0);
        Jugador jugador3 = new Jugador(3, "Ramon", 0, 0);
        Jugador jugador4 = new Jugador(4, "Ramiro", 0, 0);
        Jugador jugador5 = new Jugador(5, "Luis", 0, 0);
        Jugador jugador6 = new Jugador(6, "Leo", 0, 0);
        Jugador jugador7 = new Jugador(7, "Juan", 0, 0);
        Jugador jugador8 = new Jugador(8, "Jose", 0, 0);

        // Agregar equipos
        Equipo equipoA = new Equipo("A");
        Equipo equipoB = new Equipo("B");
        Equipo equipoC = new Equipo("C");
        Equipo equipoD = new Equipo("D");

        // Agregar jugadores de cada equipo
        equipoA.nuevoJugador(jugador);
        equipoA.nuevoJugador(jugador2);

        equipoB.nuevoJugador(jugador3);
        equipoB.nuevoJugador(jugador4);

        equipoC.nuevoJugador(jugador5);
        equipoC.nuevoJugador(jugador6);

        equipoD.nuevoJugador(jugador7);
        equipoD.nuevoJugador(jugador8);

        // Agregar los jugadores de la temporada
        temporada.ingresarJugador(jugador);
        temporada.ingresarJugador(jugador2);
        temporada.ingresarJugador(jugador3);
        temporada.ingresarJugador(jugador4);
        temporada.ingresarJugador(jugador5);
        temporada.ingresarJugador(jugador6);
        temporada.ingresarJugador(jugador7);
        temporada.ingresarJugador(jugador8);

        // Agregar lo equipos de la temporada
        temporada.ingresarEquipo(equipoA);
        temporada.ingresarEquipo(equipoB);
        temporada.ingresarEquipo(equipoC);
        temporada.ingresarEquipo(equipoD);

        // Iniciar temporada
        temporada.nuevoPartido();
        temporada.resultadosTemporada();
        System.out.println("\nJugadores que marcaron mas de 5 goles en la temporada: ");
        temporada.goleadoresTemporada();
    }
}

