package estrutura_de_decis�o;

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
				System.out.printf("Esse � um tri�ngulo escaleno");
			   } else if ((a == b && c != a) || (a == c && b != a) || (b == c && a != c)) {
				System.out.printf("Esse � um tri�ngulo is�sceles");
			   } else { 
				   System.out.printf("Esse � um tri�ngulo equilatero. ");
			   }
		    } else { 
			System.out.printf("Ele n�o � um tri�ngulo.");
		    }
         }
      }
   }