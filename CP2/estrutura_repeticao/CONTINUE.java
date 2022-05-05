package estrutura_repeticao;

import java.util.Scanner;

public class CONTINUE {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in)) {
			int num, t, i;
      
			System.out.printf("Digite um número positivo: ");
			num = ler.nextInt();
      
			while(num <= 0) {
			    System.out.printf("Erro, número negativo! Digite um número positivo: ");
			    num = ler.nextInt();
			}
      
			for (i=1; i<=10; i++) {
			    if (i == 8)
			        continue;
			   
			    t = num * i;
			    System.out.printf("\n%d X %d = %d", num, i, t);
			}
		}
	}
}
