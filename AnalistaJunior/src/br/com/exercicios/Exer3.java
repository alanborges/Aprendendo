package br.com.exercicios;

import java.util.Scanner;

public class Exer3 {

	
	private static Scanner scan;
	
	public static void main(String[] args) {
	
		scan = new Scanner(System.in);
		
		
		String nome,  sexo;
		int idade=0;
		double sal=0;
	
		
		String estCivil ;
		
		boolean informacoesInvalidas = false;
		// Nome do usuario
		
		while(! informacoesInvalidas) {
		
			System.out.println("Digite seu nome!");
			 nome = scan.next();
			if(nome.length() > 3) {
				
				informacoesInvalidas =false;
				
				
			}else {
				System.out.println("nome inválido:");
				continue;  // para e volta para o inicio do laço // break; para e pula para outro laço
			}
			
			// Idade do usuario
			
		informacoesInvalidas = false;
		while(! informacoesInvalidas) {
			
			System.out.println("Digite sua idade!");
			idade = scan.nextInt();
			
			
			if((idade > 0) && (idade <= 150) ) {
				informacoesInvalidas =false;			
				
			}else {
				
				System.out.println("Idade incorreta: ");
				continue;
			}
			
			// Salário do usuário
			
			informacoesInvalidas = false;
			while(! informacoesInvalidas) {
				
				System.out.println("Digite seu salário!");
				sal = scan.nextDouble();
				if(sal > 0 ) {
					
					informacoesInvalidas =false;
					
					
				}else {
					System.out.println("salálio menor que 0");
					continue;
				}
		
				// Sexo do usuario
				
				informacoesInvalidas = false;
				while (!informacoesInvalidas) {
					
					System.out.println("Digite seu sexo");
					sexo = scan.next();
					
					
					if(sexo.equalsIgnoreCase("m")  || sexo.equalsIgnoreCase("f")  ) {
						informacoesInvalidas =true;
						
						
					}else {
						System.out.println("Digite M ou F");
						continue;
						
					}
					
					
					// Estado civil
					
					informacoesInvalidas = false;
					while (!informacoesInvalidas) {
						
						System.out.println("Digite seu estado civil!");
						estCivil = scan.next();
						
						
						if(estCivil.equalsIgnoreCase("s")  || estCivil.equalsIgnoreCase("c") ||
						estCivil.equalsIgnoreCase("v") || estCivil.equalsIgnoreCase("d") ) {
							
							informacoesInvalidas =true;
														
						}else {
							System.out.println("Digite S ou C ou V ou D");
							continue;
							
						}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
				}
			
			
				}
			
			
			
			
			
			}	
		}
			
		}	
		
		
		
		
		
		
	
		
		
	}

}
