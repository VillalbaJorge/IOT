package tercera_unidad;

import java.util.Scanner;

public class p4_21 {
	
	public static void main(String args[]) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			 int numero;
			 int mayor = 0;
				
			 System.out.println(" Introduzca 10 numeros  " );
				
			 numero = entrada.nextInt();
				
			for (int i=1;i<=10;i++) {
			    
				numero = entrada.nextInt();				

			if ( numero > mayor) {
				mayor = numero;
				
		}
			
		}
			System.out.println("El numero mayor es: "+ mayor);
	}
			
}
	}




	

