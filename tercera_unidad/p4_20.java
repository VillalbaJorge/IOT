package tercera_unidad;

import java.util.Scanner;

public class p4_20 {
	

public static void main(String[] args) {
		
		
		try (Scanner entrada = new Scanner(System.in)) {
		
			String empleado1;
			String empleado2;
			String empleado3;
			int horas1;      
			int horas2;
			int horas3;               
			int horaextra1; 
			int horaextra2; 
			int horaextra3; 
			double sueldoxhora;
			double sueldoxhoraextras1;
			double sueldoxhoraextras2;
			double sueldoxhoraextras3;
			double sueldo1;
			double sueldo2;
			double sueldo3;
			
			
			System.out.print   ("    Calculadora salario   "); 
			System.out.println ("                          ");
					
			System.out.print ("Sueldo x hora:      ");
			sueldoxhora = entrada.nextDouble();
			
			System.out.print ("Empleado:           ");
			empleado1 = entrada.next();
			System.out.print ("Horas trabajadas:   ");
			horas1 = entrada.nextInt();
			
			System.out.print ("Empleado:           ");
			empleado2 = entrada.next();
			System.out.print ("Horas trabajadas:   ");
			horas2 = entrada.nextInt();
			
			System.out.print ("Empleado:           ");
			empleado3 = entrada.next();
			System.out.print ("Horas trabajadas:   ");
			horas3 = entrada.nextInt();
		
			
			horaextra1=horas1-40;
			horaextra2=horas2-40;
			horaextra3=horas3-40;
			
			if(horas1>40) {
				horaextra1=horas1-40;
			}				
			if(horaextra1<0) {
				horaextra1=0;
			}
			if(horas2>40) {
				horaextra2=horas2-40;
			}				
			if(horaextra2<0) {
				horaextra2=0;
			}
			if(horas3>40) {
				horaextra3=horas3-40;
			}				
			if(horaextra3<0) {
				horaextra3=0;
			}
			
			sueldoxhoraextras1= horaextra1*(sueldoxhora*1.5);	
			sueldo1= (sueldoxhora*(horas1-horaextra1)) + sueldoxhoraextras1;
			sueldoxhoraextras2= horaextra2*(sueldoxhora*1.5);	
			sueldo2= (sueldoxhora*(horas2-horaextra2)) + sueldoxhoraextras2;
			sueldoxhoraextras3= horaextra3*(sueldoxhora*1.5);	
			sueldo3= (sueldoxhora*(horas3-horaextra3)) + sueldoxhoraextras3;

			System.out.println("                -------------------------------------- " );
		    System.out.println("                           CALCULADORA SUELDO          " );
			System.out.println("                -------------------------------------- " );
			System.out.println("                          Sueldo por hora:  " + sueldoxhora);
			System.out.println("                    Sueldo por hora extra:  " + (sueldoxhora*1.5));
			System.out.println("                                  " );
			System.out.printf("%15s %10s %10s %10s %10s %n","Nombre", "Hrs","Hrs/e" ,"$Hr/e", "TOTAL");
			System.out.printf("%15s %10s %10s %10s %10s %n",empleado1, horas1, horaextra1 ,sueldoxhoraextras1, sueldo1);
			System.out.printf("%15s %10s %10s %10s %10s %n",empleado2, horas2, horaextra2 ,sueldoxhoraextras2, sueldo2);
			System.out.printf("%15s %10s %10s %10s %10s %n",empleado3, horas3, horaextra3 ,sueldoxhoraextras3, sueldo3);
}
}
}