import java.util.Scanner; 

public class p216 {

	public static void main(String[] args) {
		
try (Scanner entrada = new Scanner(System.in)) {
	int A;
	int B;
	char elegir;
	
	do {
		
	
	System.out.print("Escriba primer num "); 
	A = entrada.nextInt();
		
	System.out.print("Escriba segundo num "); 
	B = entrada.nextInt();
	
	if(A==B)
	    System.out.println("Son Iguales ");
	else
		
	{if(A > B)
	System.out.println("El mayor es:" + A);
	else
	 System.out.println("El mayor es:" + B); 
	
	if(A < B)
	   System.out.println("El menor es:" +A);
	else
	 System.out.println("El menor es:" +B); 
	
	}
	System.out.println("Continuar? Y/N ");
	elegir = entrada.next().charAt(0);

				}while(elegir =='y' || elegir == 'Y');
			}
			
			System.out.println(" adios popo ");
			System.out.println("                    ");
			System.out.println(" PROGRAMA FINALIZADO");
	        
	    } 

}

