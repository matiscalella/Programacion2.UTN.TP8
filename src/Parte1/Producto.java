/*
Trabajo Práctico 8: Interfaces y excepciones
Parte 1: Interfaces en un sistema de E-commerce
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package Parte1;

public class Producto implements Pagable {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio debe ser mayor a 0.");
        }
        
    }
    
    // Sobreescritura del metodo de la interfaz Pagable    
    @Override
    public double calcularTotal() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto[" + "Nombre: " + nombre + ", Precio: " + precio + ']';
    }
    
    
}
