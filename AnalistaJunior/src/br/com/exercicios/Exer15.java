package br.com.exercicios;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o N-nésimo termo.");
		int n = scan.nextInt();
		
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		//1,1,2,3,5,8  1+1=2, 1+2=3, 2+3=5, 3+5=8
		//primeiro =1;
		//segundo =1;
		//proximo=2;
		
		for(int i =3; i<=n; i++) {
			
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
			
		}
		
		
		

	}

}
