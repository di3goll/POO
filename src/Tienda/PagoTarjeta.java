/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda;

/**
 *
 * @author di3go
 */
public class PagoTarjeta extends Pago {
    private String numeroTarjeta;
    
    public PagoTarjeta(double monto, String numeroTarjeta)
    {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
    }
    
    @Override
    public void procesarPago()
    {
        System.out.println("Procesar pago con tarjeta: $" + monto);
        System.out.println("Validando tarjeta: " + numeroTarjeta);
    }
}
