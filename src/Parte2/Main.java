/*
Trabajo Práctico 8: Interfaces y excepciones
Parte 2: Ejercicios sobre Excepciones
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package Parte2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Comentar cada ejercicio para probar
        
        //ej1_divisionSegura();
        //ej_2cadenaANumero();
        //ej_3archivoDeTexto();
        //ej4_edadInvalidaException();
        //ej5_leerArchivo();
        
    }
    
    public static void ej1_divisionSegura() {

        
        int resultado = 0;
        System.out.println("========= Ejecicio 1: Division segura =========");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese el dividendo (un numero entero): ");
            int dividendo = scanner.nextInt();
            System.out.print("Ingrese el divisor (un numero entero): ");
            int divisor = scanner.nextInt();
            
            resultado = dividendo / divisor;
            System.out.println("El resultado de la division es: " + resultado);
        } catch (ArithmeticException e){
            System.out.println("No es posible dividir por cero.");
        } finally {
            scanner.close();
            System.out.println("\nScanner cerrado correctamente.");
        }   
    }
    
    public static void ej_2cadenaANumero() {
        System.out.println("========= Ejecicio 2: Conversion de texto a numero =========");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número entero: ");
            int numero = Integer.parseInt(scanner.nextLine());
            System.out.println("Número ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: el valor ingresado no es un número válido.");
        } finally {
            scanner.close();
            System.out.println("\nScanner cerrado correctamente.");
        }
        
    }
    
    public static void ej_3archivoDeTexto() {
        // Cambiar nombre de archivo para pruebas
        try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) { 
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo no fue encontrado.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
        }

    }
    
    public static void ej4_edadInvalidaException(){
        System.out.println("========= Ejecicio 4: EdadInvalidaException =========");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese su edad (entre 0 y 120): ");
            int edad = scanner.nextInt();
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad fuera de rango válido.");
            }
            System.out.println("Edad válida: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("\nScanner cerrado correctamente.");
        }
    }
    
    public static void ej5_leerArchivo() {
        // Cambiar nombre de archivo para pruebas
        System.out.println("========= Ejecicio 5: Leer archivo - try-with-resources =========");
        try (BufferedReader br = new BufferedReader(new FileReader("archivo.txt"))) { 
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error de lectura o archivo no encontrado: " + e.getMessage());
        }
    }
}
