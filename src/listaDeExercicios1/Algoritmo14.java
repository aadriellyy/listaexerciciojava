package listaDeExercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo14 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		double saldo;
		
		System.out.println("Informe o saldo da aplicação: ");
		saldo = leia.nextDouble();
		
		double reajuste = (saldo/100) + saldo;
		
		System.out.println("O novo saldo após o reajuste é de: " + reajuste);
		
		
		leia.close();

	}

}
