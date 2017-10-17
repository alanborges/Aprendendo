package br.com.exercicios.vetor;

import java.util.Scanner;

public class Exer30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double[] vetorA = new 	double[5];
		double[] vetorImpar = new 	double[vetorA.length];
		double[] vetorPar = new 	double[vetorA.length];
		
		int posB=0;
		int posC=0;
		
		for(int i=0; i<vetorA.length; i++   ){
			
			
			System.out.println("Digite Vetor A: "  + i);
			vetorA [i] = scan.nextInt();
	
			
			if(vetorA[i] % 2 ==0) {
				vetorPar[posB]=vetorA[i];
				posB++;
			}else {
		vetorImpar[posC]=vetorA[i];
		posC++;
		}
		}
		
		
		for (int i =0; i<vetorA.length; i++   ) {
			
			System.out.print(" Números do vetor A " +vetorA[i] );
			System.out.println();
			}
for (int i =0; i<posB; i++   ) {
	System.out.println();
		System.out.print(" Números do vetor B " +vetorPar[i] + " " );
		
		}

for (int i =0; i<posC; i++   ) {
	
	System.out.println();
	System.out.print(" Números do vetor C " +vetorImpar[i] + " " );
	}
}


		
	}

