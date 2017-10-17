package br.com.exercicios.vetor;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		double[] vetorA = new double[5];
		double[] vetorB = new double[vetorA.length];
		double[] vetorC = new double[5];
		
		for(int i=0; i<vetorA.length; i++   ){
			
			
			System.out.println("Digite Vetor A: "  + i);
			vetorA [i] = scan.nextInt();
			
			System.out.println("Digite Vetor B: "  + i);
			vetorB [i] = scan.nextInt();
			
			
			 vetorC [i] = vetorA[i] + vetorB[i];
			
		}
		
		for (int j =0; j<vetorA.length; j++   ) {
			
			System.out.println(" Números do vetor A " + vetorA [j] );
		}

for (int k =0; k<vetorB.length; k++   ) {
		
			
			System.out.println(" Números do vetor B " + vetorB[k] );
		}

for (int l =0; l<vetorB.length; l++   ) {
	
	
	System.out.println(" Números do vetor C " + vetorC[l] );
}


		
	}
}
