package br.com.exercicios;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero ");
		double num = scan.nextDouble();
	boolean primo =true;
		for( int i =2; i<num; i++ ) {
		if(num % i ==0   ) {
			
			primo = false;
			System.out.println("N�o � primo: Divisivel por: " + i  );
		}
			
		}
		
		if(primo) {
			System.out.println("� n�mero primo.");
		}
		
	

	}

}
