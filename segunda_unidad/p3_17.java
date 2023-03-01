package segunda_unidad;

public class p3_17 {
	public String nombre;
	public String apellido;
	public int dia;
	public int mes;
	public int año;
	public double bmi;
	public double peso;
	public double altura;
	public String sexo;
	
	public int edad;
	public int cardioMax;
	public int cardioEsp1;
	public int cardioEsp2;
	
	public p3_17(String nombre, String apellido, int dia, int mes, int año, double altura, double peso, String sexo) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.dia=dia;
		this.mes=mes;
		this.año=año;
		this.altura=altura;
		this.peso=peso;
		this.sexo=sexo;
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
		  
	 public void asignarAltura(int alturaT) {
				this.altura = alturaT;
				
			}
			  public double obtenerAltura() {
				return this.altura ;
		}
			 
			  public void asignarPeso(int pesoT) {
					this.peso = pesoT;
					
				}
				  public double obtenerPeso() {
					return this.peso ;
			}
				  public void asignarSexo(String sexoT) {
						this.sexo = sexoT;
						
					}
					     public String obtenerSexo() {
						return this.sexo ;
						
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
		  public double obtenerbmi() {
			    
			  bmi= peso/ (altura*altura);
				return this.bmi ;
				
	          }

}
