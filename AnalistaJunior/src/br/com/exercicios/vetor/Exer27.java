package br.com.exercicios.vetor;

import java.util.Scanner;

public class Exer27 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		double[] vetorA = new double[5];
		char[] vetorB = new char[vetorA.length];
		
		
		for(int i=0; i<vetorA.length; i++   ){
			
			
			System.out.println("Digite Vetor A: "  + i);
			vetorA [i] = scan.nextInt();
	
			
			if(vetorA[i] >  7) {
				vetorB[i]='a';
				
			}else if(vetorA[i] ==7) {
			vetorB[i] = 'b';
		}else if(vetorA[i] > 7 && vetorA[i] <10) {
			vetorB[i] = 'c';
		}else if(vetorA[i] < 7) {
			vetorB[i] = 'd';
		}
		
		}

for (int i =0; i<vetorA.length; i++   ) {
	
		System.out.println(" Números do vetor B " + vetorB[i] );
}


		
		
	}
}
