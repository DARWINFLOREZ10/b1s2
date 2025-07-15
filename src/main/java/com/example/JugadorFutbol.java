package com.example;

public class JugadorFutbol {
String nombre;
int edad;
String posicion;
int golesMarcados;

public void presentarse(){
    System.out.println("Hola, soy " + nombre + ", tengo " + edad + " años y juego como " + posicion + "y he marcado " + golesMarcados + " goles.");
}

public void cambiarPosicion(String nuevaPosicion){
    System.out.println(nombre + " ha cambiado de posición a " + nuevaPosicion + ".");
}
}
 