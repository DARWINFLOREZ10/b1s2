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
    }
       
    }


