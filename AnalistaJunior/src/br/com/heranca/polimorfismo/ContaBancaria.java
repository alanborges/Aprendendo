package br.com.heranca.polimorfismo;

public class ContaBancaria {
	
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	
	// Construtores
	
	public ContaBancaria() { 	return;	}
	
	public ContaBancaria(String nomeCliente, String numConta, double saldo) {
		super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	
	}
	
	// metodo depositar
		
		public void depositar (double valorDepositado) {
		this.setNomeCliente(nomeCliente);
		this.setNumConta(numConta);
		this.setSaldo(saldo += valorDepositado);
			}  // , String nomeCliente, String numConta
	
		
		// metodo sacar
		// o cliente passa o valor; é comparado saldo da conta menos o valor faz valor é menor ou igual a zero; atualiza saldo 100 - valor 60 saldo 40. se nao false;
		
		
		
		public boolean sacar (double valor) {
			if((saldo - valor) >=  0   ) {
				saldo-=valor;
				return true;
				
				} else {
					
					return false;
				}
			}
		
		
		
		
		
		
		
		
		
		
	
	
	
	// primeiro gerou os getes e setes depois o ToString ara saber se estava imprimindo
	
	@Override
		public String toString() {
			return "ContaBancaria [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
		}
	
	
	
	
	

	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
