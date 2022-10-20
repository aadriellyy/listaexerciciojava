package listaDeExercicios1;

import java.util.Scanner;

public class Algoritmo07 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Entre com um número: ");
		numero = leia.nextInt();
		
		int antecessor = numero - 1;
		int sucessor = numero + 1;
		
		System.out.println("O antecessor desse número é: " + antecessor);
		System.out.println("O sucessor desse número é: " + sucessor);
		
		leia.close();
	}

}
