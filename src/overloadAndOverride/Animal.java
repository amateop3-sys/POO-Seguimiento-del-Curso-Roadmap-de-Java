package overloadAndOverride;

public class Animal {
	
	
	 // SOBRECARGA
    public void mostrarInfo() {
        System.out.println("Animal....");
    }

    public void mostrarInfo(String nombre) {
        System.out.println("NOMBRE: " + nombre);
    }

    public void mostrarInfo(String nombre, int edad) {
        System.out.println("NOMBRE: " + nombre);
        System.out.println("EDAD: " + edad);
    }

    // METODO PARA SOBRECARGA
    public void hacerSonido() {
        System.out.println("El animal hace un sonido...");
    }

}
