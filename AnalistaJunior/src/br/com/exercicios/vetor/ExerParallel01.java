package br.com.exercicios.vetor;

import java.util.Scanner;

public class ExerParallel01 {

	// Receber 5 notas e nomes e dizer qual é a maior. vetor
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	String [] nomes = new String[2];
	double [] notas = new double[nomes.length];
	double maior = Double.MIN_VALUE;
	
	
	for(int i=0; i<nomes.length; i++  ) {
		
		System.out.println("Digite seu nome:" );
		  nomes[i] =  scan.next();
		  
		  System.out.println("Digite seu nota:" );
		  notas[i] =  scan.nextDouble();
		  
	}
int j =0;
for(int i=j; i<nomes.length; i++ ) {
	
	if (notas[i] > maior  ) {
		maior = notas[i];
		
		}

}
System.out.println("Nome Aluno " + nomes[j]  );
System.out.println(" A maior nota é: " + maior );	


	
	
	}

}
