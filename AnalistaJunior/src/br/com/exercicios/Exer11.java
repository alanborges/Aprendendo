package br.com.exercicios;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num=0;
		System.out.println("Digite o primeiro número");
		num = scan.nextInt();
	
		int max =0;
		System.out.println("Digite o segundo número");
		max = scan.nextInt();
		int soma=0;
		for (int i = num ; i<=max; i++ ) {
			System.out.println(i);
			soma +=i;	
		}
		System.out.println("A soma é: " + soma);
	}

}
