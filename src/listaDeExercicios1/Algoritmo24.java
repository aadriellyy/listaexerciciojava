package listaDeExercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo24 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		double celsius = 0;
		double fhrt = 0;
		
		System.out.println("Informe a temperatura em graus Celsius: ");
		celsius = leia.nextDouble();
		
		fhrt = (celsius*1.8) + 32;
		System.out.println("A temperatura em Fahrenheit é: " + fhrt);
		
		leia.close();
		

	}

}
