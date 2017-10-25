package br.com.heranca.polimorfismo.imposto.renda;

import java.util.Arrays;

public class Contribuintes {
	
	private String[] nome;
	private String[] cpf;
	private String   pf;
	private String   pj;
	private double salario;
	
	
	
	
	public String[] getNome() {
		return nome;
	}
	public void setNome(String[] nome) {
		this.nome = nome;
	}
	public String[] getCpf() {
		return cpf;
	}
	public void setCpf(String[] cpf) {
		this.cpf = cpf;
	}
	public String getPf() {
		return pf;
	}
	public void setPf(String pf) {
		this.pf = pf;
	}
	public String getPj() {
		return pj;
	}
	public void setPj(String pj) {
		this.pj = pj;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
		
	
	public Contribuintes(String[] nome, String[] cpf, String pf, String pj, double salario   ) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.pf = pf;
		this.pj = pj;
		this.salario = salario;
	}
	
	
	public Contribuintes(String[] nome2, String[] cpf2, String pf2, String pj2) { return;}
	public Contribuintes() {
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Contribuintes [nome=" + Arrays.toString(nome) + ", cpf=" + Arrays.toString(cpf) + ", pf=" + pf + ", pj="
				+ pj + ", salario=" + salario + "]";
	}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
