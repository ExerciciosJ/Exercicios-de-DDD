package estrutura_repeticao;

import java.util.Scanner;

public class EX21D {
 
    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
       
        double num;
       
        do {
        	System.out.printf("Digite um número positivo: ");
        	num = ler.nextDouble();
        }
        while (num <= 0);
       
        System.out.printf("Isso aí!");
        
        }
}
}