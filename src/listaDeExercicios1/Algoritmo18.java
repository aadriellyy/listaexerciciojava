package listaDeExercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo18 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		int raio = 0;
		double perimetro = 0;
		double pi = 3.14;
		double area = 0;
		
		System.out.println("Informe o raio do círculo: ");
		raio = leia.nextInt();
		
		perimetro = 2*(pi)*(raio);
		System.out.println("O perímetro do círculo é: " + perimetro);
		
		area = pi * (raio*raio);
		
		System.out.println("A área do círculo é: " + area);
		
		leia.close();

	}

}
