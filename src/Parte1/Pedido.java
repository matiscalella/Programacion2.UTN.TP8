/*
Trabajo Práctico 8: Interfaces y excepciones
Parte 1: Interfaces en un sistema de E-commerce
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package Parte1;

import java.util.ArrayList;

public class Pedido implements Pagable {
    private ArrayList<Producto> productos;
    private Cliente cliente;
    private String estado;

    public Pedido(Cliente cliente) {
        this.productos = new ArrayList<>();
        this.cliente = cliente;
        this.estado = "Pendiente de pago.";
    }

    public String getEstado() {
        return estado;
    }
    
    
    public void agregarProducto(Producto producto){
        if (producto != null) {
            productos.add(producto);
        }
    }
    
    public void cambiarEstado(String estadoNuevo){
        this.estado = estadoNuevo;
        cliente.notificar("El estado de su pedido se actualizo a: " + estadoNuevo);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido[" + "Productos: " + productos + ", Cliente: " + cliente + ", Estado: " + estado + ']';
    }
    
    
}
