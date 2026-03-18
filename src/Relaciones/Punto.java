/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Relaciones;

/**
 *
 * @author di3go
 */
public class Punto {

    private Integer x;
    private Integer y;
    
    public Punto(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }
    @Override
    public String toString()
    {
        String aux = "("+x+","+y+")";
        return aux;
    }
}
