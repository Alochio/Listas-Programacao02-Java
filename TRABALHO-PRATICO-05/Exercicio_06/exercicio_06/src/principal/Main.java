package principal;

public class Main {
	public static void main(String[] args){
//PESSOA
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Rafael");
		pessoa1.setIdade(20);
		System.out.println("----------------------------------------");
		System.out.println("Informa��es da pessoa\n" 
		+"nome: " + pessoa1.getNome() + "\nIdade: " + pessoa1.getIdade());
		System.out.println("----------------------------------------");

//RICA
		Rica r1 = new Rica();
		r1.setDinheiro(1000.50);
		r1.fazCompras(258.85);
		System.out.println("Valor em caixa: " + r1.getDinheiro());
		System.out.println("----------------------------------------");
		
//POBRE
		Pobre p1 = new Pobre();
		p1.trabalha("Com�rcio");
		System.out.println("----------------------------------------");
		
//MISER�VEL
		Miseravel m1 = new Miseravel();
		m1.mendiga();
		System.out.println("----------------------------------------");	
	}
}
