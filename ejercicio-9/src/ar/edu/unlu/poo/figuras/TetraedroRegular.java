package ar.edu.unlu.poo.figuras;

public class TetraedroRegular extends Figura3D{

    public TetraedroRegular(double arista) {
        super(arista);
    }

    public double getArea() {
        return Math.pow(arista, 2) * Math.sqrt(3);
    }

    public double getVolumen() {
        return Math.pow(arista, 3) * Math.sqrt(2) / 12;
        //arista^3 * raíz(2)/12
    }
}
