package principal;

public class VIP extends Ingresso{
	
	private double valorAdicional = 5.00;

	public double valorIngressoVIP(){
		return valorIngresso() + valorAdicional;
	}
}