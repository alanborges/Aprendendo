package br.com.exercicios.vetores.dimensionais;

//import java.util.Random;
import java.util.Scanner;



public class Exercicio03 {

	private static Scanner scan;
	
	public static void main(String[] args) {

		scan = new Scanner(System.in);
		
		//Random gerador = new Random();
			

		int[][] parImpar = new int[4][4];

		for (int i = 1; i < parImpar.length; i++) {

			for (int j = 1; j < parImpar.length; j++) {
				
				System.out.println("Entre com os números da matriz! " + parImpar[i] [j] );
				parImpar[i] [j] = scan.nextInt() ;

				//numAleatorio[i][j] = gerador.nextInt(100);

			}

		}

		int contPar = 0;
		int contImpar = 0;
		

		for (int i = 1; i < parImpar.length; i++) {

			for (int j = 1; j < parImpar.length; j++) {
				if (parImpar[i][j] % 2 == 0) {
					contPar++;
				}else {
					contImpar++;
				}

			}

		}

		for (int i = 1; i < parImpar.length; i++) {

			for (int j = 1; j < parImpar.length; j++) {
				System.out.print(parImpar[i] [j] + " ");

			}
			System.out.println();
		}

		System.out.println(" Quantidade par = " + contPar);
		System.out.println(" Quantidade impar = " + contImpar);
		

	}

}
