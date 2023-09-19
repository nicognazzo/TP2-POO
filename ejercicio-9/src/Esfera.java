public class Esfera extends Circulo{
    protected double volumen;

    public Esfera(double radio) {
        super(radio);
        volumen = calcularVolumen();
    }

    @Override
    public double calcularArea() {
        return (4 * super.calcularArea() );
    }

    private double calcularVolumen() {
        return ((double) 4 /3) * Math.PI * Math.pow(radio, 3);
    }

    public double getVolumen(){
        return volumen;
    }
}
