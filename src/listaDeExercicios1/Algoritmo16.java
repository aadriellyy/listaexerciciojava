package listaDeExercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo16 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
	
		String nome;
		System.out.println("Informe um nome: ");
		nome = leia.nextLine();
		
		System.out.println("O primeiro caractere do nome é: " + nome.charAt(0));
		
		char lastChar = nome.charAt(nome.length() - 1);
		System.out.println("A última letra do nome é: " + lastChar);
		
		String tresPrimeiros = nome.substring(0,3);
		System.out.println("O primeiro até o terceiro caractere é: " + tresPrimeiros);
		
		String quartoCaractere = nome.substring(1);
		System.out.println("O quarto caracter é: " + quartoCaractere);
		
		String doisUltimos = nome.substring(5);
		System.out.println("Os dois últimos caracteres são: " + doisUltimos);
		

		leia.close();
		

	}

}
