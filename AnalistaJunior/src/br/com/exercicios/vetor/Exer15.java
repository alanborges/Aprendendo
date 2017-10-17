package br.com.exercicios.vetor;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);


		double[] vetorA = new double[5];


		double superior = 0;
		

		for(int i=0; i<vetorA.length; i++   ){
			
			System.out.println("Digite Vetor A: "  + i);
			vetorA [i] = scan.nextInt();
			if ( vetorA[i] >35 ) {
				
				superior++;

			}
		}
		
	
		
		System.out.println("Números !!!" );
			
			for (int i =0; i<vetorA.length; i++) {
			
				

		}
			System.out.println();
			System.out.println(" Superior " + superior);
			
			
			
		
	}
}
