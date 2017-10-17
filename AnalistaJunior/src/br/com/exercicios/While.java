package br.com.exercicios;

import java.util.Scanner;

public class While {

	private static Scanner scan;

	public static void main(String[] args) {
		
		
		scan = new Scanner(System.in);
		
		boolean notaInvalida=false;	
			
		while(! notaInvalida  ){
					
			System.out.println("Digite uma nota entre 1 e 60!");
			double nota = scan.nextDouble();
			
			
			if(nota > 0 && nota <= 60   ) {
				notaInvalida = true;
				System.out.println("Nota válida!!!");
			
			}else {
				
				System.out.println("Nota inválida Digite uma nova nota!");
				
			}
		
			
			
			
			
		}
		

	}

	
		
	}


