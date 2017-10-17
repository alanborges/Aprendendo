package br.com.exercicios.vetor;

import java.util.Scanner;

public class Exer29 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] vetorA = new double[5];
		double[] vetorB = new double[vetorA.length];
		double[] vetorC = new double[10];
		
		
		for(int i=0; i<vetorA.length; i++   ){
			
			
			System.out.println("Digite Vetor A: "  + i);
			vetorA [i] = scan.nextInt();
			System.out.println("Digite Vetor B: "  + i);
			vetorB [i] = scan.nextInt();
	
			
		
				vetorC[i]=vetorA[i];
				
		
				vetorC[i +5]=vetorB[i];
		
	
		
		}

for (int i =0; i<10; i++   ) {
	
		System.out.println(" Números do vetor C " + vetorC[i] );
}


		
		
	}
}
