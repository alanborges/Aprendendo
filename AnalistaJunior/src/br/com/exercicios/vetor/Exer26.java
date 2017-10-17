package br.com.exercicios.vetor;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] vetorA = new double[5];
		double[] vetorB = new double[vetorA.length];
		double[] vetorC = new double[vetorA.length];
		
		for(int i=0; i<vetorA.length; i++   ){
			
			
			System.out.println("Digite Vetor A: "  + i);
			vetorA [i] = scan.nextInt();
			
			System.out.println("Digite Vetor B: "  + i);
			vetorB [i] = scan.nextInt();
			
			if(vetorA[i] > vetorB[i] ) {
				vetorC[i]=1;
				
			}else if(vetorA[i] == vetorB[i]) {
			vetorC[i] = 0;
		}else {
			vetorC[i] =-1;
		}
		
		}

for (int l =0; l<vetorB.length; l++   ) {
	
	
	System.out.println(" Números do vetor C " + vetorC[l] );
}


		
	}
}
