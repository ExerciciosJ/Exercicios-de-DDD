package entrada_processamento_sa�da;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)){
		
		double a, b, conversor;
		
		System.out.printf("Digite o valor da cota��o do d�lar: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite a sua quantidade de d�lares: ");
		b = ler.nextDouble();
		
		conversor = a * b;
		
		System.out.printf("Voc� t�m %.2f reais brasileiros ", conversor);
		}
	}
}
