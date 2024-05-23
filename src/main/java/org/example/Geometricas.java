package org.example;

public class Geometricas {
    String nombre;
    int nlados;
    public Geometricas(){}
    public Geometricas(String nombre, int nlados) {
        this.nombre = nombre;
        this.nlados = nlados;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNlados(int nlados) {
        this.nlados = nlados;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNlados() {
        return nlados;
    }
}
