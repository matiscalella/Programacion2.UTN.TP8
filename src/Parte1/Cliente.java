/*
Trabajo Práctico 8: Interfaces y excepciones
Parte 1: Interfaces en un sistema de E-commerce
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package Parte1;

public class Cliente implements Notificable {
    private String nombreCliente;
    private String emailCliente;

    public Cliente(String nombreCliente, String emailCliente) {
        this.nombreCliente = nombreCliente;
        this.emailCliente = emailCliente;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println("Notificacion para " + nombreCliente + ", email: " + emailCliente);
        System.out.println(mensaje);
        System.out.println();
    }

    @Override
    public String toString() {
        return "Cliente[" + "Nombre: " + nombreCliente + ", Email: " + emailCliente + ']';
    }
    
}
