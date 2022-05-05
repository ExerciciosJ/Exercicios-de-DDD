package estrutura_de_decis�o;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			double a, vi, t, v, vf;
			
			System.out.printf("Digite o valor da acelera��o (em m/s�): ");
			a = ler.nextDouble();
			
			System.out.printf("Digite o valor da velocidade inicial (caso o autom�vel esteja em repouso, a velocidade inicial ser� zero): ");
			vi = ler.nextDouble();
			
			System.out.printf("Digite o tempo de percurso (em segundos): ");
			t = ler.nextDouble();
			
			v = vi + (a*t);
			
			vf = v * 3.6;
			
			if(vf == 40 || vf < 40) {
				System.out.printf("Ve�culo muito lento.");
			} else if (vf > 40 && vf < 60 || vf == 60){	
				System.out.printf("Velocidade permitida.");
			} else if (vf > 60 && vf < 80 || vf == 80){	
				System.out.printf("Velocidade de cruzeiro.");
			} else if (vf > 80 && vf < 120 || vf == 120){
				System.out.printf("Ve�culo r�pido.");	
			} else {
				System.out.printf("Ve�culo muito r�pido."); 
				}
			}
		}
	}
