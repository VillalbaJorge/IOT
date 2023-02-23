package segunda_unidad;

public class p3_15 {
	//public y private son palabbras reservadas como modificadores de acceso
	
	// atributos
	//caracteristicas
	
	private String nombre; 
	private double saldo; 
	
	public p3_15(String nombre, double saldo) {
		this.nombre=nombre;
		this.saldo=saldo;
	}
	
	// Metodos
	//acciones
	
	public void asignarNombre (String nombreCuenta) {
		this.nombre= nombreCuenta;
}
	public String obtenerNombre () {
		return this.nombre;
}
	public double obtenerSaldo() {
		return this.saldo;
}	
	
	public void depositar(double cantidad) {
		if (cantidad>0 ) {
		saldo= saldo+cantidad; 
} else {
	System.out.println("La cantidad depositada es incorrecta");
}
	}



}
