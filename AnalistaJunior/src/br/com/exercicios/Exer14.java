package br.com.exercicios;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		
		int resultPar=0;
		int resultImp=0;
		int num=0;
		for(int i =0; i<10; i++   ) {
				
			System.out.println("Digite um número");
			num = scan.nextInt();
							
			if(num % 2 ==0) {
				resultPar++;
				
			}else {
				resultImp++;
				
			}
			
		}
	
		System.out.println(" Quantidade pares:  " +resultPar);
		System.out.println(" Quantidade impar: " +resultImp);
	}

}
