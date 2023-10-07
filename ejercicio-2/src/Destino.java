import java.util.ArrayList;

public class Destino {

    private String ciudad;
    private ArrayList<Transporte> transportes;
    private ArrayList<Hospedaje> hospedajes;
    private ArrayList<Excursion> excursiones;
    private int cantVecesVisitado = 0;

    public Destino(String ciudad) {
        this.ciudad = ciudad;
        transportes = new ArrayList<Transporte>();
        hospedajes = new ArrayList<Hospedaje>();
        excursiones = new ArrayList<Excursion>();
    }
     public void crearHospedaje(String descripcion, double costo) {
        Hospedaje hospedajeNuevo = new Hospedaje(descripcion, costo);
        this.hospedajes.add(hospedajeNuevo);
    }
    public void crearTransporte(String descripcion, double costo) {
        Transporte transporteNuevo = new Transporte(descripcion, costo);
        this.transportes.add(transporteNuevo);
    }
    public void crearExcursion(String descripcion, double costo) {
        Excursion excursionNuevo = new Excursion(descripcion, costo);
        this.excursiones.add(excursionNuevo);
    }

    public String getCiudad() {
        return ciudad;
    }

    public ArrayList<Transporte> getTransportes() {
        return transportes;
    }

    public ArrayList<Hospedaje> getHospedajes() {
        return hospedajes;
    }

    public ArrayList<Excursion> getExcursiones() {
        return excursiones;
    }

    public int getCantVecesVisitado() {
        return cantVecesVisitado;
    }

    public void sumarVisitado(int cantVecesVisitado) {
        this.cantVecesVisitado += 1;
    }
}
