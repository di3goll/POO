/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agencia;

/**
 *
 * @author di3go
 */
class Auto {
    private String Marca;
    String Color;

    public Auto(String Marca, String Color) {
        this.Marca = Marca;
        this.Color = Color;
    }
    
    public String getMarca() {
        return Marca;
    }
    
    @Override
    public String toString()
    {
        return "AUTO\nMarca: " + Marca + "\nColor: " + Color +"\n";
    }
}
