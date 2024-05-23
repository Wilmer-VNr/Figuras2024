package org.example;

public class Heptagono extends Geometricas {
    double apotema;
    double lado;

    public Heptagono(double apotema, double lado, String nombre, int nLados) {
        super(nombre, nLados);
        this.apotema = apotema;
        this.lado = lado;
    }

    public Heptagono() {}

    public double getApotema() {
        return apotema;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return (7 * apotema * lado) / 2;
    }

    public double calcularPerimetro() {
        return 7 * lado;
    }
}
