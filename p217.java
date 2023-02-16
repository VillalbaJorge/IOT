import java.util.Scanner; 

public class p217 {

	public static void main(String[] args) {
	try (Scanner entrada = new Scanner(System.in)) {
		int A;
		int B;
		int C;
		
		int suma;
		int promedio;
		int producto;
		
		char elegir;
		
		do {
		
		System.out.print("Escriba primer num: "); 
		A = entrada.nextInt();
			
		System.out.print("Escriba segundo num:  "); 
		B = entrada.nextInt();
		
		System.out.print("Escriba tercer num:  "); 
		C = entrada.nextInt();
		
		suma = A + B + C;
		promedio = suma/3;
		producto = A * B * C;
		
		System.out.printf(" La suma es: %d%n ", suma);
		
		
		System.out.printf("El promedio es: %d%n ", promedio);
		
		
		System.out.printf("La multiplicacion es: %d%n ", producto);
	
		System.out.println("Continuar? Y/N ");
		elegir = entrada.next().charAt(0);

					}while(elegir =='y' || elegir == 'Y');
				}
				
				System.out.println(" adios popo ");
				System.out.println("                    ");
				System.out.println(" PROGRAMA FINALIZADO");
		        
	}
}

	


