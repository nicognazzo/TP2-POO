package ar.edu.unlu.poo.futbol;

import java.util.ArrayList;

public class ListaActividad {
    private ArrayList<Actividad> listaActividades;

    //=====Metodos=====\\
    /**
     * Recorre la lista completa y retorna una lista que contiene solo aquellas actividades
     * que estan disponibles y son del tipo de suscripcion contratada por el socio.
     * Las suscripciones mas altas incluyen las actividades de sus subyacentes.
     */
    public ListaActividad listaPorTipoSuscripcion (TipoSuscripcion tipo){
        if (tipo == TipoSuscripcion.DESTACADA) return this; //la mas alta contiene todas las actividades

        ListaActividad auxiliar = new ListaActividad();
        for (Actividad actividad : listaActividades){
            if (tipo.compareTo(actividad.getSuscripcionMinima() ) >= 0 && actividad.isHabilitada() )
                auxiliar.listaActividades.add(actividad);
        } //medio ineficiente recorrer toda la lista cada vez que quiero saber algo
        return auxiliar;
    }

    // Agregar actividades a la lista, se podria crear otro metodo para borrar
    public void agregarActividad (Actividad actividad){
        listaActividades.add(actividad);
    }

    // Printea la descripcion de todas las actividades de la lista
    public void mostrarListaActividad (){
        for (Actividad actividad : listaActividades) {
            actividad.mostrarActividad();
        }
    }

    public ListaActividad() {
        this.listaActividades = new ArrayList<Actividad>();
    }
}
