package typeCasting;

public class Ejercicios {

	public static void main(String[] args) {
		
		
		// Convertir de int a float
		int num= 10;
		
		System.out.println("EL NUMERO EN INT ES: "+num);
		
		double data = num;
		
		System.out.println("EL NUMERO EN FLOAT ES: "+data);
		
		// ----------------------------------------------------
		
		System.out.println("---------------------------------------");
		
		// Convertir de double a int
		
		double num1= 10.99;
		
		System.out.println("EL NUMERO EN FLOAT ES: "+num1);
		
		int data2 = (int)num1;
		
		System.out.println("EL NUMERO EN INT ES: "+data2);

		
		System.out.println("---------------------------------------");
		
		// Convertir de int a String
		
		int num2= 10;
		
		System.out.println("EL NUMERO EN INT ES: "+num2);
		
		String data3= String.valueOf(num2);
		
		System.out.println("EL NUMERO EN STRING ES: "+data3);
		
		
		
		System.out.println("---------------------------------------");
		
		
		// Convertir de String a int
		
		String data4= "10";
		
		System.out.println("EL NUMERO EN STRING ES: "+data4);
		
		int num3 = Integer.parseInt(data4);
		
		System.out.println("EL NUMERO EN INT ES: "+num3);
		
		
		System.out.println("---------------------------------------");
		
		
	}

}
