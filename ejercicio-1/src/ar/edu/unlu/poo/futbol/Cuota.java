package ar.edu.unlu.poo.futbol;
// CLASE SINGLETON
public class Cuota {
    private static Cuota cuotaSingleton;
    private float montoBasica;
    private float montoIntermedia;
    private float montoDestacada;

    //=====Metodos=====\\
    // Constructor SINGLETON
    private Cuota(){};
    public static Cuota getCuotaSingleton() {
        if (cuotaSingleton == null) {
            cuotaSingleton = new Cuota(); // Crea la instancia si no existe
        }
        return cuotaSingleton;
    }

    // Getters y Setters genericos
    public float getMontoBasica() {
        return montoBasica;
    }

    public void setMontoBasica(float montoBasica) {
        this.montoBasica = montoBasica;
    }

    public float getMontoIntermedia() {
        return montoIntermedia;
    }

    public void setMontoIntermedia(float montoIntermedia) {
        this.montoIntermedia = montoIntermedia;
    }

    public float getMontoDestacada() {
        return montoDestacada;
    }

    public void setMontoDestacada(float montoDestacada) {
        this.montoDestacada = montoDestacada;
    }

    // Metodo para asignar la cuota segun el tipo de suscripcion automaticamente
    public float obtenerMonto (TipoSuscripcion tipo){
        return switch (tipo) {
            case BASICA -> montoBasica;
            case INTERMEDIA -> montoIntermedia;
            case DESTACADA -> montoDestacada;
        };
    }
}
