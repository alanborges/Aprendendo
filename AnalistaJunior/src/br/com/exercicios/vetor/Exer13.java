package br.com.exercicios.vetor;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			double soma =0;
		
		double[] vetorA = new double[5];
		
		
		for(int i=0; i<vetorA.length; i++   ){
			
			
			System.out.println("Digite Vetor A: "  + i);
			vetorA [i] = scan.nextInt();
			
			if( vetorA[i] % 5==0) {
				
				soma += vetorA[i];
			}
			
			
			
		}
		
		
		System.out.println(" Soma multiplos de cinco " +soma);

		
	}
}
