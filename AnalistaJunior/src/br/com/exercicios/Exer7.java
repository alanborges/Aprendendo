package br.com.exercicios;

import java.util.Scanner;

public class Exer7 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
	
		/*
		System.out.println("Digite o primeiro número:");
		int pri = scan.nextInt();
		System.out.println("Digite o segundo número:");
		int seg = scan.nextInt();
		System.out.println("Digite o terceiro número:");
		int ter = scan.nextInt();
		System.out.println("Digite o quarto número:");
		int qua = scan.nextInt();
		System.out.println("Digite o quinto número:");
		int qui = scan.nextInt();
		
		if(pri > seg && pri > ter && pri > qua && pri > qui   ) {
			System.out.println("O primeiro é o maior");
		}else if ( seg > pri && seg > ter  && seg > qua && seg > qui    ) {
			System.out.println("O segundo é o maior");
		}else if (ter > pri && ter > seg && ter > qua && ter > qui  ) {
			System.out.println("O terceiro é o maior");
						
		}else if ( qua > pri && qua > seg && qua > ter && qua > qui   ) {
			System.out.println("O quarto é o maior");
		}else if ( qui> pri && qui > seg && qui > ter && qui > qua    ) {
			System.out.println("O quinto é o maior");
		}
		*/
		
		
		int num;
		int maior = Integer.MIN_VALUE;
		for( int i=0; i<5; i++     ) {
			System.out.println("Digite um número:");
			num = scan.nextInt();
			
			if(num > maior) {
				maior= num;
			
			}
			
			
			
			
						
			
		}
		System.out.println("O maior numero é" + maior);
		
	}

}
