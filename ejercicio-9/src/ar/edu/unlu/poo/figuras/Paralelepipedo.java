package ar.edu.unlu.poo.figuras;

public class Paralelepipedo extends Figura3D{
    private double arista2;
    private double arista3;

    public Paralelepipedo(double arista, double arista2, double arista3) {
        super(arista);
        this.arista2 = arista2;
        this.arista3 = arista3;
    }

    public double getArea() {
        return 2 * (arista * arista2 + arista * arista3 + arista2 * arista3);
    }

    public double getVolumen() {
        return arista * arista2 * arista3;
    }

    public double getArista2() {
        return arista2;
    }

    public void setArista2(double arista2) {
        this.arista2 = arista2;
    }

    public double getArista3() {
        return arista3;
    }

    public void setArista3(double arista3) {
        this.arista3 = arista3;
    }
}
