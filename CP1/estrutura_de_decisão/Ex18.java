package estrutura_de_decisão;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			double a, vi, t, v, vf;
			
			System.out.printf("Digite o valor da aceleração (em m/s²): ");
			a = ler.nextDouble();
			
			System.out.printf("Digite o valor da velocidade inicial (caso o automóvel esteja em repouso, a velocidade inicial será zero): ");
			vi = ler.nextDouble();
			
			System.out.printf("Digite o tempo de percurso (em segundos): ");
			t = ler.nextDouble();
			
			v = vi + (a*t);
			
			vf = v * 3.6;
			
			if(vf == 40 || vf < 40) {
				System.out.printf("Veículo muito lento.");
			} else if (vf > 40 && vf < 60 || vf == 60){	
				System.out.printf("Velocidade permitida.");
			} else if (vf > 60 && vf < 80 || vf == 80){	
				System.out.printf("Velocidade de cruzeiro.");
			} else if (vf > 80 && vf < 120 || vf == 120){
				System.out.printf("Veículo rápido.");	
			} else {
				System.out.printf("Veículo muito rápido."); 
				}
			}
		}
	}
