package listaDeExercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo13 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		double numero1;
		double numero2;
		double numero3;
		double numero4;
		
		System.out.println("Entre com o primeiro número: ");
		numero1 = leia.nextDouble();
		
		System.out.println("Entre com o segundo número: ");
		numero2 = leia.nextDouble();
		
		System.out.println("Entre com o terceiro número: ");
		numero3 = leia.nextDouble();
		
		System.out.println("Entre com o quarto número: ");
		numero4 = leia.nextDouble();
		
		double media = ((numero1 * 1) + (numero2 *  2) + (numero3 * 3) + (numero4 * 4))/10;
		
		System.out.println("A média ponderada desses números é: " + media);
		
		
		leia.close();

	}

}
