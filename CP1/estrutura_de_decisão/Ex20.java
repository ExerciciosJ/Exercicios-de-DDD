package estrutura_de_decis�o;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner ler = new Scanner (System.in)){
			double p1, p2;
			
			System.out.printf("Digite a nota da sua P1: ");
        	p1 = ler.nextDouble();
        	p2 = (15 - p1)/2;
            System.out.printf("A nota necess�ria na P2 para ser aprovado � de: %.2f  ", p2);
        			
        	}
		}

	}