package br.com.exercicios;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int qtdTemperaturas;
		int  num =0;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		System.out.println("Digite a quantidade de temperaturas:");
		qtdTemperaturas = scan.nextInt();
		double media =0;
		double soma =0;
		
		for( int i=1; i<qtdTemperaturas; i++     ) {
			
			
			System.out.println("Digite uma temperatura:");
			num = scan.nextInt();
			
			if(num > maior) {
				maior= num;
			
			}else if (num < menor) {
				menor = num;
				
			}
			
			
			soma+=num;
			media=soma/qtdTemperaturas;
						
			
		}
		System.out.println("A menor temperatura é: " + menor);
		System.out.println("A maior temperatura é: " + maior);
		System.out.println("A média de temperaturas é: " + media);
		
	}

}
