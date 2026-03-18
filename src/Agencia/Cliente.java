/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agencia;

/**
 *
 * @author di3go
 */
class Cliente {

    String Nombre;
    int Edad;
    Auto AutoDeCliente;

    public Cliente(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.AutoDeCliente = null; // Al nacer, el cliente no tiene auto (Caja vacía)
    }

    public void AsignarAuto(Auto AutoDeJuan) {
        this.AutoDeCliente = AutoDeJuan;
    }
    
    public String MostrarCliente() {
        String TXT = "CLIENTE\nNombre: " + Nombre + "\nEdad: " + Edad + "\nPosecion------\n" + AutoDeCliente +"\n";
        return TXT;
    }
}
