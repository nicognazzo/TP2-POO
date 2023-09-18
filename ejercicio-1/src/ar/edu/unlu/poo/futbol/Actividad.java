package ar.edu.unlu.poo.futbol;

public class Actividad {
    private String descripcion;
    private TipoSuscripcion suscripcionMinima;
    private boolean habilitada = true;

    //=====Metodos=====\\
    // Constructor, pide todo menos habilitada que se asume verdadera siempre que no se modifique
    public Actividad(String descripcion, TipoSuscripcion suscripcionMinima) {
        this.descripcion = descripcion;
        this.suscripcionMinima = suscripcionMinima;
    }

    // Getters y Setters genericos
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoSuscripcion getSuscripcionMinima() {
        return suscripcionMinima;
    }

    public void setSuscripcionMinima(TipoSuscripcion suscripcionMinima) {
        this.suscripcionMinima = suscripcionMinima;
    }

    public boolean isHabilitada() {
        return habilitada;
    }

    // Habilitada = FALSE
    public void deshabilitar() {
        habilitada = false;
    }

    // Muestra la descripcion de la tarea
    public void mostrarActividad(){
        System.out.println(descripcion);
    }

}
