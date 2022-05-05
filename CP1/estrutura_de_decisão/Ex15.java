package estrutura_de_decisão;

import java.util.Scanner;

public class Ex15 {

	public static void main (String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			double a, b, c;
			
			System.out.printf("Digite o primeiro valor: ");
			a = ler.nextDouble();
			
			System.out.printf("Digite o segundo valor: ");
			b = ler.nextDouble();
			
			System.out.printf("Digite o terceiro valor: ");
			c = ler.nextDouble();
			
			if ((a + b > c) && (b + c > a) && (c + a > b)) {
			   if (a != b && b != c && c != a){
				System.out.printf("Esse é um triângulo escaleno");
			   } else if ((a == b && c != a) || (a == c && b != a) || (b == c && a != c)) {
				System.out.printf("Esse é um triângulo isósceles");
			   } else { 
				   System.out.printf("Esse é um triângulo equilatero. ");
			   }
		    } else { 
			System.out.printf("Ele não é um triângulo.");
		    }
         }
      }
   }