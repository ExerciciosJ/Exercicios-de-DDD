package entrada_processamento_sa�da;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			int a, b, area;
			
			System.out.printf("Digite a base do seu ret�ngulo: ");
			a = ler.nextInt();
			
			System.out.printf("Digite a altura do seu ret�ngulo: ");
			b = ler.nextInt();
			
			area = a * b;
		
		    System.out.printf("A �rea do tri�ngulo �: %d", area);
		}
	}
		
}
