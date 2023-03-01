package tercera_unidad;

import java.util.Scanner;

public class p4_19 {
	

	public static void main(String[] args) {
		
		
		try (Scanner entrada = new Scanner(System.in)) {
		
			int sueldo;
			double articulo1;               
			double articulo2;               
			double articulo3; 
			double articulo4; 
			int a1;
			int a2;
			int a3;
			int a4;
			double total1;
			double total2;
			double total3;
			
			
			
			System.out.print ("    Unidades vendidas     "); 
			System.out.println ("                          ");
			
			System.out.print ("Articulo 1:  ");
			a1 = entrada.nextInt();
			System.out.print ("Articulo 2:  ");
			a2 = entrada.nextInt();
			System.out.print ("Articulo 3:  ");
			a3 = entrada.nextInt();
			System.out.print ("Articulo 4:  ");
			a4 = entrada.nextInt();
			
			sueldo=200;
			articulo1= 239.99*a1;
			articulo2= 129.75*a2;
			articulo3= 99.95*a3;
			articulo4= 350.89*a4;
			
			total1= articulo1+articulo2+articulo3+articulo4;
			total2= total1*.09;
			total3=sueldo+total2;
			
			System.out.println("----------------------------------" );
			System.out.println("         INGRESOS VENDEDOR        " );
			System.out.println("----------------------------------" );
			System.out.println("   SUELDO SEMANAL FIJO   " + "  = $"+ sueldo );
			System.out.println("                         " );
			System.out.println(" U vendidas de 239.99  x " + a1 + " = $"+ String.format("%.2f", articulo1) );
			System.out.println(" U vendidas de 129.75  x " + a2 + " = $"+ String.format("%.2f", articulo2) );
			System.out.println(" U vendidas de 99.95   x " + a3 + " = $"+ String.format("%.2f", articulo3) );
			System.out.println(" U vendidas de 350.89  x " + a4 + " = $"+ String.format("%.2f", articulo4) );
			System.out.println("                         " );
			System.out.println("    PRODUCCION:    $" + String.format("%.2f", total1) );
			System.out.println("  COMISION(9%):    $" + String.format("%.2f", total2) );
			System.out.println("         TOTAL:    $" + String.format("%.2f", total3) );
			
			
			
}
	}
}


