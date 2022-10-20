package listaDeExercicios1;

import java.util.Locale;
import java.util.Scanner;

public class Algoritmo20 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in).useLocale(Locale.US);
		
		double lA = 0;
		double lB = 0;
		double lC = 0;
		double diagonal = 0; 
		
		System.out.println("Informe o lado A: ");
		lA = leia.nextDouble();
		
		System.out.println("Informe o lado B: ");
		lB = leia.nextDouble();
		
		System.out.println("Informe o lado C: ");
		lC = leia.nextDouble();
		
		diagonal = Math.sqrt((lA*lA) + (lB*lB) + (lC+lC));
		System.out.println("A diagonal do paralelepípedo é: " + diagonal);
		
		
		leia.close();

	}

}
