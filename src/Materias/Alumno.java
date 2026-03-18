package Materias;

/**
 *
 * @author lalit
 */
public class Alumno {
    private String nombre, noControl;
    private int semestre;
    private Materia mat1;
    
    
    public Alumno(String nombre, String noControl, int semestre){
        this.nombre=nombre;
        this.semestre=semestre;
        this.noControl=noControl;
        
    }
    
    public Alumno(){
        
    }
    @Override
    public String toString(){
        String strOut;
        strOut = "Nombre: "+ nombre;
        strOut += "\nNo. Control: " + noControl; 
        strOut += "\nSemestre: " + semestre; 
        return strOut;
    }
    
    public void incrementaSemestre(){
        semestre++;
    }
    
    public String desplegarMaterias(){
        return mat1.toString();
    }
    
    public void setMateria(Materia materia){
        this.mat1 = materia;
    }
    
    public void setNotaMateria(int nota){
        mat1.setNota(nota);
    }
}