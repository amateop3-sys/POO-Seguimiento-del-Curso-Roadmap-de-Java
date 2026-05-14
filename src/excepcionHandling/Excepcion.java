package excepcionHandling;

import java.util.Scanner;

public class Excepcion {
	
	
	public static void ejecutar() {
		
	  try (Scanner entrada = new Scanner(System.in)) {
		System.out.println("-------------------");
		  System.out.println("USO DE EXCEPCIONES");
		  System.out.println("-------------------");
		  
		  
		  // SE METE LO QUE ES POSIBLE QUE FALLE DENTRO DE UN TRY
		  try {
		      // SE INGRESA LOS DATOS
		      System.out.print("INGRESE NUMERADOR: ");
		      int num1 = entrada.nextInt();

		      System.out.print("INGRESE DENOMINADOR: ");
		      int num2 = entrada.nextInt();

		      
		      int resultado = num1 / num2;

		      System.out.println("Resultado: " + resultado);
		      

		    // SI FALLA NOS DARÁ ESTA EXCEPCION, SE USA ARITHETIC PARA VALIDAR LA DIVISION DE CERO
		  } catch (ArithmeticException e) {
		      System.out.println("ERROR, NO ES POSIBLE DIVIDIR ENTRE CERO...");

		  } catch (Exception e) {
		      System.out.println("ERROR, COLOQUE UN NUMERO...");

		  }
	  }

	  System.out.println("RESTABLECIENDO....");
      
                    
}


}