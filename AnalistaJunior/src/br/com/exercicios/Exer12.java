package br.com.exercicios;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero para tabuada:");
		int num =0;
		num = scan.nextInt();
		int mult =0;
		
		System.out.println("A tabuada de:" + num);
		for(int i =0; i<=10; i++   ) {
			
			mult= num*i;
				
				
				System.out.println(num+ "X" +i+ "="+ mult );
				
			
			
			
			
		}
		
		
		
	}

}
