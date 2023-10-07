package ar.edu.unlu.poo.figuras;

abstract class Figura2D extends Figura{
    protected double longitud; // usada como lado, base, radio


    public Figura2D(double longitud) {
        this.longitud = longitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
}
