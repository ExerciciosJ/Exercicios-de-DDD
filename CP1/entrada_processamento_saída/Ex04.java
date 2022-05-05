package entrada_processamento_saída;

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
		
		
		System.out.printf("A média aritmédica dos quatros números digitados é: %d", media);
		}
	}
}
