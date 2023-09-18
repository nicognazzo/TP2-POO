import ar.edu.unlu.poo.futbol.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Cuota cuota = Cuota.getCuotaSingleton();
        cuota.setMontoBasica(500);
        cuota.setMontoIntermedia(1000);
        cuota.setMontoDestacada(1500);

        //                         IMPORTANTE LEER

        /*Las clases Actividad y Socios no se deberian tocar, de eso se encargan las clases ListaActividad
        y GestorSociosSingleton, tambien de la creacion de nuevas instancias de Socios y Actividades y su posterior
        agregado al listado. Para facilitar el testeo modifique eso y rompi el encapsulamiento, de lo contrario
        deberia hacer todo con scanners y seria muy tedioso de testear porque no se hacer interfaz grafica.
        */

        Actividad actividad1 = new Actividad("Actividad1", TipoSuscripcion.INTERMEDIA);
        Actividad actividad2 = new Actividad("Actividad2", TipoSuscripcion.BASICA);
        Actividad actividad3 = new Actividad("Actividad3", TipoSuscripcion.INTERMEDIA);
        Actividad actividad4 = new Actividad("Actividad4", TipoSuscripcion.DESTACADA);
        Actividad actividad5 = new Actividad("Actividad5", TipoSuscripcion.BASICA);
        Actividad actividad6 = new Actividad("Actividad6", TipoSuscripcion.INTERMEDIA);
        ListaActividad listaActividad = new ListaActividad();
        listaActividad.agregarActividad(actividad1);
        listaActividad.agregarActividad(actividad2);
        listaActividad.agregarActividad(actividad3);
        listaActividad.agregarActividad(actividad4);
        listaActividad.agregarActividad(actividad5);
        listaActividad.agregarActividad(actividad6);

        Socio socio1 = new Socio("socio1","calle abc","socio1@gmail.com");
        Socio socio2 = new Socio("socio2","av siempre viva 742","socio2@gmail.com");
        Socio socio3 = new Socio("socio3","boulevard abcde","socio3@gmail.com");
        Socio socio4 = new Socio("socio4","ruta 1","socio4@gmail.com");
        Socio socio5 = new Socio("socio5","calle xyz","socio5@gmail.com");
        Socio socio6 = new Socio("socio6","avenida abc","socio6@gmail.com");
        socio1.getSuscripcion().setTipo(TipoSuscripcion.INTERMEDIA);
        socio1.getSuscripcion().setFechaInscripcion(LocalDate.parse("2023-01-30")); // fecha anterior a este mes
        socio3.getSuscripcion().setTipo(TipoSuscripcion.DESTACADA);
        socio3.getSuscripcion().setFechaInscripcion(LocalDate.parse("2023-02-28")); // fecha anterior a este mes
        socio4.getSuscripcion().setTipo(TipoSuscripcion.INTERMEDIA);
        GestorSociosSingleton listaSocios = GestorSociosSingleton.getInstancia();
        listaSocios.nuevoSocio(socio1); // nuevo socio tendria que encargarse de la creacion de una instancia
        listaSocios.nuevoSocio(socio2); // de socio y de pedir sus atributos, este metodo no deberia pedir
        listaSocios.nuevoSocio(socio3); // ningun parametro al ser invocado
        listaSocios.nuevoSocio(socio4);
        listaSocios.nuevoSocio(socio5);
        listaSocios.nuevoSocio(socio6);

        System.out.println("Lista socios de este mes: (socio1 y socio 3 tienen fecha vieja, no se deberian mostrar)");
        listaSocios.mostrarLista(listaSocios.getSociosDeEsteMes() );

        TipoSuscripcion auxiliar = TipoSuscripcion.BASICA; // cambiar por INTERMEDIA o DESTACADA

        System.out.println("Lista de actividades para la suscripcion " + auxiliar);
        listaActividad.listaPorTipoSuscripcion(auxiliar).mostrarListaActividad();

        TipoSuscripcion auxiliar2 = TipoSuscripcion.BASICA; // cambiar por INTERMEDIA o DESTACADA
        System.out.println("Lista de socios con suscripcion " + auxiliar2);
        listaSocios.mostrarLista(listaSocios.listaSociosSegunSuscripcion(TipoSuscripcion.BASICA) );

    }
}