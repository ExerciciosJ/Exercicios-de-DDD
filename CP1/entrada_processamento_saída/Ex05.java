package entrada_processamento_saída;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)){
		double a, fahrenheit;
		
		System.out.printf("Digite a temperatura em Celsius: ");
		a = ler.nextDouble();
		
		fahrenheit = (a * 9/5) + 32;
		
        System.out.printf("A temperatura em fahrenheit é: %.1f", fahrenheit);
		}
	}
}