package modificadores;

public class ManejoAcceso {
	
	public static void ejecutar() {

        System.out.println("\n ACCESS SPECIFIERS");

        Acceso obj = new Acceso();

        
        // ACCESO DESDE EL MISMO PAQUETE
        System.out.println("\nMISMO PACKAGE");

        // NO PERMITE ACCEDER DIRECTAMENTE, AL MENOS CON GETTER Y SETTERS
        System.out.println("PRIVADO: " + obj.getPrivado());

        // DEFAUL
        System.out.println(obj.porDefecto);

        // PROTEGIDO
        System.out.println(obj.protegido);

        // PUBLICO
        System.out.println(obj.publico);

        
        // METODO
        obj.mostrarDesdeDentro();
    }

}
