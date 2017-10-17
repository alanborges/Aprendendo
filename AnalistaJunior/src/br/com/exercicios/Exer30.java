package br.com.exercicios;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero para tabuada:");
		int num =0;
		num = scan.nextInt();
		int mult =0;
		int j =0; 
		int fim=0;
		boolean vFim = false;
		
		do {
			
			System.out.println("Informe o valor inicial" );
			j = scan.nextInt();
			
			System.out.println("Informe o valor final" );
			fim = scan.nextInt();
			
			
			
			
		if(fim > j) {
		vFim = true;
		}else {
		 System.out.println(" O valor final tem que ser maior que o inicial.");
			
		}
		
		
		
		
		
	
		
			
		}while(!vFim);
		
		System.out.println("A tabuada é de:" + num);
		for(int i =j; i<=fim; i++   ) {
			
			mult= num*i;
				System.out.println(num+ "X" +i+ "="+ mult );
		}
	}

}
