package Materias;

public class Materia {

    private String nombre, clave;
    private int credPrac, credTeo, nota;

    public Materia(String nombre, String clave, int credTeo, int credPrac) {
        this.nombre = nombre;
        this.clave = clave;
        this.credPrac = credPrac;
        this.credTeo = credTeo;
        nota = 0;
    }

    public int getCredTotal() {
        return credTeo + credPrac;
    }

    @Override
    public String toString() {
        String aux = "materia: " + nombre;
        aux += "\nclave: " + clave;
        aux += "\ncreditos Practicos: " + credPrac;
        aux += "\ncreditos Teoricos: " + credTeo;
        aux += "\nCreditos Totales: " + getCredTotal();
        aux += "\nNota: " + nota;
        return aux;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
}
