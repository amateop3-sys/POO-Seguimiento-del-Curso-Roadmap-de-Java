package herencia;

public class ManejoHerencia {
	
	public static void ejecutar() {

 

        // OBJETO ALUMNO
        Alumno alumno = new Alumno("ABDIEL", 19, "Ingeniería en Sistemas");

        // OBJETO PROFESOR
        Profesor profesor = new Profesor("WALTER", 25, "Programación");

        // LLAMAR METODOS
        alumno.mostrarAlumno();
        profesor.mostrarProfesor();
    }

}
