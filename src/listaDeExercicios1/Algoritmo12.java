package listaDeExercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo12 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		double numero1;
		double numero2;
		
		System.out.println("Entre com o primeiro número: ");
		numero1 = leia.nextDouble();
		
		System.out.println("Entre com o segundo número: ");
		numero2 = leia.nextDouble();
		
		double media = (numero1 + numero2)/2;
		
		System.out.println("A média aritmética é: " + media);
		
		leia.close();

	}

}
