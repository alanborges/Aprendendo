package br.com.exercicios;

import java.util.Scanner;

public class Exer7 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
	
		/*
		System.out.println("Digite o primeiro n�mero:");
		int pri = scan.nextInt();
		System.out.println("Digite o segundo n�mero:");
		int seg = scan.nextInt();
		System.out.println("Digite o terceiro n�mero:");
		int ter = scan.nextInt();
		System.out.println("Digite o quarto n�mero:");
		int qua = scan.nextInt();
		System.out.println("Digite o quinto n�mero:");
		int qui = scan.nextInt();
		
		if(pri > seg && pri > ter && pri > qua && pri > qui   ) {
			System.out.println("O primeiro � o maior");
		}else if ( seg > pri && seg > ter  && seg > qua && seg > qui    ) {
			System.out.println("O segundo � o maior");
		}else if (ter > pri && ter > seg && ter > qua && ter > qui  ) {
			System.out.println("O terceiro � o maior");
						
		}else if ( qua > pri && qua > seg && qua > ter && qua > qui   ) {
			System.out.println("O quarto � o maior");
		}else if ( qui> pri && qui > seg && qui > ter && qui > qua    ) {
			System.out.println("O quinto � o maior");
		}
		*/
		
		
		int num;
		int maior = Integer.MIN_VALUE;
		for( int i=0; i<5; i++     ) {
			System.out.println("Digite um n�mero:");
			num = scan.nextInt();
			
			if(num > maior) {
				maior= num;
			
			}
			
			
			
			
						
			
		}
		System.out.println("O maior numero �" + maior);
		
	}

}
