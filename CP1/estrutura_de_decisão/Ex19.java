package estrutura_de_decisão;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner ler = new Scanner (System.in)){
			double p1, p2, m;
			
			System.out.printf("Digite a nota da sua P1: ");
        	p1 = ler.nextDouble();
        	
        	System.out.print("Digite a nota do seu P2: ");
        	p2 =ler.nextDouble();
        	
        	m = (p1 + (2*p2))/3;
        			
        	if (m == 5 || m > 5) {
        		System.out.printf ("APROVADO!");
        	} else {
        		System.out.printf("REPROVADO!");
        	}
		}

	}

}
