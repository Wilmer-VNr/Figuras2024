package org.example;

public class Endecagono extends Geometricas{
    Double longitud;

    public Endecagono(Double longitud, int nlados, String nombre) {
        super(nombre, nlados);
        this.longitud = longitud;
    }
    public Endecagono(){}

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
        return (((nlados * Math.pow(longitud, 2))/4) * (Math.tan(Math.PI / 11)));
    }
}
