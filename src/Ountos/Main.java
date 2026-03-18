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
public class Main {
    public static void main(String[] args) {
        Figura f1 = new Figura("Triangulo", new Punto[]{new Punto(0,0), new Punto(2,0), new Punto(1,2)});
        Figura f2 = new Figura("Linea", new Punto[]{new Punto(1,1), new Punto(5,5)});
        Figura f3 = new Figura("Punto solo", new Punto[]{new Punto(10,10)});
        Figura f4 = new Figura("Cuadrado", new Punto[]{new Punto(0,0), new Punto(0,2), new Punto(2,2), new Punto(2,0)});
        Figura f5 = new Figura("Vacia", new Punto[]{});

        f1.imprimir();
        f2.imprimir();
        f3.imprimir();
        f4.imprimir();
        f5.imprimir();
    }
}
