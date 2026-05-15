package overloadAndOverride;



public class ManejoOverloadAndOverride {
	
	
	 public static void ejecutar() {

	     

	        Perro perro = new Perro();
	        String nombre= "BRUNO";
	        int edad= 1;

	        System.out.println("\nMETHOD OVERLOADING Y OVERRIDING");

	        System.out.print("\nNOMBRE DEL PERRO: "+nombre);
	        
	        

	        System.out.print("\nEDAD: "+edad);

	        
	        
	        
	        
	        System.out.println("\nSOBRECARGA");

	        perro.mostrarInfo();

	        System.out.println();

	        perro.mostrarInfo(nombre);

	        System.out.println();

	        perro.mostrarInfo(nombre, edad);

	        System.out.println("\nOVERRIDING");

	        perro.hacerSonido();
	    }

}
