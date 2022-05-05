package classe_atributo;

public class Projeto {
	public static void main(String [] args) {
		Pessoa [] listaPessoas = new Pessoa[10];
		
		Pessoa a = new Pessoa();
		a.id = 1;
		a.nome = "Ana";
		listaPessoas [0] = a;
		
		Pessoa b = new Pessoa();
		b.id = 2;
		b.nome = "Valentina";
		listaPessoas [1] = b;
		
		Pessoa c = new Pessoa();
		c.id = 2;
		c.nome = "Alan";
		listaPessoas [2] = c;
		
		Pessoa d = new Pessoa();
		d.id = 3;
		d.nome = "Ian";
		listaPessoas [3] = d;
		
		System.out.printf("Pessoa %d criada com sucesso: %s!", listaPessoas [0].id, listaPessoas [0].nome);
		System.out.printf("\nPessoa %d criada com sucesso: %s!", listaPessoas [1].id, listaPessoas [1].nome);
		System.out.printf("\nPessoa %d criada com sucesso: %s!", listaPessoas [2].id, listaPessoas [2].nome);
		System.out.printf("\nPessoa %d criada com sucesso: %s!", listaPessoas [3].id, listaPessoas [3].nome);
	}

}
