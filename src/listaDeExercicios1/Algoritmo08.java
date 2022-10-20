package listaDeExercicios1;

import java.util.Scanner;

public class Algoritmo08 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		String endereco;
		String telefone;
		
		System.out.println("Informe o seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Informe o seu endereço: ");
		endereco = leia.nextLine();
		
		System.out.println("Por último, informe o seu telefone: ");
		telefone = leia.nextLine();
		
		System.out.println("Seu nome é: " + nome + "\nSeu endereço é: " + endereco + "\nSeu telefone é: " + telefone);
		
		leia.close();

	}

}
