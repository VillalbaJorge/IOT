package segunda_unidad;

public class p3_17main {

	public static void main(String[] args) {
		p3_17 paciente1= new p3_17("Jorge", "Villalba", 10 , 9, 2000, 1.73, 65, "H");
		
		
		System.out.println ("--------------------------------");
		System.out.println ("         HOJA DE DATOS          ");
		System.out.println ("--------------------------------");
		System.out.println ("Paciente:           "+ paciente1.obtenerApellido() +" , "+paciente1.obtenerNombre());
		System.out.println ("Fecha Nacimiento:   "+ paciente1.obtenerDia()+" / "+paciente1.obtenerMes()+" / "+paciente1.obtenerAño() );
		System.out.println ("Edad:               "+ paciente1.obtenerEdad());
		System.out.println ("Peso:               "+ paciente1.obtenerPeso());
		System.out.println ("Altura:             "+ paciente1.obtenerAltura());
		System.out.println ("Sexo:               "+ paciente1.obtenerSexo());
		System.out.println ("Frec cardiaca max:  "+ paciente1.obtenerMax());
		System.out.println ("Frec cardiaca esp:  " + paciente1.obtenerEsp1()+ " - "+ paciente1.obtenerEsp2());
		System.out.println ("BMI:                "+ String.format("%.2f", paciente1.obtenerbmi()));
		System.out.println ("                                ");
		System.out.println("------------------------  ");
		System.out.println("                          ");
		System.out.println("     VALORES DEL BMI      ");
		System.out.println(" Bajo peso:   <18.5       ");
		System.out.println("    Normal:    18.5 - 24.9");
		System.out.println(" Sobrepeso:    25 - 29.9  ");
		System.out.println("     Obeso:   >30         ");
		System.out.println("                          ");
		System.out.println("------------------------  ");
		System.out.println("                          ");

	}

}
