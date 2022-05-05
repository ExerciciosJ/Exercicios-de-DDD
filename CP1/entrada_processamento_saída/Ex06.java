package entrada_processamento_saída;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)){
		
		double a, b, conversor;
		
		System.out.printf("Digite o valor da cotação do dólar: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite a sua quantidade de dólares: ");
		b = ler.nextDouble();
		
		conversor = a * b;
		
		System.out.printf("Você têm %.2f reais brasileiros ", conversor);
		}
	}
}
