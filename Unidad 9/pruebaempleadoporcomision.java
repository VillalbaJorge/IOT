package unidad9_ejercicio914y915;

public class pruebaempleadoporcomision {

		public static void main(String[] args) 
		{

		empleadoporcomision empleado1=new empleadoporcomision("Luis", "Carrasco", 
		"72795608040", 33, 20);
			
			System.out.print("Empleado por comision.\n"
	        		+ "Nombre:                    "+empleado1.obtenerPrimerNombre()+"\n"
	        	    + "Primer apellido:           "+empleado1.obtenerApellidoPaterno()+"\n"
	        		+ "Numero Socuial:            "+empleado1.obtenerNumeroSeguroSocial()+"\n"
	                + "Tarifa por Comision:       "+empleado1.ingresos());
		}
		
}
