public class Cubo extends Cuadrado{
    protected double volumen;

    public Cubo(double lado) {
        super(lado);
        volumen = calcularVolumen();
    }

    private double calcularVolumen() {
        return Math.pow(lado, 3);
    }

    @Override
    public double calcularArea() {
        return (6 * Math.pow(lado, 2) );
    }

    public double getVolumen() {
        return volumen;
    }
}
