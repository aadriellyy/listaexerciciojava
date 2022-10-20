package listaDeExercicios1;

import java.util.Locale;
import java.util.Scanner;

public class ALgoritmo21 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);

		double base = 0;
		double altura = 0;
		double area = 0; 
		
		System.out.println("Informe a base do triângulo: ");
		base = leia.nextDouble();
		
		System.out.println("Informe a altura do triângulo: ");
		altura = leia.nextDouble();
		
		area = (base*altura)/2;
		System.out.println("A área do Triângulo é: " + area);
		
		leia.close();

	}

}
