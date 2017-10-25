package br.com.heranca.polimorfismo.imposto.renda;

import java.util.Scanner;



public class TesteImpostoRenda {

	private static Scanner scan;
	
	public static void main(String[] args) {
		
	scan = new Scanner(System.in);
	
	
	System.out.println( "Seja Bem Vindo Calculadora imposto Renda!" );
	
	
	Contribuintes calculo = new Contribuintes();
	calculo.setNome(scan.nextLine());
		
		
	
		
System.out.println(" Digite nome ");
		

	}

}
private String[] nome;
private String[] cpf;
private String   pf;
private String   pj;
private double salario;