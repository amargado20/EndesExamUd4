import java.util.ArrayList;

public class Curso implements Mostrar{

    private String nombreCurso;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Asignatura> asignaturas;
    private ArrayList<Profesor> profesores;

    public Curso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
        alumnos = new ArrayList<>();
        asignaturas = new ArrayList<>();
        profesores = new ArrayList<>();
    }

    public void agregarAlumno(Alumno a) {
        alumnos.add(a);
    }

    public void agregarAsignatura(Asignatura a) {
        asignaturas.add(a);
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void mostrar() {
        System.out.println("CURSO: " + nombreCurso);

        for (Alumno a : alumnos) {
            System.out.println("Alumno: " + a.nombreAlumno);
        }

        for (Asignatura as : asignaturas) {
            System.out.println("Asignatura: " + as.nombre);
        }

        for (Profesor p : profesores) {
            System.out.println("Profesor: " + p.nombreProfesor);
        }
    }
}
