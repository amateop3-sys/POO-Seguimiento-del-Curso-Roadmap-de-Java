package initializer;

public class EjemploInitializer {
	
	public static void ejecutar() {

		System.out.println("------------------------------");
        System.out.println("USO DE INITIALIZER BLOCK");
        System.out.println("------------------------------");

        // SE CREA UN OBJETO A PARTIR DE LA CLASE, COMO TIENE CONSTRUCTOR SE PONEN LOS DATOS DENTRO DEL PARENTESIS
        Estudiante e1 = new Estudiante("jose", 15);

        System.out.println("\nDATOS:");
        e1.mostrarDatos();
    }

}
