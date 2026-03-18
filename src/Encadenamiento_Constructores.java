/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author di3go
 */
public class Encadenamiento_Constructores {
    //En un proyecto que se quiera poner de solo un archivo solo puede haber una clase publica
    int age;
    String name;
    Encadenamiento_Constructores()
    {
        this("temu.com");
    }
    Encadenamiento_Constructores(String s)
    {
        this(s,6);
    }
    Encadenamiento_Constructores(String s, int age)
    {
        this.name = s;
        this.age = age;
    }
    public static void main(String[] args) {
        Encadenamiento_Constructores obj = new Encadenamiento_Constructores();
    }
}
