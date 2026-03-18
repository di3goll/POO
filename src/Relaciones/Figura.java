/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relaciones;

/**
 *
 * @author di3go
 */
public class Figura {
    //Cuadrilatero asumido

    private Punto p1;
    private Punto p2;
    private Punto p3;
    private Punto p4;

    public Figura(Punto p1, Punto p2, Punto p3, Punto p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public Punto getP1() {
        return p1;
    }

    public void moverHorizontal(Integer delta) {
        p1.setX(p1.getX() + delta);
        p2.setX(p2.getX() + delta);
        p3.setX(p3.getX() + delta);
        p4.setX(p4.getX() + delta);
    }

    public void moverVertical(Integer delta) {
        p1.setY(p1.getY() + delta);
        p2.setY(p2.getY() + delta);
        p3.setY(p3.getY() + delta);
        p4.setY(p4.getY() + delta);
    }

    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public Punto getP2() {
        return p2;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    public Punto getP3() {
        return p3;
    }

    public void setP3(Punto p3) {
        this.p3 = p3;
    }

    public Punto getP4() {
        return p4;
    }

    public void setP4(Punto p4) {
        this.p4 = p4;
    }

    public String toString() {
        String aux = "(" + p1 + "," + p2 + "," + p3 + "," + p4 + ")";
        return aux;
    }
}
