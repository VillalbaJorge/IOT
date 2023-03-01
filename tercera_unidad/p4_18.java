package tercera_unidad;

import java.util.Scanner;

public class p4_18 {
	
	public static void main(String[] args) {
		
	
	try (Scanner entrada = new Scanner(System.in)) {
	
		int cuenta;               
		double saldo;                              
		double cargos;               
		double limite; 
		double saldo2;
		double negativo;
		double creditos;
		
			System.out.print ("Cuenta:      "); 
			cuenta = entrada.nextInt();
			
			System.out.print ("Saldo:       ");           
			saldo = entrada.nextDouble();    
			
			System.out.print ("Cargos:      ");        
			cargos = entrada.nextDouble();    
			
			System.out.print ("Creditos:    ");        
			creditos = entrada.nextDouble();
			
			System.out.print ("Limite:      ");      
			limite = entrada.nextDouble();  
			
			saldo2= saldo + cargos - creditos;
			negativo= saldo2-limite;
			
			
			System.out.println("--------------------" );
			System.out.println("       CUENTA       " );
			System.out.println("--------------------" );
			System.out.println(" Cuenta:            " + cuenta );
			System.out.println(" Limite:            " + limite );
			System.out.println(" Saldo a pagar:     " + saldo2 );
			
			if (saldo2 < 0) {
			System.out.println("     Saldo a favor    ");
			}
			
			if(saldo2==limite) {
				   System.out.println("Cuenta al limite de credito");
			}
			   
			else
				
			{
				
			
			if(saldo2 > limite) {
				   System.out.println("                            ");
				   System.out.println("LIMITE DE CREDITO EXCEDIDO  ");
				   System.out.println("Se excedio el limite de su credito por:   " + negativo);
			}
			   
			else
			   System.out.println("     Limite normal  "); 
			}
			}
	        }
	        }

	
	
	
		
			
		
		
	
	