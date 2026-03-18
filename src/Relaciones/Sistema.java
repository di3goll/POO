/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relaciones;

/**
 *
 * @author di3go
 */
public class Sistema {

    public static void main(String[] args) {
        Punto p1 = new Punto(100, 50);
        Punto p2 = new Punto(60, 70);
        Punto p3 = new Punto(80, 100); //imep3
        Punto p4 = new Punto(20, 50);
        Punto p5 = new Punto(100, 50);
        Punto p6 = new Punto(60, 70);
        Punto p7 = new Punto(80, 100);
        Punto p8 = new Punto(20, 50);
        
        Figura fig1 = new Figura(p1, p2, p3, p4);
        System.out.println(fig1);
        p4 = null;

        System.out.println(p4);
        System.out.println(fig1);
        p1 = null;
        p2 = null;
        p3 = null;
        System.out.println(fig1);

        Figura fig2 = new Figura(p1, p2, p3, p4);
        System.out.println(fig2);
        
        Figura fig3 = new Figura(p5, p6, p7, p8);
    }
}
