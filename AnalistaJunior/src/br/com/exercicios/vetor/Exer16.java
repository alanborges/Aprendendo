package br.com.exercicios.vetor;

import java.util.Scanner;

public class Exer16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);


		int[] idades = new int[5];


		

		for(int i=0; i<idades.length; i++   ){
			
			System.out.println("Digite uma idade: "  + i);
			idades [i] = scan.nextInt();
			
		}
		
		int maiorIdade = idades[0];
		int menorIdade = idades[0];
		int indexMaior = 0;
		int indexMenor = 0;
		
		
			for(int i = 1; i<idades.length;i++) {
				
				if ( idades[i] > maiorIdade ) {
					maiorIdade = idades[i];
					indexMaior = i;
				
			}  else if ( idades[i] < menorIdade) {
				menorIdade = idades[i];
				indexMenor = i;
					

			}
		}
		
			for(int i = 0; i<idades.length; i++) {
				 System.out.print(idades[i] + " ");
				
			
			}
			System.out.println();

			System.out.println(" Maior Idade " + maiorIdade + " Maior Index " + indexMaior);
			System.out.println();
			System.out.println(" Menor Idade "  + menorIdade + " Menor Index " + indexMenor);
	}
}
