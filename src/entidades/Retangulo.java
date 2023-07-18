package entidades;

public class Retangulo {
	
	public double altura, largura;
	
	public double area() { return altura*largura; }
	
	public double perimetro() {	return 2*(altura+largura); }
	
	public double diagonal() { return Math.sqrt((Math.pow(largura, 2)+Math.pow(altura, 2))); }
}
