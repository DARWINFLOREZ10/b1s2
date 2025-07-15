package com.example;

public class Main {
    public static void main(String[] args) {

        // Crear primer estadio
        Estadio estadio1 = new Estadio();
        estadio1.nombre = "Estadio Metropolitano";
        estadio1.ciudad = "Barranquilla";
        estadio1.capacidad = 50000;

        // Crear segundo estadio
        Estadio estadio2 = new Estadio();
        estadio2.nombre = "Estadio El Campín";
        estadio2.ciudad = "Bogotá";
        estadio2.capacidad = 36000;

        // Mostrar información
        estadio1.mostrarInformacion();
        System.out.println();
        estadio2.mostrarInformacion();
    }
       
    }


