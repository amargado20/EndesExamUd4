public class Profesor implements Mostrar {

    public String nombreProfesor;
    public String especialidad;

    public Profesor(String nombreProfesor, String especialidad) {
        this.nombreProfesor = nombreProfesor;
        this.especialidad = especialidad;
    }

    /*
     *Utiliza el metodo mostrar de la interfaz
     */
    public void mostrar() {
        System.out.println("Profesor: " + nombreProfesor + " - " + especialidad);
    }
}
