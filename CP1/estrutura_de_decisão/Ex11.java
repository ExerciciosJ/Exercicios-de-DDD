package estrutura_de_decisão;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			double a, b, area;
			
			System.out.printf("Digite a base do seu retângulo: ");
			a = ler.nextDouble();
			
			System.out.printf("Digite a altura do seu retângulo: ");
			b = ler.nextDouble();
			
			area = a * b;
		    
			if (area>100) {
				 System.out.printf("Terreno grande.");
			}
		    
		}
	}
		
}