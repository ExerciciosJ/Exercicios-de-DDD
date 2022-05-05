package estrutura_repeticao;

import java.util.Scanner;

public class EX22W {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner ler = new Scanner(System.in)) {
		
		double a, b;
		
		System.out.printf("Digite um número: ");
        a = ler.nextDouble();
        
        System.out.printf("Digite outro número: "); 	 	
        b = ler.nextDouble();
        
        while (b<=a) {
        	System.out.printf("Não foi dessa vez! Precisamos que o segundo número que seja maior que o primeiro digitado: ");
        	b = ler.nextDouble();
        }
		
        System.out.printf("Agora você acertou!");
        
		}
	}
}
