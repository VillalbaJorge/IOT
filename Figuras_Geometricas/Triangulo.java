package Figuras_Geometricas;


//class DefectoTriangulo
//{
//	int x, y, z;
//	public:
//	DefectoTriangulo(); //Constructor por defecto
//	void printVars();
//};
public class Triangulo{
	
	private int a;
	private int b;
	private int c;
	private int perimetro;
	private int area;
	private boolean rectangulo;
	
    Triangulo (int a, int b, int c) {
	this.a=a;
	this.b=b;
	this.c=c;

	
	  if (a<0) {
		  System.out.println("numero invalido");
			this.a=1;}
	        
      if (b<0) {
    	  System.out.println("numero invalido");
		    this.b=1;}
      
      if (c<0) {
    	  System.out.println("numero invalido");
		    this.c=1;}
      
      perimetro= a+b+c;
      area= (a*b*c)/2;
      
}
public void asignarA(int A) {
	this.a = A;}
  public int obtenerA() {
	return this.a ;}
  
public void asignarB(int B) {
    this.b = B;}
  public int obtenerB() {
	return this.b ;}
  
public void asignarC(int C) {
	this.c = C;}
  public int obtenerC() {
	return this.c ;}

  public double getPerimetro() {
	  System.out.print("Perimetro:   ");
	return perimetro;
  }
  public double getArea() {
	  System.out.print("Area:        ");
	return area;
  }


public String getTipo(String equilatero, String isosceles, String escaleno) {

if(a==b && b==c) {
	System.out.print("Triangulo equilatero   ");

} else if(a==b || b==c || a==c) {
	System.out.print("Triangulo isoceles     ");
 
} else { //(a!=b && b!=c)
	System.out.print("Triangulo escaleno     ");
  
}
return escaleno; 
}

public boolean isRectangulo() {
	

	if (a > b && a > c) {
	if ( a*a == b*b + c*c ) {
		rectangulo = true;}}
	else if (b > a && b > c) {
	if ( b*b == a*a + c*c ) {
		rectangulo = true;}}
	else if (c> a && c > b) {
	if ( c*c == a*a + b*b ) {
		rectangulo = true;}
		
	
	
	
	
	
}
	return rectangulo;
}}