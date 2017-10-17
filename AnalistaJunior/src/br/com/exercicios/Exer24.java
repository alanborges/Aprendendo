package br.com.exercicios;

import java.util.Scanner;

public class Exer24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
				double valorPago =0;
			
				System.out.println("Loja quase dois!!!");
				
				for(int i= 1; i<=2;i++    ) {
					
				
						System.out.println("Informe o preço do produto"  );
						valorPago = scan.nextDouble();
				
				
				
						for (int j =1; j<=50; j++)	{			
						System.out.println(" Os preços são: " + j + " - "+ " R$ " + (j * valorPago)  );	
				
						}
						
				}
			
	}

}
