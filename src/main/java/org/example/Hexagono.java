package org.example;

public class Hexagono extends Geometricas{
    double longitudlados;
    double apotema;

    public Hexagono(double longitudlados, double apotema, String nombre, int nlados) {
        super(nombre, nlados);
        this.longitudlados = longitudlados;
        this.apotema = apotema;
    }
    public Hexagono(){}

    public void setLongitudlados(double longitudlados) {
        this.longitudlados = longitudlados;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getLongitudlados() {
        return longitudlados;
    }

    public double getApotema() {
        return apotema;
    }

    public double perimetro(){
        return longitudlados * this.nlados;
    }
    public double area(){
        return ((longitudlados * this.nlados)*apotema)/2;
    }
}
