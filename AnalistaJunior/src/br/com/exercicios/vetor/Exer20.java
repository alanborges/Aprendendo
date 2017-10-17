package br.com.exercicios.vetor;

import java.util.Scanner;

public class Exer20 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		double[] conversao = new double[6];
		double nReal = 0;
		
		for(int i=0; i<conversao.length; i++   ){
			
			
			System.out.println("Digite o valor do real: "  + i);
			nReal = scan.nextInt();
			
			 conversao[i] = nReal * 3.18;
			
		}
		
		
		
for (int i =0; i<conversao.length; i++   ) {
	
	System.out.println("Conversão Real em dollar " + conversao[i]);
			
		}


		


		
	}
}
