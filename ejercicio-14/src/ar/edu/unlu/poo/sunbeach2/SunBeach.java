package ar.edu.unlu.poo.sunbeach2;

import java.util.ArrayList;

public class SunBeach {
    private ArrayList<Proveedor> proveedores = new ArrayList<>();
    private ArrayList<PaqueteTuristico> paquetes = new ArrayList<>();
    private ArrayList<Venta> ventas = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();

    // ----- Métodos ----- \\
    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente.getNombre());
        }
    }
    public Cliente buscarCliente(String cliente) {
        for(Cliente cliAux : clientes) {
            if (cliAux.getNombre().equalsIgnoreCase(cliente)) {
                return cliAux;
            }
        }
        return null;
    }

    public void listarVentas() {
        for (Venta venta : ventas) {
            System.out.println(venta.toString());
        }
    }

    public void registrarVenta(Venta venta, Cliente cliente, int pasajeros) {
        ventas.add(venta);
        venta.setCantidadClientes(pasajeros);
        cliente.realizarCompra(venta);
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    public void registrarProveedor(Proveedor proveedor) {
        proveedores.add(proveedor);
    }
    public void registrarPaquete(PaqueteTuristico paqueteTuristico) {
        paquetes.add(paqueteTuristico);
    }
    public void mostrarProveedores() {
        for (Proveedor proveedor : proveedores) {
            System.out.println(proveedor.toString());
        }
    }
    public void mostrarPaquetes() {
        for (PaqueteTuristico paquete : paquetes) {
            System.out.println(paquete.mostrarPaquete());
        }

    }

    public void mostrarComprasCliente(String nombre) {
        Cliente cliente = buscarCliente(nombre);
        System.out.println("// === Compras realizadas por el cliente [" + cliente.getNombre() + "]\n");
        for (Venta compra : cliente.getCompras()) {
            System.out.println(compra.soloDestino());
        }
    }


}