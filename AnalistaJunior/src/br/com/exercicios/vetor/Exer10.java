package br.com.exercicios.vetor;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int [] vetorB = new int[vetorA.length];
		
		
		for(int i=0; i<vetorA.length; i++   ){
			
			
			System.out.println("Digite Vetor A: "  + i);
			
			vetorA [i] = scan.nextInt();
			vetorB [i] = vetorA[i] % 2;
			
		}
		
		for (int j =0; j<vetorA.length; j++   ) {
			
			System.out.println(" Números do vetor A " + vetorA [j] );
		}

for (int k =0; k<vetorB.length; k++   ) {
		
			
			System.out.println(" Números do vetor B " + vetorB[k] );
		}


	}
}
