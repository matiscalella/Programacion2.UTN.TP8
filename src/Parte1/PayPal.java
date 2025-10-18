/*
Trabajo Práctico 8: Interfaces y excepciones
Parte 1: Interfaces en un sistema de E-commerce
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package Parte1;

public class PayPal implements Pago {
    private String nombreUsuario;
    private String emailAsociado;

    public PayPal(String nombreUsuario, String emailAsociado) {
        this.nombreUsuario = nombreUsuario;
        this.emailAsociado = emailAsociado;
    }


    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago realizado a traves de PayPal exitosamente.");
        System.out.println("Cuenta asociada: " + emailAsociado + "(Usuario: " + nombreUsuario + ")");
        System.out.println("Monto $: " + monto);
    }
    
    @Override
    public String toString() {
        return "PayPal [usuario=" + nombreUsuario + ", email=" + emailAsociado + "]";
    }
}
