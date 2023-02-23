package segunda_unidad;

public class p3_16main2 {

	public static void main(String[] args) {
		
		p3_16 paciente1= new p3_16("Jorge", "Villalba", 10 , 9, 2000 );
		
		System.out.println ("--------------------------------");
		System.out.println ("         HOJA DE DATOS          ");
		System.out.println ("--------------------------------");
		System.out.println ("Paciente:           "+ paciente1.obtenerApellido() +" , "+paciente1.obtenerNombre());
		System.out.println ("Fecha Nacimiento:   "+ paciente1.obtenerDia()+" / "+paciente1.obtenerMes()+" / "+paciente1.obtenerAño() );
		System.out.println ("Edad:               "+ paciente1.obtenerEdad());
		System.out.println ("Frec cardiaca max:  "+ paciente1.obtenerMax());
		System.out.println ("Frec cardiaca esp:  " + paciente1.obtenerEsp1()+ " - "+ paciente1.obtenerEsp2());
		System.out.println ("                                ");
	}

}
