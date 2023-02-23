package segunda_unidad;

public class p3_14 {
	
	public int dia;
	public int mes;
	public int año;
	public int fecha;

	
	public p3_14(int dia, int mes, int año) {
		this.dia=dia;
		this.mes=mes;
		this.año=año;
		
		  if (dia>31)
				this.dia=0;
		        
	      if (mes>12)
			    this.mes=0;
	}
	
	  public void asignarDia(int diaT) {
		this.dia = diaT;
		
	}
	  public int obtenerDia() {
		return this.dia ;
		
	  }
		
	  public void asignarMes(int mesT) {
		this.mes = mesT;
		
	}
	  public int obtenerMes() {
		return this.mes ;
		
	  }
		
	  public void asignarAño(int añoT) {
		this.año = añoT;
		
	}
	  public int obtenerAño() {
		return this.año ;
}
	  {
		
}
}
