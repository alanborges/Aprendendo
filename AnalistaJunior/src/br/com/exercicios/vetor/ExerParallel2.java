package br.com.exercicios.vetor;

import java.util.Random;
import java.util.Scanner;

public class ExerParallel2 {

	//   Escolher 6 valores dentre 60 não podem ser iguais e dizer quantos acerto.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Random nAleatorio = new Random();
		int [] sorteio = new int[60];
		
		boolean  valida	= false;
		int num =0;
		

		
				
		do {
						
		
			for(int i = 0; i<sorteio.length; i++){
			
				System.out.println("Digite os números para o sorteio da Mega Sena!" );
				sorteio[i] = scan.nextInt();
				
				if((sorteio [i] > 0) && (sorteio [i] <=sorteio.length) ) {
				
				valida = true;
				
			}else {
				break;
			}
			
		}
		
		
		
		
		} while (! valida);
		
		
		
		
	}

}

/*for(int f=0; f<60; f++){
System.out.println("Sorteio" +"-" + sorteio[f]); 
}

else   {
				System.out.println("Digite um número entre 1 e 60" + num);
			}	


*/

