package br.com.exercicios;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		double popA;
		double popB;
		double txA;
		double txB;
	
		boolean valida = false;
		
		
		do {
			
			System.out.println("Informe a população A");
			popA = scan.nextDouble();
			
			if(popA > 0) {
				valida = true;
				
				
			}else {
				System.out.println("A população tem que ser maior que zero.");
				
			}
			
		} while (! valida);
		
		
		valida = false;		
do {
			
						
			System.out.println("Informe a população B");
			popB = scan.nextDouble();
		
			if(popB > 0) {
				valida = true;
				
				} else {
					System.out.println("A população tem que ser maior que zero.");
					
				}
							
		} while (! valida);


do {
	
	
	System.out.println("Informe a taxa populacional de A");
	txA = scan.nextDouble();

	if(txA > 0) {
		valida = true;
		
		} else {
			System.out.println("A taxa da população tem que ser maior que zero.");
			
		}
					
} while (! valida);
		
do {
	
	
	System.out.println("Informe a taxa populacional de B");
	txB = scan.nextDouble();

	if(txB > 0) {
		valida = true;
		
		} else {
			System.out.println("A taxa da população tem que ser maior que zero.");
			
		}
					
} while (! valida);	

		
int cont = 0;

while (popA < popB) {
	
	popA += (popA /100) * 3;
	popB += (popB /100) * 1.5;
	cont ++;
	
}
System.out.println("População A " +popA );
System.out.println("População B " +popB);
System.out.println("Anos necessários " +cont);

	}

}














