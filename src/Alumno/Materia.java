/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alumno;

/**
 *
 * @author di3go
 */
public class Materia {

    private int ID;
    private String Nombre;
    private double Cal;

    public Materia(int ID, String Nombre, double Cal) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Cal = Cal;
    }

    public String EstadoCal() {
        if (Cal >= 90 && Cal <= 100) {
            return "Perfecto";
        }
        if (Cal >= 80) {
            return "Bueno";
        }
        if (Cal >= 70) {
            return "Aceptable";
        }
        return "Malo";
    }

    public String mostrarInfo() {
        return "No.Control: " + ID + "\nMateria" + Nombre + "\nCalificacion: " + Cal + "\nEstado De Calificacion: " + EstadoCal();
    }
}
