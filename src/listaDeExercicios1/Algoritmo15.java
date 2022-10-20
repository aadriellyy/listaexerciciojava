package listaDeExercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo15 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		double salarioMin = 0;
		int quilowatts = 0;
		double custo = 0;
		double valorQlw = 0;
		double valorFinal = 0;
		double desconto = 0;
		double novoValor = 0;
	
		System.out.println("Informe o salário  mínimo: ");
		salarioMin = leia.nextDouble();
		
		System.out.println("Informe a quantidade de quilowatts: ");
		quilowatts = leia.nextInt();
		
		custo = salarioMin/7;
		
		System.out.printf("%.2f %n",(custo));
		
		valorQlw = custo/100;
		
		System.out.printf("Valor em reais de cada Quilowatts: %.2f %n", (valorQlw));
		
		valorFinal = quilowatts * valorQlw;
		
		System.out.printf("valor em reais a ser pago: %.2f %n", (valorFinal));
		
		desconto = (valorFinal*10)/100;
		novoValor = valorFinal - desconto; 
		
		System.out.printf("O novo valor a ser pago, após deconto de, é de: %.2f %n", novoValor);
		
		leia.close();
		

	}

}
