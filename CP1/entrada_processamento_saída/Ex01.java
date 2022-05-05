package entrada_processamento_saída;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			int a, b, area;
			
			System.out.printf("Digite a base do seu retângulo: ");
			a = ler.nextInt();
			
			System.out.printf("Digite a altura do seu retângulo: ");
			b = ler.nextInt();
			
			area = a * b;
		
		    System.out.printf("A área do triângulo é: %d", area);
		}
	}
		
}
