package tercera_unidad;

import java.util.Scanner;

public class prueba {
	
	public static void main(String args[]) {
		
		try (Scanner entrada = new Scanner(System.in)) {

			 int numero;
			 int contador = 1;
			 int mayor = 0;
				
				System.out.println(" Introduzca 10 numeros  " );
				
				while ( 10 >= contador)
				{

				System.out.print((contador++)+":  ");
				numero = entrada.nextInt();

				if ( numero > mayor)
				mayor = numero;
				}
				System.out.println("El numero mayor es: "+ mayor);
			
		}
	}
}

