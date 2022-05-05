package estrutura_de_decisão;

import java.util.Scanner;

public class Ex14 {

	public static void main (String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
        	double a, b, imc;
        	
        	System.out.printf("Digite a sua altura: ");
        	a = ler.nextDouble();
        	
        	System.out.print("Digite o seu peso: ");
        	b =ler.nextDouble();
        	
        	imc = b / (a*a);		
        	
        	if (imc == 19 || imc > 19 && imc < 25) {
        		System.out.printf("Você está no peso ideal.");	
        	} else {
        		System.out.printf("Você não está no peso ideal.");
        	}
        }
	}

}
