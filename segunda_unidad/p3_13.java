package segunda_unidad;

public class p3_13 {

	public String nombre;
	public String apellido;
	public double salario;
	public double porcentaje; 
	public double anualidad;
	
	public p3_13(String nombre, String apellido, double salario) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.salario=salario;
		
		if (salario<0)
			this.salario=0.0;
	}
	
  public void asignarNombre(String nombreT) {
	this.nombre = nombreT;
}
  public String obtenerNombre() {
	return this.nombre;
}
  public void asignarApellido(String apellidoT) {
	this.apellido = apellidoT;
}
  public String obtenerApellido() {
	return this.apellido;
}
  public void asignarSalario(double salario) {
	this.salario = salario;
}
  public double obtenerSalario() {
	return this.salario;
}
 
  public double obtenerPorcentaje() {
	return this.salario*12*.10;
}
  
 
}

