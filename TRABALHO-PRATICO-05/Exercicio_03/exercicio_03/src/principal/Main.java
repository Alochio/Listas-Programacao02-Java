package principal;

public class Main {
	public static void main(String[] args){
		
		
		Restaurante r1 = new Restaurante("Retaurante", "Rua tal", "Jo�o Monlevade",
				"Minas Gerais", "123456", "31999878747");
		
		System.out.println("Informa��es do Restaurante: \n");
		
		r1.printNome();
		r1.printEndereco();
		r1.printCidade();
		r1.printEstado();
		r1.printCep();
		r1.printTelefone();
		
		System.out.println("-------------------------------------------------");
		System.out.println("Informa��es do restaurante: \n");
		
		r1.setTipoDeComida("Massas");
		r1.setPrecoMedio(12.55);
		
		r1.printTipoDeComida();
		r1.printPrecoMedio();
		
		
		System.out.println("-------------------------------------------------");
	}

}
