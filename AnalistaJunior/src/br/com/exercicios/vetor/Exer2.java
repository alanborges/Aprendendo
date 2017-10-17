package br.com.exercicios.vetor;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		
		for(int i=0; i<vetorA.length; i++   ){
			
			
			System.out.println("Digite um valor: "  + i);
			vetorA [i] = scan.nextInt();
			 vetorB [i] = vetorA [i];
			
		}
		
		for (int i =0; i<vetorA.length; i++   ) {
			
			System.out.println(" Números do vetor A " + (vetorA [i] * 2));
		}

for (int i =0; i<vetorB.length; i++   ) {
			
			System.out.println(" Números do vetor B " + vetorB [i]  );
		}
		
		
		

	}

}
