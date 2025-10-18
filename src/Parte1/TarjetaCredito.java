/*
Trabajo Práctico 8: Interfaces y excepciones
Parte 1: Interfaces en un sistema de E-commerce
Alumno: Matias Scalella - Tecnicatura Universitaria en Programacion - UTN
*/
package Parte1;

public class TarjetaCredito implements PagoConDescuento {
    private String numero;
    private String titular;

    public TarjetaCredito(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    @Override
    public double aplicarDescuento(double monto) {
        if (monto >= 200000) {
            monto = monto * 0.90; // aplica 10% de descuento si el monto a pagar es mayor o igual a $ 200000 
        }
        return monto;
    }

    @Override
    public void procesarPago(double monto) {
        if (monto <= 0) {
            System.out.println("El monto del pago debe ser mayor a 0.");
        return;
        }
        monto = aplicarDescuento(monto);
        System.out.println("Pago con tarjeta de credito Nro: " + numero + " exitoso.");
        System.out.println("Monto pagado: $ " + monto);
    }
    
    @Override
    public String toString() {
        return "Tarjeta de crédito [Nro: " + numero + ", Titular: " + titular + "]";
    }
}
