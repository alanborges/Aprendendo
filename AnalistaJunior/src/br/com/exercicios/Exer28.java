package br.com.exercicios;

import java.util.Scanner;

public class Exer28 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero ");
		double num = scan.nextDouble();
	    boolean primo =true;
		
		if(num % 2 ==0   ) {
			primo =true;
			
			System.out.println("N�o � primo "   );
			
		} else 	if(primo) {
			System.out.println("� n�mero primo.");
			
		}
		
	
		
		
		
		
	}

}
