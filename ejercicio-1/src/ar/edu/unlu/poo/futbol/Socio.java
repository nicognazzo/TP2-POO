package ar.edu.unlu.poo.futbol;

import java.time.LocalDate;

public class Socio {

    private int idSocio;
    private String nombre;
    private String direccion;
    private String email;
    private Suscripcion suscripcion;

    //=====Metodos=====\\

    // Constructor
    public Socio(String nombre, String direccion, String email) {
        this.idSocio = IdCounter.nextId();
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        TipoSuscripcion tipo = TipoSuscripcion.BASICA;
        LocalDate fechaInscripcion = LocalDate.now();
        this.suscripcion = new Suscripcion(tipo, fechaInscripcion);
    }

    // Getters and Setters
    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }
    private class IdCounter {   // codigo robado de github que genera un id lineal
        private static int counter = 0;
        public static synchronized int nextId() {
            return ++counter;
        }
    }
    public void mostrarSocio() {
        System.out.println("/ID: "+idSocio+" /Nombre: "+nombre+" /Direccion: "+direccion+" /eMail: "+email+" /Tipo Suscripcion: "+suscripcion.getTipo());
    }

}

