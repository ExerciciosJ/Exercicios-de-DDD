package estrutura_repeticao;

import java.util.Scanner;

public class EX22W {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
				Scanner ler = new Scanner(System.in)) {
		
		double a, b;
		
		System.out.printf("Digite um n�mero: ");
        a = ler.nextDouble();
        
        System.out.printf("Digite outro n�mero: "); 	 	
        b = ler.nextDouble();
        
        while (b<=a) {
        	System.out.printf("N�o foi dessa vez! Precisamos que o segundo n�mero que seja maior que o primeiro digitado: ");
        	b = ler.nextDouble();
        }
		
        System.out.printf("Agora voc� acertou!");
        
		}
	}
}
