package segunda_unidad;

public class p3_15main {
public static void mostrarCuenta(p3_15 cuentaAmostrar) {
		
		System.out.println("Nombre:    "  + cuentaAmostrar.obtenerNombre());
	    System.out.println("Saldo:     "  + cuentaAmostrar.obtenerSaldo());
		
	    System.out.println("--------------------------");
		
		
		}
	
	
	public static void main(String[] args) {
		
		p3_15 cuenta1 = new p3_15("Carlos", 1000.00);
		p3_15 cuenta2 = new p3_15("Pedro", 1000.00);
		
		System.out.println("Nombre:    "  + cuenta1.obtenerNombre());
	    System.out.println("Saldo:     "  + cuenta1.obtenerSaldo());
		
	    System.out.println("--------------------------");
	    System.out.println("Nombre:    "  + cuenta2.obtenerNombre());
	    System.out.println("Saldo:     "  + cuenta2.obtenerSaldo());
		
	    System.out.println("--------------------------");
		
	
		
		//System.out.println("Nombre:    "  + cuentaAmostrar.obtenerNombre());
	}
		
		//cuentabanco cuenta1 = new cuentabanco();
		//cuentabanco cuenta2 = new cuentabanco();
 
		//System.out.print("Nombre:    "+cuenta1.obtenerNombre());
		//cuenta1.asignarNombre("Carlitos");
		//System.out.println(cuenta1.obtenerNombre());
		//System.out.println("Saldo:     " + cuenta1.obtenerSaldo());
		//cuenta1.depositar(1000);
		//System.out.println("newSaldo:  " + cuenta1.obtenerSaldo());
		
		//System.out.println("--------------------------");
		
		//System.out.print("Nombre:    "+cuenta2.obtenerNombre());
	//	cuenta2.asignarNombre("Pedrito");
	//	System.out.println(cuenta1.obtenerNombre());
	//	System.out.println("Saldo:     " + cuenta2.obtenerSaldo());
	//	cuenta2.depositar(1000);
	//	System.out.println("newSaldo:  " + cuenta2.obtenerSaldo());
		
	
	
	}



