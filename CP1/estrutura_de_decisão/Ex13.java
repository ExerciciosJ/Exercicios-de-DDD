package estrutura_de_decisão;

import java.util.Scanner;

public class Ex13 {

	public static void main (String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			double a, b, c;
			
			System.out.printf("Digite o primeiro valor: ");
			a = ler.nextDouble();
			
			System.out.printf("Digite o segundo valor: ");
			b = ler.nextDouble();
			
			System.out.printf("Digite o terceiro valor: ");
			c = ler.nextDouble();
			
			if (a>b && a>c) {
				System.out.printf("O PRIMEIRO valor é o maior de todos.");
			} else if (b>a && b>c){
				System.out.printf("O SEGUNDO valor é o maior de todos.");
			} else {
				System.out.printf("O TERCEIRO valor é o maior de todos.");	
		}
	}
}
			
			
}
