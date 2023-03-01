package tercera_unidad;

import java.util.Scanner;

public class p4_38 {
public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			
			int numero4;
			int aux1=0;
			int aux2=0;
			
			System.out.println("            ");
			System.out.println("------  CIFRAR NUMERO  -------");
			System.out.println("Ingrese un numero de 4 digitos");
			System.out.print  ("            ");
			numero4 = entrada.nextInt();
			System.out.println("            ");
			
			
			while(true) {
				
				if(numero4 > 999 && numero4 < 10000) {
					
					int u1000 	= (numero4 / 1000) % 10;
					int u0100	= (numero4 / 100) % 10;
					int u0010 	= (numero4 / 10) % 10;
					int u0001 	=  numero4 % 10;
					
			//System.out.printf("---->  %d %d %d %d",u1000 , u0100 , u0010 ,u0001);
					
					u1000 = (u1000 + 7) % 10; 
					u0100 = (u0100 + 7) % 10;
					u0010 = (u0010 + 7) % 10;
					u0001 = (u0001 + 7) % 10;
					
		    //System.out.println("                              ");
			//System.out.printf("---->  %d %d %d %d",u1000 , u0100 , u0010 ,u0001);
			//System.out.println("                              ");
			//System.out.println("                              ");
			
					// intercambiar primero con tercero
					aux1 = u1000;
					u1000 = u0010;
					u0010 = aux1;
					
					// intercambiar segundo con cuarto
					aux2 = u0100;
					u0100 = u0001;
					u0001 = aux2;
					
			//System.out.println((u1000 * 1000) + (u0100 *100) + (u0010 * 10) + u0001);
			//System.out.println(u1000  + u0100  + u0010  + u0001);
			//System.out.printf("El numero descifrado es: %d%d%d%d",u1000 * 1000, u0100 *100, u0010 * 10,u0001);
			
			System.out.printf("El numero cifrado es: %d %d %d %d",u1000 , u0100 , u0010 ,u0001);
	
			System.out.println("                              ");
			System.out.println("                              ");
			System.out.println("------ DECIFRAR NUMERO -------");
			System.out.printf ("           %d %d %d %d",u1000 , u0100 , u0010 ,u0001);
			System.out.println("            ");
			
			// intercambiar primero con tercero
			       aux1 = u1000;
			       u1000 = u0010;
			       u0010 = aux1;
			
			// intercambiar segundo con cuarto
			       aux2 = u0100;
			       u0100 = u0001;
			       u0001 = aux2;
			       
			// System.out.println("                              ");
			// System.out.printf("---->  %d %d %d %d",u1000 , u0100 , u0010 ,u0001);
			       
			       u1000 = (u1000 + 3) % 10; 
				   u0100 = (u0100 + 3) % 10;
				   u0010 = (u0010 + 3) % 10;
				   u0001 = (u0001 + 3) % 10;
				   
		    System.out.println("                              ");	   
		    System.out.printf("El numero decifrado es: %d %d %d %d",u1000 , u0100 , u0010 ,u0001);
		    System.out.println("            ");
			
			break;
				
		}

			else {
	
	System.out.println("NUMERO INVALIDO. Vuelva a introducir el numero");
	System.out.print("----> ");
	numero4 = entrada.nextInt();
	System.out.println("            ");
	
}
				
}			
}
}
}


