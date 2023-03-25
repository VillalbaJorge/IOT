package unidad9_ejercicio914y915;

public class empleadoporcomision extends empleado 
	{
	   private double ventasBrutas;
	   private double tarifaComision;

	public empleadoporcomision(String primerNombre, String apellidoPaterno, 
			String numeroSeguroSocial,double ventasBrutas, double tarifaComision) 
	{ 
		super(primerNombre, apellidoPaterno, numeroSeguroSocial);
		this.ventasBrutas = ventasBrutas;
	    this.tarifaComision = tarifaComision;
	}

	public double ingresos() 
	{
	  return tarifaComision * ventasBrutas;
	}

	public String toString() 
	{
	return String.format("empleado por comisión: %s%nventas brutas: $%,.2f; "
	+ "tarifa de comisión: %.2f", super.toString(), ventasBrutas, tarifaComision);
	}
	
}
