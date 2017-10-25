package br.com.heranca.polimorfismo;

public class ContaEspecial extends ContaBancaria {

	
	private double limite;

	// Get e Set
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	
	// Construtor 
	
	public ContaEspecial(double limite) {
		super();
		this.limite = limite;
	}
	
	public ContaEspecial() {  return ;	}

	
	
	
	// toString
	
	
	@Override
	public String toString() {
		return "ContaEspecial [limite=" + limite + "]";
	}
	
	
	
	
	
	 public boolean sacar(double valor) {
		 
		 
		 double saldoComLimite = this.getSaldo() + limite;
		 
		 if( saldoComLimite >= 0   ) {
			 
			 this.setSaldo(this.getSaldo()-valor);
	            
	            //super.sacar(valor);
			 return true;
			 
		 }
		 
		 return false;
		 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
