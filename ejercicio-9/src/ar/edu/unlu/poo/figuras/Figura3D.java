package ar.edu.unlu.poo.figuras;

abstract class Figura3D extends Figura{
    protected double arista; // usada como radio tambien


    public Figura3D(double arista) {
        this.arista = arista;
    }
    abstract double getVolumen();
}
