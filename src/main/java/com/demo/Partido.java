package com.demo;

import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;


public class Partido {
    private Equipo equipoA;
    private Equipo equipoB;
    int golesEquipoA;
    int golesEquipoB;

    // Constructor
    public Partido (Equipo equipoA, Equipo equipoB) {
        this.equipoA = equipoA;
        this.equipoB = equipoB;
        this.golesEquipoA = 0;
        this.golesEquipoB = 0;
    }

    // Método para marcar un gol
    public void realizarPartido() {
        Random rand = new Random();
        golesEquipoA = rand.nextInt(10);
        golesEquipoB = rand.nextInt(10);

        for (int i = 0; i < golesEquipoA; i++) {
            int a = rand.nextInt(equipoA.listarJugadores().size());
            equipoA.buscarJugador(a).gol(); // El equipo A anota un gol
        }

        for (int i = 0; i < golesEquipoB; i++) {
            int b = rand.nextInt(equipoB.listarJugadores().size());
            equipoB.buscarJugador(b).gol(); // El equipo B anota un gol
        }
    }

    // Método para definir el equipo ganador
    public Equipo ganador() {
        if (golesEquipoA > golesEquipoB) {
            return equipoA;
        }
        else if (golesEquipoB > golesEquipoA) {
            return equipoB;
        }
        else
            return null; // En caso de un empate
    }

    // Método para definir el jugador con más goles de un partido
    public Jugador goleador (){
        return Stream.concat(equipoA.jugadores.stream(), equipoB.jugadores.stream())
                .max(Comparator.comparingInt(Jugador::getGolesMarcados))
                .orElse(null);
    }


    @Override
    public String toString() {
        return "Partido" +
                "\n Equipo A = " + equipoA.nombre() + ", Total de goles = " + golesEquipoA +
                "\n Equipo B = " + equipoB.nombre() + ", Total de goles = " + golesEquipoB +
                "\n Ganador = " + ganador().nombre() +
                "\n Jugador con mas goles del partido = " + goleador().getNombre() + ", Total de goles = " + goleador().getGolesMarcados();

    }
}
