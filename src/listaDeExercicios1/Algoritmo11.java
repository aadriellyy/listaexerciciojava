package listaDeExercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo11 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		double numero;
		
		System.out.println("Entre com um número: ");
		numero = leia.nextDouble();
		
		double divisao = numero/3;
		
		System.out.println("A terça parte desse número é: " + divisao);
		
		leia.close();
	
	}

}
