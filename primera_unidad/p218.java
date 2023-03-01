import java.util.Scanner;



public class p218 {

	public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			int opcion;
			char elegir;
			do
			{
				System.out.println("   1 = Cuadrado   ");
				System.out.println("   2 = Ovalo      ");
				System.out.println("   3 = Flecha     ");
				System.out.println("   4 = Diamante   ");
				System.out.println("                  ");
				System.out.println(" Elige un numero: ");
				System.out.println("                  ");
				opcion = entrada.nextInt();
			



switch (opcion) {
case 1: 
System.out.println("* * * * * * * * *");
System.out.println("*               *");
System.out.println("*               *");
System.out.println("*               *");
System.out.println("*               *");
System.out.println("*               *");
System.out.println("*               *");
System.out.println("*               *");
System.out.println("* * * * * * * * *");
break; 

case 2: 
System.out.println("     *  *  *     ");
System.out.println("  *           *  ");
System.out.println("*               *");
System.out.println("*               *");
System.out.println("*               *");
System.out.println("*               *");
System.out.println("*               *");
System.out.println("  *           *  ");
System.out.println("     *  *  *     ");
break; 

case 3: 
System.out.println("        *        ");
System.out.println("       ***       ");
System.out.println("      *****      ");
System.out.println("        *        ");
System.out.println("        *        ");
System.out.println("        *        ");
System.out.println("        *        ");
System.out.println("        *        ");
System.out.println("        *        ");
break; 

case 4: 
System.out.println("        *        ");
System.out.println("      *   *      ");
System.out.println("     *     *     ");
System.out.println("    *       *    ");
System.out.println("   *         *   ");
System.out.println("    *       *    ");
System.out.println("     *     *     ");
System.out.println("      *   *      ");
System.out.println("        *        ");
break; 


default:
System.out.println("ni idea pa");

} 

System.out.println("Continuar? Y/N ");
elegir = entrada.next().charAt(0);

			}while(elegir=='y' || elegir == 'Y');
		}
		
		System.out.println(" adios popo ");
		System.out.println("                    ");
		System.out.println(" PROGRAMA FINALIZADO");
        
    } 

		}
		
	
	