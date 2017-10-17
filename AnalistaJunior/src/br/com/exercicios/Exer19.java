package br.com.exercicios;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a quantidade de notas");
		double notas = scan.nextDouble();

		double nota;
		double media = 0;
		double soma=0;
		
		for(int i=0; i<notas;i++    ) {
			
			System.out.println("Entre com a nota");
			nota = scan.nextDouble();
			
			soma+=nota;
			media=soma/notas;
		
					
			
			
			
		}
		
		System.out.println("A soma das notas é: " + soma);
		System.out.println("A média das notas são: " + media);
	}

}
