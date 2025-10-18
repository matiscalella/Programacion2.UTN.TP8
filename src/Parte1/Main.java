/*
Trabajo Práctico 8: Interfaces y excepciones
Parte 1: Interfaces en un sistema de E-commerce
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package Parte1;

public class Main {

    public static void main(String[] args) {
        // Crear cliente
        Cliente cliente1 = new Cliente("Matias S", "matias@pruebaDelCliente.com");
        // Crear pedido
        Pedido pedido1 = new Pedido(cliente1);
        // Crear productos
        Producto mouse = new Producto("Mouse inalambrico", 20000);
        Producto auriculares = new Producto("Auriculares JVC", 150000);
        Producto sillaGamer = new Producto("Silla Gamer", 750000);
        // Agregar productos al pedido
        pedido1.agregarProducto(mouse);
        pedido1.agregarProducto(auriculares);
        pedido1.agregarProducto(sillaGamer);
        
        // Calcular total del pedido
        double importeTotal = pedido1.calcularTotal();
        System.out.println("Pedido generado exitosamente.");
        System.out.println("Estado: " + pedido1.getEstado());
        System.out.println("Total: $" + importeTotal);
        System.out.println("----------------------------------");
        
        // Procesar pago - se pagaria con descuento
        TarjetaCredito tarjeta = new TarjetaCredito("1234-5678-9876-5432", "Matías S");
        tarjeta.procesarPago(importeTotal);
        
        // Cambiar estado del pedido
        pedido1.cambiarEstado("En preparacion.");
        
        // Simular pago con Paypal
        PayPal paypal = new PayPal("matias_s", "matias@pruebaDelCliente.com");
        paypal.procesarPago(importeTotal);

    }
    
}
