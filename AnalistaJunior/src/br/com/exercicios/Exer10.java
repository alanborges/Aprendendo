package br.com.exercicios;

import java.util.Scanner;

public class Exer10 {

	private static Scanner scan;

	public static void main(String[] args) {

		scan = new Scanner(System.in);
		int num=0;
		System.out.println("Digite o primeiro n�mero");
		num = scan.nextInt();
	
		int max =0;
		System.out.println("Digite o segundo n�mero");
		max = scan.nextInt();
	
		for (int i = num ; i<=max; i++ ) {
			System.out.println(i);
		
		}


	}

}
