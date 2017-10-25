package br.com.heranca.polimorfismo.imposto.renda;

public class ImpostoRendaPessoaFisica extends Contribuintes {
	
	
	
	private double rendaBruta;

	public double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}

	public ImpostoRendaPessoaFisica(String[] nome, String[] cpf, String pf, String pj, double rendaBruta, double salario) {
		super(nome, cpf, pf, pj, salario);
		this.rendaBruta = rendaBruta;
	}
	

	@Override
	public String toString() {
		return "ImpostoRendaPessoaFisica [rendaBruta=" + rendaBruta + "]";
	}

	public double calImpRenPf (double impostoRenda) {
		
		if(this.getSalario() > 0 && this.getSalario() >= 1400 ) {
			
			this.setSalario(this.getSalario());
			return impostoRenda;
		} else if (this.getSalario() > 1400 && this.getSalario() >= 2100 ) {
			impostoRenda=  ((this.getSalario() * 10) / 100 );
			impostoRenda-=100;
			return impostoRenda;
			
		} else if (this.getSalario() > 2101 && this.getSalario() >= 2800 ) {
			impostoRenda=  ((this.getSalario() * 15) / 100 );
			impostoRenda-=270;
			return impostoRenda;
			
		} else if (this.getSalario() > 2801 && this.getSalario() >= 3600 ) {
			impostoRenda=  ((this.getSalario() * 25) / 100 );
			impostoRenda-=500;
			return impostoRenda;
			
		} else if (this.getSalario() > 3601  ) {
			impostoRenda=  ((this.getSalario() * 30) / 100 );
			impostoRenda-=700;
			return impostoRenda;
			
		} 
				
		return impostoRenda;
		
	}
	
	
	
	
	
	
	
	
	
	

}
