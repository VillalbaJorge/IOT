package unidad9;

public class ejercicio99y913 {

	// 9.9(¿Qué hace cada fragmento de código?
	
	// a) Suponga que la siguiente llamada a método se encuentra en un método ingresos sobrescrito 
	// en una subclase: 
	
	// super.ingresos() 
	
	// La llamada a super.ingresos() dentro de un método llamado ingresos en una subclase indica 
	// que se está llamando al método ingresos definido en la superclase (la clase de la que se 
	// hereda). La llamada a super.ingresos() ejecutará el método ingresos definido en la 
	// superclase en lugar del método ingresos definido en la subclase. Esto puede ser útil si se 
	// quiere extender el comportamiento del método ingresos en la subclase, sin reemplazar 
	// completamente su funcionalidad
	
	// b) Suponga que la siguiente línea de código aparece antes de la declaración de un método: 
	
	// @Override
	
	// La línea de código @Override indica que el método que sigue inmediatamente es una 
	// anulación de un método en la superclase. Si el método que sigue no anula efectivamente 
	// un método en la superclase, se producirá un error de compilación. Esta anotación es 
	// opcional, pero es una buena práctica de programación incluirla para que el código sea más 
	// legible y fácil de mantener.
	
	// c) Suponga que aparece la siguiente línea de código como la primera instrucción en el 
	// cuerpo de un constructor: 
		
	// super(primerArgumento, segundoArgumento);
	
	// La llamada super(primerArgumento, segundoArgumento) se utiliza en el constructor de 
	// una subclase para llamar al constructor de la superclase correspondiente. Esto asegura 
	// que los miembros heredados de la superclase sean inicializados antes de que se inicialicen 
	// los miembros específicos de la subclase. La llamada a super() debe ser la primera 
	// instrucción en el cuerpo del constructor de la subclase. Si no se llama explícitamente a 
	// super(), se llamará automáticamente al constructor sin argumentos de la superclase.
	
	// 9.13  (Llamar métodos obtener en el cuerpo de una clase) En las figuras 9.10 y 9.11, los 
	// métodos ingresos y toString llaman a varios métodos obtener dentro de la misma clase. 
	// Explique los beneficios de llamar a estos métodos obtener dentro de las clases.
	
	// Llamar a métodos obtener dentro de la misma clase en los métodos ingresos y toString de 
	// las figuras 9.10 y 9.11, es una buena práctica de programación porque ayuda a simplificar 
	// el código y lo hace más legible y mantenible.

	// En lugar de repetir el mismo código para obtener valores de los atributos de la clase cada 
	// vez que se necesitan, los métodos obtener pueden ser llamados para obtener los valores 
	// de los atributos. Esto ayuda a reducir la redundancia de código y aumenta la legibilidad 
	// del código.

	// Además, si se cambia la forma en que se obtienen los valores de los atributos, por 
	// ejemplo, si se cambia el nombre de un atributo o se modifica la forma en que se calcula su 
	// valor, sólo se tiene que hacer el cambio en el método obtener correspondiente en lugar 
	// de tener que modificar cada método que llama directamente al atributo.

	// En resumen, llamar a métodos obtener dentro de la misma clase ayuda a simplificar el 
	// código, lo hace más legible y mantenible, y hace que sea más fácil realizar cambios en la 
	// forma en que se obtienen los valores de los atributos.
	
}
