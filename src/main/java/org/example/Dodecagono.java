package org.example;

public class Dodecagono extends Geometricas{
    Double longitud;

    public Dodecagono(Double longitud, int nlados, String nombre) {
        super(nombre, nlados);
        this.longitud = longitud;
    }
    public Dodecagono() {}

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public double perimetro(){
        return longitud * nlados;
    }

    public double area(){
        return (3 * (2 + Math.sqrt(3)) * Math.pow(longitud, 2));
    }

}
