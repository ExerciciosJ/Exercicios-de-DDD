package entrada_processamento_sa�da;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)){
		double a, b, c, d, media;
			
		System.out.printf("Digite o primeiro valor: ");
		a = ler.nextDouble();
			
		System.out.printf("Digite o segundo valor: ");			
		b = ler.nextDouble();
			
		System.out.printf("Digite o terceiro valor: ");
		c = ler.nextDouble();
			
		System.out.printf("Digite o quarto valor: ");
		d = ler.nextDouble();
			
		media = (a + b + c + d)/4;
		
		
		System.out.printf("A m�dia aritm�dica dos quatros n�meros digitados �: %d", media);
		}
	}
}
