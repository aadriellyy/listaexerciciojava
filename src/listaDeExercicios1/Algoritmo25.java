package listaDeExercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo25 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		double volume;
		double raio;
		double altura;
		
		System.out.println("Informe o raio da circunferência da lata de óleo: ");
		raio = leia.nextDouble();
		
		System.out.println("Informe a altura da lata de óleo: ");
		altura = leia.nextDouble();
		
		volume = 3.14159 * ((raio*raio) * altura);
		System.out.println("O volume da lata de óleo é de: " + volume + " ml");
		
		
		leia.close();
		
	}

}
