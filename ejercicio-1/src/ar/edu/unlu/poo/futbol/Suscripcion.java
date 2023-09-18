package ar.edu.unlu.poo.futbol;

import java.time.LocalDate;

public class Suscripcion {
    private TipoSuscripcion tipo;
    private LocalDate fechaInscripcion;
    private float montoAPagar;
    private ListaActividad actividades;

    public Suscripcion(TipoSuscripcion tipo, LocalDate fechaInscripcion) {
        this.tipo = tipo;
        this.fechaInscripcion = fechaInscripcion;
        Cuota cuota = Cuota.getCuotaSingleton();
        montoAPagar = cuota.obtenerMonto(tipo);
        actividades = new ListaActividad();
        actividades = actividades.listaPorTipoSuscripcion(tipo);
    }
    public void setTipo (TipoSuscripcion tipo) {
        this.tipo = tipo;
        Cuota cuota = Cuota.getCuotaSingleton();
        montoAPagar = cuota.obtenerMonto(tipo);
        actividades = actividades.listaPorTipoSuscripcion(tipo);
    }

    public TipoSuscripcion getTipo() {
        return tipo;
    }

    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(LocalDate fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public float getMontoAPagar() {
        return montoAPagar;
    }

    public void setMontoAPagar(float montoAPagar) {
        this.montoAPagar = montoAPagar;
    }

    public ListaActividad getActividades() {
        return actividades;
    }

    public void setActividades(ListaActividad actividades) {
        this.actividades = actividades;
    }
}
