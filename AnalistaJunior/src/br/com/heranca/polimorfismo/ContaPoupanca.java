package br.com.heranca.polimorfismo;

import java.util.Calendar;


public class ContaPoupanca extends ContaBancaria {
	
	private int diaRendimento;
	
	
	
	// encapsulamento get e set
	
	public int getDiaRendimento() {
		return diaRendimento ;
	}
	
	
	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

// Construtores
	public ContaPoupanca(int diaRendimento) {
		super();
		this.diaRendimento = diaRendimento;
	}
	
	
	public ContaPoupanca() {
		return;
	}

// metodo toString
	
	@Override
	public String toString() {
		return "ContaPoupanca [diaRendimento=" + diaRendimento + "]";
	}
	
	
	
	// metodo calcular novo saldo 
	public boolean calcularNovoSaldo(double taxaRendimento) {
		
		Calendar hoje = Calendar.getInstance();
		
		if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
			//saldo += saldo * taxaRendimento;
		
		this.setSaldo(this.getSaldo() + (this.getSaldo()  * taxaRendimento ));
		
		return true;
		
		} 
		
		return false;
		
	
	}
	

	
	
}
