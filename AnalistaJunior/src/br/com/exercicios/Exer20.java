package br.com.exercicios;

import java.util.Scanner;

public class Exer20 {

	private static  Scanner scan;
		
	
	public static void main(String[] args) {
		
		scan = new Scanner(System.in);

		double idade=0;
		double media = 0;
		double soma=0;

		
		System.out.println("Informe a quantidade de pessoas");
		double pessoas = scan.nextDouble();
		
		for(int i=0; i<pessoas;i++    ) {
			
			System.out.println("Entre com as idades");
			idade = scan.nextDouble();
			
			soma=soma+idade;
			media=soma/pessoas;
		}
			if( media > 0 && media <=25  ) {
				System.out.println("Jovens");
				
			}else if  (media > 25 && media <=60) {
				
				System.out.println("Adultos");
				
			}else {
				
				System.out.println("Idosos");
			}
		
				
		
		System.out.println("Soma das idade " +soma);
		System.out.println("M�dia das idade " + media);
	}

}
