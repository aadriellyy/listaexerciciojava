package listaDeExercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		int numero1;
		int numero2;
		
		System.out.println("Informe um número inteiro: ");
		numero1 = sc.nextInt();
		
		System.out.println("Esse é o primeiro número: " +numero1);
		
		System.out.println("Informe outro número inteiro: ");
		numero2 = sc.nextInt();
		
		System.out.println("Esse é o segundo número: " + numero2);
		
		sc.close();

	}

}
