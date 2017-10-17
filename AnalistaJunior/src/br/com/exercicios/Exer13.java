package br.com.exercicios;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a base:");
		int base =0;
		base = scan.nextInt();
		System.out.println("Digite o expoente:");
		int exp =0;
		exp = scan.nextInt();
		
		int result= base;
	
		for(int i =1; i<exp; i++   ) {
				
			result*= base;
							
			
			
		}
		System.out.println("O quadrado é"+ " - " + result);

	}

}
