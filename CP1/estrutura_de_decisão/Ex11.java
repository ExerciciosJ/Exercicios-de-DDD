package estrutura_de_decis�o;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			double a, b, area;
			
			System.out.printf("Digite a base do seu ret�ngulo: ");
			a = ler.nextDouble();
			
			System.out.printf("Digite a altura do seu ret�ngulo: ");
			b = ler.nextDouble();
			
			area = a * b;
		    
			if (area>100) {
				 System.out.printf("Terreno grande.");
			}
		    
		}
	}
		
}