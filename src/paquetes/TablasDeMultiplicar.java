package paquetes;

public class TablasDeMultiplicar {
	
	public static void ejecutar() {

		System.out.println("---------------------------");
        System.out.println("TABLAS DE MULTIPLICAR: ");
        System.out.println("---------------------------");

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nTABLA DEL " + i + ":");

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }

}
}
