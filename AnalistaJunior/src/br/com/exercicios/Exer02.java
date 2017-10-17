package br.com.exercicios;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean senhaInvalida = false;
		while(! senhaInvalida) {
			
			System.out.println("Digite seu nome!");
			String nome = scan.next();
			System.out.println("Digite sua senha!");
			String senha = scan.next();
			
			if(nome.equalsIgnoreCase(senha)) {
				senhaInvalida =false;
				System.out.println("Senha Inválida");
				System.out.println("Digite seu nome e sua senha");
				
			}else {
				senhaInvalida =true;
				System.out.println("Obrigado senha válida");
				
			}
			
			
			
		}
		
		
		

	}

}
