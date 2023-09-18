package ar.edu.unlu.poo.futbol;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class GestorSociosSingleton {
    private static GestorSociosSingleton instancia; // Variable estatica para almacenar la unica instancia
    private ArrayList<Socio> listado; // Todos los socios
    private ArrayList<Socio> sociosDeEsteMes; // Socios del mes actual
    private Month mesActual;


    // Constructor privado para evitar la creación de instancias desde fuera de la clase
    private GestorSociosSingleton() {
        LocalDate fechaActual = LocalDate.now();
        Month mesActual = fechaActual.getMonth();
        listado= new ArrayList<Socio>();
        sociosDeEsteMes = new ArrayList<Socio>();
    }
    // Método estático para obtener la instancia única del objeto
    public static GestorSociosSingleton getInstancia() {
        if (instancia == null) {
            instancia = new GestorSociosSingleton(); // Crea la instancia si aún no existe
        }
        return instancia;
    }
    private void comprobarMes (){
        LocalDate fechaActual = LocalDate.now();
        if (mesActual != fechaActual.getMonth() ){
            mesActual = fechaActual.getMonth();
            sociosDeEsteMes.clear();
        }
    }

    public void nuevoSocio (Socio socio){
        /*String nombre; // scanner que los pida
        String direccion;
        String email;
        Socio socio = new Socio(nombre, direccion, email);
        */
        listado.add(socio);
        comprobarMes();
        // esto no tendria que ir, pero es para solucionar lo del main
        LocalDate fechaActual = LocalDate.now();
        if (socio.getSuscripcion().getFechaInscripcion().getMonth() == fechaActual.getMonth() &&
                socio.getSuscripcion().getFechaInscripcion().getYear() == fechaActual.getYear())
            sociosDeEsteMes.add(socio);
    }

    public ArrayList<Socio> getListado() {
        return listado;
    }

    // Reporte mensual de nuevos socios inscriptos
    public ArrayList<Socio> getSociosDeEsteMes() {
        return sociosDeEsteMes;
    }
    public Socio buscarSocio (int id){
        for (Socio socio : listado){
            if (socio.getIdSocio() == id)
                return socio;
        }
        return null;
    }
    public ArrayList<Socio> listaSociosSegunSuscripcion (TipoSuscripcion tipo) {
        ArrayList<Socio> auxiliar = new ArrayList<Socio>();
        for (Socio socio : listado){
            if (socio.getSuscripcion().getTipo() == tipo)
                auxiliar.add(socio);
        }
        return auxiliar;
    }
    public void mostrarLista (ArrayList<Socio> lista) {
        for (Socio socio : lista) socio.mostrarSocio();
    }

}
