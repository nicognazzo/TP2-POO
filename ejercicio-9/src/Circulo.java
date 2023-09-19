public class Circulo {
    protected double radio;
    protected double area;

    public Circulo(double radio) {
        this.radio = radio;
        area = calcularArea();
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double getArea(){
        return area;
    }
}
