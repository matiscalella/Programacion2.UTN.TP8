/*
Trabajo Práctico 8: Interfaces y excepciones
Parte 1: Interfaces en un sistema de E-commerce
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package Parte1;
// Cualquier clase que implemente esta interfaz, debe implementar el metodo de la interfaz padre
public interface PagoConDescuento extends Pago { 
    double aplicarDescuento(double monto);
}
