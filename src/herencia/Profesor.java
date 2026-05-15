package herencia;

public class Profesor extends Persona {
	
	 private String materia;

	    public Profesor(String nombre, int edad, String materia) {
	        super(nombre, edad); // SE INVOCA AL CONSTRUCTOR DE LA CLASE PADRE
	        this.materia = materia;
	    }

	    // METODO MOSTRAR DATOS DE PROFESOR
	    public void mostrarProfesor() {
	        System.out.println("\nPROFESOR");
	        mostrarDatos();
	        System.out.println("Materia: " + materia);
	    }

}
