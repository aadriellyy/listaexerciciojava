package listaDeExercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo19 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		double lado = 0;
		double perimetro = 0;
		double diagonal = 0;
		double area = 0;
		
		System.out.println("Informe o lado do quadrado: ");
		lado = leia.nextInt();
		
		perimetro = lado * 4;
		System.out.println("O perímetro do quadrado é: " + perimetro);
		
		area = lado*lado;
		System.out.println("A área do quadrado é: " + area);
		
		diagonal = lado * Math.sqrt(2);
		System.out.println("A diagonal do quadrado é: " + diagonal);
		
		leia.close();

	}

}
