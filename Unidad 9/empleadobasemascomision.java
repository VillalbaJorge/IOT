package unidad9_ejercicio914y915;

public class empleadobasemascomision extends empleadoporcomision 
	   {
		  private double salarioBase;

	  public empleadobasemascomision(String primerNombre, String apellidoPaterno, 
			  String numeroSeguroSocial,double ventasBrutas, double tarifaComision, double salarioBase)
	    { 
	    	  super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas,tarifaComision);
	 
	       this.salarioBase = salarioBase;
	    }

	  public double ingresos() 
	    {
	       return salarioBase + super.ingresos();
	    }

	  public String toString()
	  {
		     return String.format("empleado con salario base más comisión: %s%nsalario base:$%,.2f",
		    		 super.toString(), salarioBase);
		    
		    }
}
