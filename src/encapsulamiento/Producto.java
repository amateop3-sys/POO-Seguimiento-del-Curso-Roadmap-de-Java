package encapsulamiento;

public class Producto {

	
	   private String nombre;
	    private int stock;

	    // CONSTRUCTOR
	    public Producto(String nombre, int stock) {
	        this.nombre = nombre;
	        this.stock = stock;
	    }

	    // GETTERS AN SETTERS
	    public String getNombre() {
	        return nombre;
	    }

	    public int getStock() {
	        return stock;
	    }

	    // SETTER VALIDANDO QUE EL STOCK NO SEA NEGATIVO
	    public void setStock(int stock) {
	        if (stock >= 0) {
	            this.stock = stock;
	        } else {
	            System.out.println("ERRO... EL STOCK NO PUEDE SER NEGATIVO...");
	        }
	    }

	    // METODO PARA VER SI HAY STOCK
	    public boolean hayStock() {
	        return stock > 0;
	    }
	    
	    
}
