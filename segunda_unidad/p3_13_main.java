package segunda_unidad;

public class p3_13_main {
	public static void main(String[] args) {
		
		
		
		p3_13 salario1= new p3_13("Elsa", "Capuntas", 15000.00);
		p3_13 salario2= new p3_13("Jorge", "Nitales", 17000.00);
		
		System.out.println ("Nombre:        "+ salario1.obtenerNombre()); 
		System.out.println ("Apellido:      " + salario1.obtenerApellido());
		System.out.println ("Salario:       " + salario1.obtenerSalario());
		System.out.println ("---------------" );
		System.out.println ("Anual:         " + salario1.obtenerSalario()* 12);
		System.out.println ("Porcentaje:    " + salario1.obtenerSalario()* 12* 0.1);
		double a = salario1.obtenerPorcentaje() + salario1.obtenerSalario()* 12 ;
		System.out.println ("Aumento:       " + a );
		
		System.out.println ("               " );
		System.out.println ("***************" );
		System.out.println ("               " );
		
		System.out.println ("Nombre:        "+ salario2.obtenerNombre()); 
		System.out.println ("Apellido:      " + salario2.obtenerApellido());
		System.out.println ("Salario:       " + salario2.obtenerSalario());
		System.out.println ("---------------" );
		System.out.println ("Anual:         " + salario2.obtenerSalario()* 12);
		System.out.println ("Porcentaje:    " + salario2.obtenerSalario()* 12* 0.1);
		double b = salario2.obtenerPorcentaje() + salario2.obtenerSalario()* 12 ;
		System.out.println ("Aumento:       " + b );
	}
	
}
