package parametros;

import java.util.Scanner;

public class UsoParametros {
	
	public static void ejecutar() {

        Scanner ent = new Scanner(System.in);
    

                System.out.println("PASS BY VALUE");

                // VARIABLE ENTERA
                int numero = 5;

                System.out.println("VALOR ORIGINAL: " + numero);

                cambiarValor(numero);

                System.out.println("VALOR FUERA DEL METODO: " + numero);

           
                

                System.out.println("\nPASS BY REFERENCE");

                // OBJETO
                Caja caja = new Caja();

                caja.valor = 20;

                System.out.println("VALOR ORIGINAL DE LA CAJA: " + caja.valor);

                cambiarObjeto(caja);

                System.out.println("VALOR DE LA CAJA DESPUES DEL METODO: " + caja.valor);
            }

	
         	// METODO CAMBIAR VALOR
            public static void cambiarValor(int num) {

                num = num + 10;
                System.out.println("DENTRO DEL METODO (PRIMITIVO): " + num);
            }

            
            
           // METODO CAMBIAR OBJETO
            public static void cambiarObjeto(Caja c) {

                c.valor = c.valor + 10;
                System.out.println("DENTRO DEL METODO (OBJETO): " + c.valor);
            
        
    }
	}

