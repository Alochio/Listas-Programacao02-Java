package principal;

public class Animal {
	
	private String nome;
	private String raca;
	
//---------------------------------------------------------------------------
//METODOS GET AND SET
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getRaca(){
		return  this.raca;
	}
	public void setRaca(String raca){
		this.raca = raca;
	}
	
//---------------------------------------------------------------------------
//CONSTRUTORES: 
	
	public Animal(){
		
	}
	
	public Animal(String nome){
		this.nome = nome;
	}

//---------------------------------------------------------------------------
//M�TODO CAMINHA
	
	public void Caminha(){
		System.out.println("O " + nome + " Caminhou");
	}
	
//---------------------------------------------------------------------------
}
