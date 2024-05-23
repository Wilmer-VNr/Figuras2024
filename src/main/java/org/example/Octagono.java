package org.example;

public class Octagono extends Geometricas{
    Double lado;
    Double apotema;
    public Octagono() {}
    public Octagono(Double lado, Double apotema, String nombre, int nLados) {
        super(nombre, nLados);
        this.lado = lado;
        this.apotema = apotema;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    public Double getApotema() {
        return apotema;
    }

    public void setApotema(Double apotema) {
        this.apotema = apotema;
    }

    public Double calcularPerimetro() {
        return lado *8;
    }

    public Double calcularArea() {
        return (lado*apotema*8)/2;
    }
}
