package estrutura_de_decis�o;

import java.util.Scanner;

public class Ex16 {

	public static void main (String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			double a, b, c;
			
			System.out.printf("Digite o valor do lado a: ");
			a = ler.nextDouble();
			
			System.out.printf("Digite o valor do lado b: ");
			b = ler.nextDouble();
			
			System.out.printf("Digite o valor do lado c: ");
			c = ler.nextDouble();
			
			if ((c*c) == (a*a) + (b*b) || (a*a) == (c*c) + (b*b) || (b*b) == (c*c) + (a*a)) {
        		System.out.printf("Esse � um tri�ngulo ret�ngulo");	
        	} else {
        		System.out.printf("Ele n�o � um tri�ngulo ret�ngulo.");
        	}
        }
	}

}