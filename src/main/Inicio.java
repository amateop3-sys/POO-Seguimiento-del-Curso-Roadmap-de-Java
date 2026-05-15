package main;




import enums.*;
import excepcionHandling.*;
import initializer.*;
import paquetes.*;
import parametros.*;
import encapsulamiento.*;





public class Inicio {

	public static void main(String[] args) {
		
		
		
		
		// uso de enums
		System.out.println("---------------------------");
		System.out.println("ENUMS");
		System.out.println("---------------------------");
		UsodeEnums.ejecutar();
		
		System.out.println("\n");
		

		// uso de excepciones
		System.out.println("---------------------------");
		System.out.println("EXCEPCIONES");
		System.out.println("---------------------------");
		Excepcion.ejecutar();
		
		System.out.println("\n");
		
		
		
		// uso de initializer
		System.out.println("---------------------------");
		System.out.println("INITIALIZER");
		System.out.println("---------------------------");
		EjemploInitializer.ejecutar();
		
		System.out.println("\n");
		
		
		
		// Uso de paquetes
		System.out.println("---------------------------");
		System.out.println("PAQUETES");
		System.out.println("---------------------------");
		TablasDeMultiplicar.ejecutar();
		
		
		System.out.println("\n");
		
		
		// uso de parametros
		System.out.println("---------------------------");
		System.out.println("PARAMETROS");
		System.out.println("---------------------------");
		UsoParametros.ejecutar();
		
		System.out.println("\n");
		
		
		// uso de encapsulamiento
		System.out.println("---------------------------");
		System.out.println("ENCAPSULAMIENTO");
		System.out.println("---------------------------");
		ManejoEncapsulamiento.ejecutar();
				
		System.out.println("\n");
		
				
				
				
	}

}
