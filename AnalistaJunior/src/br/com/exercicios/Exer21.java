package br.com.exercicios;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double alunos=0;
		boolean invalido = true;
		double media = 0;
		double soma=0;
		double turmas=0;
			
		System.out.println("Informe a quantidade de Turmas");
			turmas = scan.nextDouble();
							
		for(int i=0; i<turmas;i++    ) {
			
			invalido = true;
			do {
				
				System.out.println("Informe a quantidade de Alunos " + i );
				alunos = scan.nextDouble();
								
				if(alunos <=40) {
				invalido = false;
			}else {
				System.out.println("Digite a quantidade de alunos entre 0 e 40 " );
		
			}
				
						
				
		
		
		
		
		}while(invalido);
			soma=soma+alunos;
	
		}
		
		media=soma/turmas;
		System.out.println("Soma dos alunos " +soma);
		System.out.println("Média de alunos por turma " + media);		
		
	}

}
