package ar.edu.unlu.poo.figuras;

public class Rectangulo extends Figura2D{
    private double altura;

    public Rectangulo(double longitud, double altura) {
        super(longitud);
        this.altura = altura;
    }

    public double getArea() {
        return longitud * altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
