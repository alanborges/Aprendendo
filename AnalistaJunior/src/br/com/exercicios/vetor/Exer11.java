package br.com.exercicios.vetor;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		double[] vetorA = new double[5];
		int  imp  = 0;
		int par = 0;
		
		
		
		
		for(int i=0; i<vetorA.length; i++   ){
			
			System.out.println("Digite Vetor A: "  + i);
			vetorA [i] = scan.nextInt();
			if ( vetorA[i] % 2 == 0  ) {
				
				par++;
				
			}
		
			
		}
		
			
		
		System.out.println("Números pares!!!" );
			
			for (int i =0; i<vetorA.length; i++) {
				System.out.print( vetorA[i] + " ");
				
		
		}
			System.out.println();
			System.out.println("Números!!!" + par);
		
	}
}
