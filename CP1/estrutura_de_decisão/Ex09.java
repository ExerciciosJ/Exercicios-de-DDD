package estrutura_de_decis�o;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner (System.in)){
			double a, b;
			
			System.out.printf("Digite o primeiro valor: ");
			a = ler.nextDouble();
			
			System.out.printf("Digite o segundo valor: ");
			b = ler.nextDouble();
			
			if (a<b) {
				System.out.printf("O primeiro valor � menor que o segundo.");
			} else {
				System.out.printf("O segundo valor inserido � menor que o primeiro.");
			}
		}
	}
}
