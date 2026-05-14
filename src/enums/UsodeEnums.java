package enums;

public class UsodeEnums {

	public static void ejecutar(){
		
	 System.out.println("\nEJEMPLO: ");

     DiaSemana dia = DiaSemana.VIERNES;

     System.out.println("DIA: " + dia);

     if (dia == DiaSemana.MIERCOLES || dia == DiaSemana.JUEVES) {
         System.out.println("MITAD DE LA SEMANA");
     } else {
         System.out.println("DIA NORMAL");
     }
 }
}
