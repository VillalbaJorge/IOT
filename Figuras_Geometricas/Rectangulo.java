package Figuras_Geometricas;

public class Rectangulo {
	private int a;
	private int b;
	private int perimetro;
	private int area;
	
    Rectangulo (int a, int b) {
	this.a=a;
	this.b=b;


	
	  if (a<0) {
		  System.out.println("numero invalido");
			this.a=1;}
	        
      if (b<0) {
    	  System.out.println("numero invalido");
		    this.b=1;}
      
      perimetro= a+b;
      area= (a*b);
      
}
public void asignarA(int A) {
	this.a = A;}
  public int obtenerA() {
	return this.a ;}
  
public void asignarB(int B) {
    this.b = B;}
  public int obtenerB() {
	return this.b ;}
  
  public double getPerimetro() {
	  System.out.print("Perimetro:   ");
	return perimetro;
}
public double getArea() {
	  System.out.print("Area:        ");
	return area;
}
public boolean isCuadrado() {
	return(a == b);
}
}

