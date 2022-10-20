package listaDeExercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo17 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		double altura = 0;
		double base = 0;
		double perimetro = 0;
		double area = 0;
		double hipotenusa = 0;
		
		System.out.println("Entre com a altura do triângulo: ");
		altura = leia.nextDouble();
		
		System.out.println("Entre com a base do triângulo: ");
		base = leia.nextDouble();
		
		hipotenusa = Math.sqrt((base*base) + (altura*altura));
		
		perimetro = hipotenusa + base + altura;
		System.out.println("O perímetro do triângulo é: " + perimetro);
		
		area = (base*altura)/2;
		System.out.println("A área do triângulo é: " + area);
		
		System.out.println("A diagonal do triângulo é: " + hipotenusa);
		
		
		
		
		
		leia.close();

	}

}
