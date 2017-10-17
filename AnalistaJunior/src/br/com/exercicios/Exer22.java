package br.com.exercicios;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double valorPago =0;
		double media = 0;
		double totalGasto=0;
		double cds=0;
			
		System.out.println("Informe a quantidade de Cds");
			cds = scan.nextDouble();
							
		for(int i=0; i<cds;i++    ) {
			
				
				System.out.println("Informe o valor pago "  );
				valorPago = scan.nextDouble();
								
					
		
	
			totalGasto=totalGasto+valorPago;
	
		}
		
		media=totalGasto/cds;
		System.out.println("Soma dos alunos " + totalGasto);
		System.out.println("Média de gastos por Cds é: " + media);
	}

}
