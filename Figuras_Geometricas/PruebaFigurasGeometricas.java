package Figuras_Geometricas;

public class PruebaFigurasGeometricas {

	public static void main(String[] args) {
		
		Triangulo triangulo1= new Triangulo(5, 5, 5);
		System.out.println (" --------- TRIANGULO ---------");
		System.out.println ("Lados:       "+triangulo1.obtenerA()+"    "+triangulo1.obtenerB()+"    "+triangulo1.obtenerC() );
		System.out.println (String.format("%.2f",triangulo1.getArea()));
		System.out.println (String.format("%.2f",triangulo1.getPerimetro()));
		System.out.println (triangulo1.getTipo ("", "","" ));
		System.out.println(triangulo1.isRectangulo()?"Es cuadrado":"No es cuadrado");
		
		Circulo circulo1= new Circulo(4);
		System.out.println (" --------- CIRCULO  --------- ");
		System.out.println ("Radio:       "+circulo1.obtenerRadio() );
		System.out.println (String.format("%.2f",circulo1.getArea()));
		System.out.println (String.format("%.2f",circulo1.getPerimetro()));
		
		Rectangulo rectangulo1= new Rectangulo(4,4);
		System.out.println (" -------  RECTANGULO  ------- ");
		System.out.println ("Lados:       "+rectangulo1.obtenerA()+"    "+rectangulo1.obtenerB());
		System.out.println (String.format("%.2f",rectangulo1.getArea()));
		System.out.println (String.format("%.2f",rectangulo1.getPerimetro()));
		System.out.println(rectangulo1.isCuadrado()?"Es cuadrado":"Es rectangulo");
	}
	}

