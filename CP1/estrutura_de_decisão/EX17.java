package estrutura_de_decisão;

import java.util.Scanner;

public class EX17 {

	public static void main (String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			double a, b, imc;
			String c;
			
		 	System.out.printf("Digite a sua altura: ");
        	a = ler.nextDouble();
        	
        	System.out.print("Digite o seu peso: ");
        	b =ler.nextDouble();
        	
        	System.out.print("Digite o seu sexo: F para femenino e M para masculino: ");
        	c = ler.next();
        	c = c.toUpperCase();
        	
        	imc = b / (a*a);
        	
        	if (c.equals("F")) {
        		if (imc == 19 || imc > 19 && imc < 24) {
            		System.out.printf("Você está no peso ideal.");	
            	} else {
            		System.out.printf("Você não está no peso ideal.");
        	}} else {
        		if (imc == 20 || imc > 20 && imc < 25) {
            		System.out.printf("Você está no peso ideal.");	
            	} else {
            		System.out.printf("Você não está no peso ideal.");
        	}
        		
        	}
           }
		
}}

