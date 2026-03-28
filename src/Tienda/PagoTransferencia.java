/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda;

/**
 *
 * @author di3go
 */
public class PagoTransferencia extends Pago {

    private String banco;

    public PagoTransferencia(double monto, String banco) {
        super(monto);
        this.banco = banco;
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesar pago con tarjeta: $" + monto);
        System.out.println("Validando tarjeta: " + banco);
    }
}
