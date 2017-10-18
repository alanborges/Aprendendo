package br.com.exercicios.vetores.dimensionais;

import java.util.Random;

public class Exercicio01 {

	public static void main(String[] args) {

		Random gerador = new Random();

		int[][] numAleatorio = new int[5][5];

		for (int i = 0; i < numAleatorio.length; i++) {

			for (int j = 0; j < numAleatorio.length; j++) {

				numAleatorio[i][j] = gerador.nextInt(100);

			}

		}

		int maior = 0;
		int linha = 0;
		int coluna = 0;

		for (int i = 1; i < numAleatorio.length; i++) {

			for (int j = 1; j < numAleatorio.length; j++) {
				if (numAleatorio[i][j] > maior) {
					maior = numAleatorio[i][j];
					linha = i;
					coluna = j;
				}

			}

		}

		for (int i = 1; i < numAleatorio.length; i++) {

			for (int j = 1; j < numAleatorio.length; j++) {
				System.out.print(numAleatorio[i] [j] + " ");

			}
			System.out.println();
		}

		System.out.println("Maior Valor = " + maior);
		System.out.println("Linha = " + linha);
		System.out.println("Coluna = " + coluna);

	}

}
