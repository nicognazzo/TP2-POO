public class Cuadrado {
    protected double lado;
    protected double area;

    public Cuadrado(double lado) {
        this.lado = lado;
        area = calcularArea();
    }

    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    public double getArea() {
        return area;
    }
}
