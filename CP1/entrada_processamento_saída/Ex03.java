package entrada_processamento_saída;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)){
		    int a, b, area;
		
		    System.out.printf("Digite a base do seu triângulo: ");
		    a = ler.nextInt();
		
		    System.out.printf("Digite a altura do triângulo: ");
		    b = ler.nextInt();
		
		    area = (a * b)/2;
		
		    System.out.printf("A área do triângulo é: %d", area);
		}
	}
	
}
