package br.com.exercicios.vetor;

import java.util.Random;
import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		double[] vetorA = new double[5];
		double[] vetorB = new double[vetorA.length];
		
		
		for(int i=0; i<vetorA.length; i++   ){
			
			
			System.out.println("Digite um valor: "  + i);
			vetorA [i] = scan.nextInt();
			 vetorB [i] = Math.sqrt(vetorA[i]);
			
		}
		
		for (int j =0; j<vetorA.length; j++   ) {
			
			System.out.println(" Números do vetor A " + vetorA [j] );
		}

for (int k =0; k<vetorB.length; k++   ) {
		
			
			System.out.println(" Números do vetor B " + vetorB[k] );
		}
		
		
	}
}