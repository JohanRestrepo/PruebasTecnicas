package net.javaguides;

public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public boolean esMayorDeEdad(){
        return edad >= 18;
    }
}
