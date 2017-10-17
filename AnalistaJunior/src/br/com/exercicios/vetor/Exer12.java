package br.com.exercicios.vetor;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double soma = 0;
		double[] vetorA = new double[5];
		
		
		for(int i=0; i<vetorA.length; i++   ){
			
			System.out.println("Digite Vetor A: "  + i);
			vetorA[i] = scan.nextInt();
			soma += vetorA[i];
			
		}
		
		System.out.println(" Soma vetor A" + soma);
		System.out.println();
		for (int j =0; j<vetorA.length; j++   ) {
			
			System.out.print( vetorA [j] + "" );	
		}

		

		
	}
}
