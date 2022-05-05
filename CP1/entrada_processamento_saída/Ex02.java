package entrada_processamento_saída;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			int a, multiplicação;
			
			System.out.printf("Digite a medida da aresta do quadrado: ");
			a = ler.nextInt();
			
			multiplicação = a * a;
			
			//System.out.printf("A área do quadrado é: %d", multiplicação);
			
			System.out.printf("A área do quadrado é: %d * %d = %d\n", a, a, multiplicação);
		}
	}

}