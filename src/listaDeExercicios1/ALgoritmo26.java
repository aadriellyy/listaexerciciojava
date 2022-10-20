package listaDeExercicios1;

import java.util.Locale;
import java.util.Scanner;

public class ALgoritmo26 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		double valor = 0;
		double taxa = 0;
		int tempo = 0;
		double atraso = 0;
		
		System.out.println("Qual é o valor da prestação?");
		valor = leia.nextDouble();
		
		System.out.println("Qual é o valor da taxa imposta?");
		taxa = leia.nextDouble();
		
		System.out.println("Há quanto tempo a prestação está atrasada?");
		tempo = leia.nextInt();
		
		atraso = valor + (valor*(taxa/100)*tempo);
		System.out.println("O novo valor a ser pago, após o atraso, é de: " + atraso);
		
		
		
		leia.close();

	}

}
