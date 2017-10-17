package br.com.exercicios;

import java.util.Scanner;

public class Exer26 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int num = scan.nextInt();
		int fatorial =1;
		//5!= 5x4x3x2x1=120
		
		System.out.print("Fatorial de " );
		System.out.print( num + " ! = ");
		
		for(int i=num; i > 1  ;i--   ) {
			
			fatorial*=i;
			
			System.out.print(i + " . " );	
			
		}
		
		System.out.print(" 1 = " + fatorial  );	
		
	}

}
