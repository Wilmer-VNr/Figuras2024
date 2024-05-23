package org.example;

public class Pentagono extends Geometricas{
    double longitudlado;
    double apotema;

    public Pentagono(){}
    public Pentagono(String nombre,double longitudlado, double apotema, int nlados){
        super(nombre, nlados);
        this.longitudlado = longitudlado;
        this.apotema = apotema;
    }

    public void setLongitudlado(double longitudlado) {
        this.longitudlado = longitudlado;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public double getLongitudlado() {
        return longitudlado;
    }

    public double getApotema() {
        return apotema;
    }
    public double perimetro(){
        return longitudlado * this.nlados;
    }
    public double area(){
        return ((longitudlado * this.nlados)*apotema)/2;
    }
}
