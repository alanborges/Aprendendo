package br.com.exercicios.vetor;

import java.util.Scanner;

public class Exer25 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		double[] vetorA = new double[5];
		double[] vetorB = new double[vetorA.length];
		
		
		for(int i=0; i<vetorA.length; i++   ){
			
			
			System.out.println("Digite um n�mero "  + i);
			vetorA [i] = scan.nextInt();
			
			vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0; // Operador tern�rio ? = IF e : = ELSE
			
		
			
		}
		
		for (int i =0; i<vetorA.length; i++   ) {
			
			System.out.println(" N�meros do vetor B " + vetorB [i] );
		}


		
	}
}
