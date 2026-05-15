package herencia;

public class Alumno extends Persona{
	
	  private String carrera;

	    public Alumno(String nombre, int edad, String carrera) {
	        super(nombre, edad); // SE INVOCA AL CONSTRUCTOR DE LA CLASE PADRE
	        this.carrera = carrera;
	    }

	    // METODO MOSTRAR DATOS ALUMNO
	    public void mostrarAlumno() {
	        System.out.println("\nALUMNO");
	        mostrarDatos();
	        System.out.println("Carrera: " + carrera);
	    }

}
