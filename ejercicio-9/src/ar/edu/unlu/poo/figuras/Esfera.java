package ar.edu.unlu.poo.figuras;

public class Esfera extends Figura3D{

    public Esfera(double arista) {
        super(arista);
    }
    public double getArea() {
        return (4 * Math.PI * Math.pow(arista, 2) );
    }
        // arista = radio
    public double getVolumen() {
        return ( (double) 4 / 3 * Math.PI * Math.pow(arista, 3) );
    }
}
