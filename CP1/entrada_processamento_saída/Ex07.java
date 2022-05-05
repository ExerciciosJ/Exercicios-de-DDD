package entrada_processamento_saída;

import java.util.Scanner;

public class Ex07 {
	
	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)){
		double a, b, c, d, soma, pagamento, troco;
		
		System.out.printf("Digite o valor do seu primeiro produto: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o valor do seu segundo produto: ");
		b = ler.nextDouble();
		
		System.out.printf("Digite o valor do seu terceiro produto: ");
		c = ler.nextDouble();
		
		System.out.printf("Digite o valor do seu quarto produto: ");
		d = ler.nextDouble();
		
		System.out.printf("Digite o valor do seu quinto produto: ");
		soma = a + b + c + d;
		
		System.out.printf("A sua compra resultou em: R$ %.2f  ", soma);
		
		System.out.printf("\nDigite o valor pago: ");
		pagamento = ler.nextDouble();
		
		troco = pagamento - soma;
		
		System.out.printf("O seu troco Ã© de: R$ %.2f  ", troco);
		}
	}

}

