package br.com.pratica;



public class ContaCorrente {

	private String numero;
	private String agencia;
	private boolean especial;
	private double limiteEspecial;
	private double saldo;
	
	// metodos construtores e sobrecarga de metodos
	
	
	public ContaCorrente() {
		
	}
	
	
	public ContaCorrente(String numero, String agencia, boolean especial, double limiteEspecial, double saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.especial = especial;
		this.limiteEspecial = limiteEspecial;
		this.saldo = saldo;
	}

boolean realizarSaque(double quantiaASacar) {
		
		if( quantiaASacar >= saldo) {
			saldo -= quantiaASacar;
			return true;  
			
		} else { //n�o tem saldo na conta
		} if (especial) {
                //verificar se o limite especial tem saldo
                double limite = limiteEspecial + saldo;
		if (limite >= quantiaASacar){
                    saldo -= quantiaASacar;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false; //n�o � especial e n�o tem saldo suficiente
            }
        }    

		
		
void depositar (double valorDepositado) {
			
			saldo+=valorDepositado;
			
				
		}
	
	
	
	void consultarSaldo() {
			
			 System.out.println("Saldo atual da conta = " + saldo); 
			
			
		}
		
		 boolean verificarUsoChequeEspecial(){
		        return saldo < 0;
		}	
		
		
		
		
		

		
		
		
		
	














	// encapsulamento

	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public boolean isEspecial() {
		return especial;
	}
	public void setEspecial(boolean especial) {
		this.especial = especial;
	}
	public double getLimiteEspecial() {
		return limiteEspecial;
	}
	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
	
	
}

