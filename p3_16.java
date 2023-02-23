package segunda_unidad;

public class p3_16 {

	public String nombre;
	public String apellido;
	public int dia;
	public int mes;
	public int año;
	
	public int edad;
	public int cardioMax;
	public int cardioEsp1;
	public int cardioEsp2;
	
	public p3_16(String nombre, String apellido, int dia, int mes, int año) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dia=dia;
		this.mes=mes;
		this.año=año;
}
	public void asignarNombre(String nombreT) {
		this.nombre = nombreT;
		
	}
	     public String obtenerNombre() {
		return this.nombre ;
		
	  }
	public void asignarApellido(String apellidoT) {
			this.apellido = apellidoT;
			
		}
		  public String obtenerApellido() {
		 return this.apellido ;
			
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
		  public int obtenerEdad() {
			    edad= 2023-año;
				return this.edad ;
		  }
		  
		  public int obtenerMax() {
			    cardioMax= 220- edad;
				return this.cardioMax ;
		  }
		  
		  public int obtenerEsp1() {
			    
			cardioEsp1= (50 * cardioMax) / 100;
			return this.cardioEsp1 ;
			
          }
		  public int obtenerEsp2() {
			    
	        cardioEsp2= (85 * cardioMax) / 100;
		    return this.cardioEsp2 ;
	}
}
