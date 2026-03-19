/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaF1;

/**
 *
 * @author di3go
 */
public class AutoF1 {

    String modelo;
    String motor;

    // 1. Constructor que recibe TODO
    public AutoF1(String modelo, String motor) {
        this.modelo = modelo;
        this.motor = motor;
        System.out.println("Configurando auto: " + modelo + " con motor " + motor);
    }

    // 2. Constructor que solo recibe el modelo (Encadena al 1)
    public AutoF1(String modelo) {
        this(modelo, "Motor Híbrido V6"); // Uso de 'this' para llamar al de arriba
    }

    // 3. Constructor vacío (Encadena al 2)
    public AutoF1() {
        this("Prototipo 2024"); // Llama al constructor que recibe el modelo
    }

    public void mostrarInfo() {
        System.out.println("Auto: " + modelo + " | Motor: " + motor);
    }

    public static void main(String[] args) {
        // Al usar el constructor vacío, se dispara la cadena:
        // Vacío -> Solo Modelo -> Modelo y Motor
        AutoF1 miAuto = new AutoF1();
        miAuto.mostrarInfo();
    }

}
