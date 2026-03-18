package Materias;

/**
 * 
 *
 */
public class CalificacionesAlumno {

    public static void main(String[] args) {
        Alumno obj1 = new Alumno("Diego", "25030283", 2);
        System.out.println(obj1.toString());
        obj1.incrementaSemestre();
        System.out.println(obj1.toString());

        Materia objMt1 = new Materia("POO", "AED-1286", 3, 2);
        System.out.println(objMt1.toString());
        System.out.println("--------------");
        obj1.setMateria(objMt1);
        System.out.println(obj1.desplegarMaterias());

        Materia objMt2 = new Materia("Videojuegos", "QWERTY-123", 2, 1);
        obj1.setMateria(objMt2);
        System.out.println(obj1.desplegarMaterias());

        obj1.setNotaMateria(88);
        System.out.println("----------------");
        System.out.println(obj1.desplegarMaterias());

        System.out.println("_____________________________");
        Alumno pedro = new Alumno("Pedro", "24030818", 4);
        pedro.setMateria(objMt1);
        pedro.setNotaMateria(80);
        System.out.println(pedro.toString());
        System.out.println(pedro.desplegarMaterias());
    }

}
