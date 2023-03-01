package Figuras_Geometricas;

public class Circulo {
		
		private int radio;
		private double perimetro;
		private double area;
		
	    Circulo (int radio) {
		this.radio=radio;
		
		  if (radio<0) {
			  System.out.println("numero invalido");
				this.radio=1;}
	      
	      perimetro = 2*Math.PI*radio;
	      area= Math.PI* (radio*radio);
	}
public void asignarRadio(int Radio) {
	this.radio = Radio;}
public int obtenerRadio() {
	    	return this.radio ;}

public double getPerimetro() {
	  System.out.print("Perimetro:   ");
	return perimetro;
}
public double getArea() {
	  System.out.print("Area:        ");
	return area;
}
}
	      
