package initializer;

import java.util.Scanner;

public class Estudiante {
	static Scanner entrada = new Scanner(System.in);
	
	
	    // ATRIBUTOS
	    String nombre;
	    int edad;

	    static {
	    	
	        System.out.println("STATICO");
	        System.out.println("CLASE ESTUDIANTE CARGADA...");
	        System.out.println("------------------------------");
	    }
	    

	    // CONSTRUCTOR
	    public Estudiante(String nombre, int edad) {
			super();
			this.nombre = nombre;
			this.edad = edad;
		}

		// METODO
	    public void mostrarDatos() {
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Edad: " + edad);
	    }
	
	

}

