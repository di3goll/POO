/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ountos;

import Relaciones.Punto;

/**
 *
 * @author di3go
 */
public class Figura {
    String nombre;
    Punto[] misPuntos;

    public Figura(String nombre, Punto[] puntos) {
        this.nombre = nombre;
        this.misPuntos = puntos;
    }

    public void imprimir() {
        System.out.print(nombre + " tiene los puntos: ");
        for (Punto p : misPuntos) {
            System.out.print(p + " ");
        }
        System.out.println();
    }
}
