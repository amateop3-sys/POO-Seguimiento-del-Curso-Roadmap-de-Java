package modificadores;

public class Acceso {
	
	private String privado = "PRIVADO";
	
    String porDefecto = "DEFECTO";
    protected String protegido = "PROTEGIDO";
    public String publico = "PUBLICO";

    // Método para mostrar todos desde dentro
    public void mostrarDesdeDentro() {
        System.out.println("\nMISMA CLASE");
        System.out.println(privado);
        System.out.println(porDefecto);
        System.out.println(protegido);
        System.out.println(publico);
    }

    // Getter para private
    public String getPrivado() {
        return privado;
    }

}
