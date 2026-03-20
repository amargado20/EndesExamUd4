import java.util.ArrayList;

public class Alumno implements Mostrar {

    public String nombreAlumno;
    private int edadAlumno;
    private ArrayList<Matricula> matriculas;

    public Alumno(String nombreAlumno, int edadAlumno) {
        this.nombreAlumno = nombreAlumno;
        this.edadAlumno = edadAlumno;
        this.matriculas = new ArrayList<>();
    }

    public void matricular(Matricula m) {
        matriculas.add(m);
    }

    public void mostrar() {
        System.out.println("Alumno: " + nombreAlumno);

        for (Matricula m : matriculas) {
            System.out.println("Asignatura: " + m.asignatura.nombre +
                    " Profesor: " + m.profesor.nombreProfesor +
                    " Nota: " + m.nota);
        }
    }

    public double calcularMedia() {
        double suma = 0;

        for (Matricula m : matriculas) {
            suma += m.nota;
        }

        if (matriculas.size() == 0) return 0;

        return suma / matriculas.size();
    }
}
