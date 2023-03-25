package unidad9_ejercicio914y915;

public class pruebaempleadobasemascomision {

		public static void main(String[] args)
		{
			
	    empleadobasemascomision empleado1=new empleadobasemascomision("Luis", "Carrasco", 
	    		"72795608040", 33 , 20 , 3200 );
	    		
	  
	        System.out.print("Empleado por comision.\n"
	        		+ "Nombre:                    "+empleado1.obtenerPrimerNombre()+"\n"
	        		+ "Primer apellido:           "+empleado1.obtenerApellidoPaterno()+"\n"
	        		+ "Numero Socuial:            "+empleado1.obtenerNumeroSeguroSocial()+"\n"
	                + "Sueldo Base Mas Comision:  "+empleado1.ingresos());
		
		}
}
