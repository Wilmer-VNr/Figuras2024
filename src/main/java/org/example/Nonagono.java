package org.example;

public class Nonagono extends Geometricas{

    Double longitudLado;
    Double apotema;

    public Nonagono(Double longitudLado, Double apotema, int nlados, String nombre){
        super(nombre, nlados);
        this.longitudLado = longitudLado;
        this.apotema = apotema;
    }
    public Nonagono(){}

    public Double getLongitudLado() {
        return longitudLado;
    }

    public void setLongitudLado(Double longitudLado) {
        this.longitudLado = longitudLado;
    }

    public Double getApotema() {
        return apotema;
    }

    public void setApotema(Double apotema) {
        this.apotema = apotema;
    }

    //Metodos
    public Double calcularPerimetro() {
        return longitudLado*nlados;
    }
    public Double calcularArea() {
        return (calcularPerimetro()*apotema)/2;
    }

}
