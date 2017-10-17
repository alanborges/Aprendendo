package br.com.exercicios;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Digite o fatorial");
	int num = scan.nextInt();
	int fatorial =1;
	//5!= 5x4x3x2x1=120
	
	for(int i=num; i > 0  ;i--   ) {
		
		fatorial*=i;
		
		System.out.println(i);
		
	}
	
	System.out.println(fatorial);
	
	
	

	}

}
