import java.util.ArrayList;

public class Paquete {
    private Destino destino;
    private Transporte transporte;
    private Hospedaje hospedaje;
    private ArrayList<Excursion> excursiones;
    private double costoTotal;

    public Paquete(Destino destino) {
        this.destino = destino;
        this.excursiones = new ArrayList<Excursion>();
        this.costoTotal = 0;
    }

    public Destino getDestino() {
        return destino;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
        calcularCosto();
    }

    public Hospedaje getHospedaje() {
        return hospedaje;
    }

    public void setHospedaje(Hospedaje hospedaje) {
        this.hospedaje = hospedaje;
        calcularCosto();
    }

    public ArrayList<Excursion> getExcursiones() {
        return excursiones;
    }

    public void agregarExcursion(Excursion excursion) {
        excursiones.add(excursion);
        calcularCosto();
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    private void calcularCosto(){
        double total = 0;
        total += transporte.getCosto();
        total += hospedaje.getCosto();
        for (Excursion auxiliar : excursiones)
            total += auxiliar.getCosto();
        costoTotal = total;
    }
}
