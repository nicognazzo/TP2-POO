package ar.edu.unlu.poo.figuras;

public class Cuadrado extends Figura2D{
    public Cuadrado(double lado) {
        super(lado);
    }
    public double getArea() {
        return Math.pow(longitud, 2);
    }
}
