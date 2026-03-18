/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Alumno;

/**
 *
 * @author di3go
 */
public class Alumno {

    private String Nombre;
    private int Semestre, NumMat;
    private Materia[] Materias;

    public Alumno(String Nombre, int Semestre, int NumMat, Materia[] Materias) {
        this.Nombre = Nombre;
        this.Semestre = Semestre;
        this.NumMat = 0; //Inicia con 0
        this.Materias = new Materia[6]; //Limitado a 6 materias
    }

    public boolean AñadirMat(Materia Materia) {
        if (NumMat < Materias.length) {
            Materias[NumMat] = Materia;
            NumMat++;
            return true;
        }
        return false;
    }

    public String AlumnoDatos() {
        return "Alumno: " + Nombre + "\n Semestre: " + Semestre;
    }

    public String Boleta() {
        String Boleta = AlumnoDatos() + "-----\nMaterias:\n";
        for (int i = 0; i < NumMat; i++) {
            Boleta += Materias[i].mostrarInfo() + "\n";
        }
        return Boleta;
    }
}
