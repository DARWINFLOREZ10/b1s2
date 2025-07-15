package com.example;

public class Main {
    public static void main(String[] args) {

        
        Estadio estadio1 = new Estadio();
        estadio1.nombre = "Estadio Metropolitano";
        estadio1.ciudad = "Barranquilla";
        estadio1.capacidad = 50000;

        Estadio estadio2 = new Estadio();
        estadio2.nombre = "Estadio El Campín";
        estadio2.ciudad = "Bogotá";
        estadio2.capacidad = 36000;

        estadio1.mostrarInformacion();
        System.out.println();
        estadio2.mostrarInformacion();

        JugadorFutbol jugador1 = new JugadorFutbol();
        jugador1.nombre = "Carlos";
        jugador1.edad = 25;
        jugador1.posicion = "Delantero";
        jugador1.golesMarcados = 10; 

        JugadorFutbol jugador2 = new JugadorFutbol();
        jugador2.nombre = "Andrés";
        jugador2.edad = 28;
        jugador2.posicion = "Defensa";
        jugador2.golesMarcados = 5;

        JugadorFutbol jugador3 = new JugadorFutbol();
        jugador3.nombre = "Luis";
        jugador3.edad = 22;
        jugador3.posicion = "Portero";
        jugador3.golesMarcados = 0;

        jugador1.presentarse();
        jugador2.presentarse();
        jugador3.presentarse();

        jugador1.cambiarPosicion("Extremo derecho");
        jugador2.cambiarPosicion("Mediocampista");
        jugador3.cambiarPosicion("Defensa");
    }
       
    }


