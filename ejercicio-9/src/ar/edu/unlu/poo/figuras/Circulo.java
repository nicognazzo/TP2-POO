package ar.edu.unlu.poo.figuras;

public class Circulo extends Figura2D{
    public Circulo(double lado) {
        super(lado);
    }
    public double getArea() {
        return Math.PI * Math.pow(longitud, 2);
        // longitud = radio
    }
}
