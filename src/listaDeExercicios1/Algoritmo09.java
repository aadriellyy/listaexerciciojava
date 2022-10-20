package listaDeExercicios1;

import java.util.Scanner;

public class Algoritmo09 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero1;
		int numero2;
		
		System.out.println("Informe o primeiro número: ");
		numero1 = leia.nextInt();
		
		System.out.println("Informe o segundo número: ");
		numero2 = leia.nextInt();
		
		int soma = numero1 + numero2;
		
		System.out.println("A soma entre os dois números é: " + soma);
		
		leia.close();

	}

}
