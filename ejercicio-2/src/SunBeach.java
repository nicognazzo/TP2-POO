import java.util.ArrayList;

public class SunBeach {
    private ArrayList<Cliente> clientes;
    private ArrayList<Destino> destinos;
    private ArrayList<Reserva> listaVentas;
    private Destino destinoMasVisitado;


    public SunBeach(ArrayList<Cliente> clientes, ArrayList<Destino> destinos, ArrayList<Reserva> listaVentas) {
        clientes = new ArrayList<Cliente>();
        destinos = new ArrayList<Destino>();
        listaVentas = new ArrayList<Reserva>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Destino> getDestinos() {
        return destinos;
    }

    public void setDestinos(ArrayList<Destino> destinos) {
        this.destinos = destinos;
    }

    public ArrayList<Reserva> getListaVentas() {
        return listaVentas;
    }

    public void setListaVentas(ArrayList<Reserva> listaVentas) {
        this.listaVentas = listaVentas;
    }

    public Destino getDestinoMasVisitado() {
        return destinoMasVisitado;
    }
}
