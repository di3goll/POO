/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda;

import java.util.ArrayList;

/**
 *
 * @author di3go
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Pago> pagos = new ArrayList<>();
        pagos.add(new PagoEfectivo(500));
        pagos.add(new PagoTarjeta(1200, "1234-5678-9012"));
        pagos.add(new PagoTransferencia(500, "BBVA"));
        
        for (Pago p : pagos) {
            p.procesarPago(); //esto es polimorfismo
        }

    }
}
