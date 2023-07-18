package aplicacao;

import java.util.Scanner;
import entidades.Retangulo;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Retangulo retangulo = new Retangulo();
		System.out.print("Por favor preencha as informações do retangulo\nAltura: ");
		retangulo.altura = sc.nextDouble();
		System.out.print("Largura: ");
		retangulo.largura = sc.nextDouble();
		System.out.print("Area: " + String.format("%.2f", retangulo.area()) + 
				"\nPerimetro: " + String.format("%.2f", retangulo.perimetro()) + 
				"\nDiagonal: " + String.format("%.2f", retangulo.diagonal()));
		sc.close();
	}
}
