package ar.edu.unlu.poo.figuras;

public class Cubo extends Figura3D{
    public Cubo(double arista) {
        super(arista);
    }
    public double getVolumen() {
        return Math.pow(arista, 3);
    }
    public double getArea() {
        return (6 * Math.pow(arista, 2) );
    }
}
