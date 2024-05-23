package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pentagono figura1=new Pentagono("Figura 1", 34.5,4.6,5);
        Hexagono figura2=new Hexagono(45.6, 6.3, "Figura 2",6);
        Heptagono figura3=new Heptagono(5.6, 16.3, "Figura 3",7);
        Octagono figura4=new Octagono(43.7,10.4,"Figura 4",8);
        Nonagono figura5=new Nonagono(34.9, 7.2, 9,"Figura 5");
        Decagono figura6=new Decagono(12.5, 2.5, 10,"Figura 6");
        Endecagono figura7=new Endecagono(22.5, 11, "Figura 7");
        Dodecagono figura8=new Dodecagono(23.6, 12,"Figura 8");

        System.out.println("\t --PERIMETROS-- \n");
        System.out.println(figura1.perimetro());
        System.out.println(figura2.perimetro());
        System.out.println(figura3.calcularPerimetro());
        System.out.println(figura4.calcularPerimetro());
        System.out.println(figura5.calcularPerimetro());
        System.out.println(figura6.calcularPerimetro());
        System.out.println(figura7.perimetro());
        System.out.println(figura8.perimetro());
        System.out.println("------------------------- \n");

        System.out.println("\t --AREAS-- \n");
        System.out.println(figura1.area());
        System.out.println(figura2.area());
        System.out.println(figura3.calcularArea());
        System.out.println(figura4.calcularArea());
        System.out.println(figura5.calcularArea());
        System.out.println(figura6.calcularArea());
        System.out.println(figura7.area());
        System.out.println(figura8.area());
    }
}