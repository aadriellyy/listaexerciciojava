package listaDeExercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo23 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		String nome;
		int idade = 0;
		
		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		
		leia.close();

	}

}
