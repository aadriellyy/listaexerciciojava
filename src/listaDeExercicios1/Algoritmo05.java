package listaDeExercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		int numero;
		
		System.out.println("Informe um número inteiro: ");
		numero = sc.nextInt();
		
		System.out.println(numero);
		
		sc.close();

	}

}
