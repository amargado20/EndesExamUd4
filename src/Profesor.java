public class Profesor implements Mostrar {

    public String nombreProfesor;
    public String especialidad;

    public Profesor(String nombreProfesor, String especialidad) {
        this.nombreProfesor = nombreProfesor;
        this.especialidad = especialidad;
    }

    public void mostrar() {
        System.out.println("Profesor: " + nombreProfesor + " - " + especialidad);
    }
}
