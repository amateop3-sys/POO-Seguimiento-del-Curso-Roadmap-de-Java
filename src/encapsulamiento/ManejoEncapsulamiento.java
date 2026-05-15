package encapsulamiento;


public class ManejoEncapsulamiento {
	
	
	public static void ejecutar() {
		
		
        // OBJETO PRODUCTO
        Producto producto = new Producto("Iphone", 10);

        // VALOR YA ASIGNADO
        String busqueda = "Iphone";

        System.out.println("PRODUCTO BUSCADO: " + busqueda);

        // VALIDACION
        if (busqueda.equalsIgnoreCase(producto.getNombre())) {

            System.out.println("\nPRODUCTO ENCONTRADO....");
            System.out.println("NOMBRE: " + producto.getNombre());

            if (producto.hayStock()) {

                System.out.println("STOCK DISPONIBLE: "
                        + producto.getStock());

            } else {

                System.out.println("PRODUCTO SIN STOCK");
            }

        } else {

            System.out.println("\nNO SE ENCONTRO EL PRODUCTO");
        }
}
}
