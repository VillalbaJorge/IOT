package segunda_unidad;

import java.util.Scanner;

public class p3_16main {
public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			
			String nombre;
			String apellido;
			
			int dia;
			int mes;
			int año;
			int edad;
			int cardioMax;
			int cardioEsp1;
			int cardioEsp2;
			
			char elegir;
		
		
		do {
			
			System.out.println("Bienvenido, Calculadora de la frecuencia cardiaca"); 
			System.out.println("Favor de introducir los datos que se piden "); 
			System.out.println("                            "); 
			
			System.out.print("Nombre:    "); 
			nombre = entrada.next();
				
			System.out.print("Apellido   "); 
			apellido = entrada.next();
			
			System.out.println("Fecha de nacimiento, favor de usar numeros"); 
			System.out.print("Dia:  "); 
			dia = entrada.nextInt();
			System.out.print("Mes:  "); 
			mes = entrada.nextInt();
			System.out.print("Año:  "); 
			año = entrada.nextInt();
			
			edad= 2023-año;
			cardioMax= 220- edad;
			cardioEsp1= (50 * cardioMax) / 100;
			cardioEsp2= (85 * cardioMax) / 100;
			
			System.out.println("--------------------------------");
			System.out.println("         HOJA DE DATOS          ");
			System.out.println("--------------------------------");
			System.out.println(" Paciente:      " + apellido+" , " + nombre );
			System.out.println(" Fecha de nac:  " + dia+ " / "+mes+" / "+ año );
			System.out.println(" Edad:          " + edad);
			System.out.println(" Frec cardiaca max: " + cardioMax);
			System.out.println(" Frec cardiaca esp: " + cardioEsp1 + " - " + cardioEsp2);
			System.out.println("                                ");
			System.out.println("Las frecuencias cardiacas máxima y esperada pueden variar con base en la salud,\r\n"
					+ "condición física y sexo del individuo. Siempre debe consultar un médico o a un profesional\r\n"
					+ "de la salud antes de empezar o modificar un programa de ejercicios");
			
			
			
			System.out.println("               ");
			System.out.println("Continuar? Y/N ");
			elegir = entrada.next().charAt(0);
		
	}
		while(elegir =='y' || elegir == 'Y');
	}
	
	System.out.println("                    ");
	System.out.println(" PROGRAMA FINALIZADO");
}
}


