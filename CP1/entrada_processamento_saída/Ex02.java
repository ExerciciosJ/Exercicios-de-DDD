package entrada_processamento_sa�da;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			int a, multiplica��o;
			
			System.out.printf("Digite a medida da aresta do quadrado: ");
			a = ler.nextInt();
			
			multiplica��o = a * a;
			
			//System.out.printf("A �rea do quadrado �: %d", multiplica��o);
			
			System.out.printf("A �rea do quadrado �: %d * %d = %d\n", a, a, multiplica��o);
		}
	}

}