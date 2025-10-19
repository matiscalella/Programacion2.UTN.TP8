/*
Trabajo Práctico 8: Interfaces y excepciones
Parte 2: Ejercicios sobre Excepciones
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package Parte2;

public class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}
