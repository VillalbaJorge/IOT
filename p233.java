import java.util.Scanner;

public class p233 {

	public static void main(String[] args) {
		
		try (Scanner entrada = new Scanner(System.in)) {
			float bmi;
			float peso;
			float altura;
			
			char elegir;
			do
			{

			
			System.out.println("Bienvenido, Calculadora BMI "); 
			System.out.println("Favor de introducir los datos que se piden: "); 
			System.out.println("                            "); 
			
			
System.out.print("Peso en Kilogramos: "); 
peso = entrada.nextFloat();

System.out.print("Altura en Metros: "); 
altura = entrada.nextFloat();

bmi= peso/ (altura*altura);


			System.out.println("                          ");
			System.out.println("------------------------  ");
			System.out.println("                          ");
			System.out.println("     VALORES DEL BMI      ");
			System.out.println(" Bajo peso:   <18.5       ");
			System.out.println("    Normal:    18.5 - 24.9");
			System.out.println(" Sobrepeso:    25 - 29.9  ");
			System.out.println("     Obeso:   >30         ");
			System.out.println("                          ");
			System.out.println("------------------------  ");
			System.out.println("                          ");
			System.out.println(" Tu BMI es: " + bmi);
			
			
			if  (bmi>=30&&bmi<=50) 
			    System.out.println(" Tu BMI indica Obesidad ");
			   else
			    if(bmi>=25&&bmi<=29.9)
			     System.out.println(" Tu BMI indica Sobrepeso ");
			    else
			     if(bmi>=18.5&&bmi<=24.9)
			      System.out.println(" Tu BMI indica Peso normal ");
			     else
			      if(bmi>=1&&bmi<=18.5)
			       System.out.println(" Tu BMI indica Bajo peso ");
			       else
			        System.out.println(" Informacion no valida");
					 
			
			
			System.out.println("               ");
			System.out.println("Continuar? Y/N ");
			elegir = entrada.next().charAt(0);

						} while(elegir =='y' || elegir == 'Y');
		}
	
		System.out.println(" adios popo ");
		System.out.println("                    ");
		System.out.println(" PROGRAMA FINALIZADO");
		        
		      
} 
}

	
	

