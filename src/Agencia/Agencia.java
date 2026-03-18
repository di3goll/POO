/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agencia;

/**
 *
 * @author di3go
 */
public class Agencia {

    public static void main(String[] args) {
        Cliente Juan = new Cliente("Juan", 28);
        Auto A1 = new Auto("Ferrari", "Rojo");
        Juan.AsignarAuto(A1);
        System.out.println(A1 + Juan.MostrarCliente());
    }
}
