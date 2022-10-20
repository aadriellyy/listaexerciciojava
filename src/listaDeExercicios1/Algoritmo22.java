package listaDeExercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo22 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		double D = 0;
		double d = 0;
		double area = 0; 
		
		System.out.println("Informe a diagonal maior: ");
		D = leia.nextDouble();
		
		System.out.println("Informe a diagonal menor: ");
		d = leia.nextDouble();
		
		area = (D*d)/2;
		System.out.println("A área do Losango é: " + area);
		
		leia.close();
		

	}

}
