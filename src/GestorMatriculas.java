import java.util.ArrayList;

public class GestorMatriculas implements Mostrar {

    private ArrayList<Matricula> matriculas;

    /**
     * Se creara una nueva lista de matriculas al crearse una variable con ella
     */

    public GestorMatriculas() {
        matriculas = new ArrayList<>();
    }

    /**
     *
     * @param a sera el alumno al que estamos matriculando
     * @param as la asignatura que se esta matriculando
     * @param p el profesor que le va a dar clase
     * @param nota la nota que tiene para entrar
     */

    public void crearMatricula(Alumno a, Asignatura as, Profesor p, double nota) {

        if (nota < 0) {
            nota = 0;
        }

        Matricula m = new Matricula(a, as, p, nota);
        matriculas.add(m);
        a.matricular(m);
    }

    /**
     * muestra la matricula que se le creo
     */
    public void mostrar() {
        for (Matricula m : matriculas) {
            System.out.println(
                m.alumno.nombreAlumno + " - " +
                m.asignatura.nombre + " - " +
                m.profesor.nombreProfesor + " - " +
                m.nota
            );
        }
    }

    /**
     * Enseña el nombre de los alumnos aprobados
     */
    public void mostrarAprobados() {
        for (Matricula m : matriculas) {
            if (m.nota >= 5) {
                System.out.println("APROBADO: " + m.alumno.nombreAlumno);
            }
        }
    }

    /**
     * se le suma la nota a todos lo alumnos y si supera el 10 lo cambia y lo pone a 10
     * @param puntos es la variable que se va a sumar a todas las notas de todos los alumnos
     */

    public void subirNotaTodos(double puntos) {
        for (Matricula m : matriculas) {
            m.nota = m.nota + puntos;

            if (m.nota > 10) {
                m.nota = 10;
            }
        }
    }

    /**
     * @return devuelve la media de todas las notas
     */
    public double mediaGlobal() {
        double suma = 0;

        for (Matricula m : matriculas) {
            suma += m.nota;
        }

        if (matriculas.size() == 0) return 0;

        return suma / matriculas.size();
    }
}
