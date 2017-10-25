package br.com.heranca.polimorfismo.imposto.renda;

public class ImpostoRendaPessoaJuridica extends Contribuintes {

	
	
	private double rendaBruta;

	public double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}

	public ImpostoRendaPessoaJuridica(String[] nome, String[] cpf, String pf, String pj, double rendaBruta, double salario) {
		super(nome, cpf, pf, pj, salario);
		this.rendaBruta = rendaBruta;
	}
	
	public void dImpostoRendaPessoaJuridica() { return;}

	@Override
	public String toString() {
		return "ImpostoRendaPessoaJuridica [rendaBruta=" + rendaBruta + "]";
	}
	
	
	public double calImpRenPj (double impostoRenda  ) {
		
		impostoRenda = ( (this.rendaBruta * 10) / 100);
		return impostoRenda ;
		
		
	}
	
	
	
	
	
}
