package ar.edu.unlu.poo.figuras;

public class Triangulo extends Figura2D{
    private double altura;

    public Triangulo(double longitud, double altura) {
        super(longitud);
        this.altura = altura;
    }

    public double getArea() {
        return longitud * altura / 2;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
