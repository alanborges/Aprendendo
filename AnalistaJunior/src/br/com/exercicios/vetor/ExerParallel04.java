package br.com.exercicios.vetor;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExerParallel04 {

	//   Escolher 6 valores dentre 60 não podem ser iguais e dizer quantos acerto.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Random nAleatorio = new Random();
		int [] dezenas = new int[6];
		int [] aposta = new int[6];
		boolean  igual	= false;
		
		

		
				
		
						
		
			for(int i = 0; i<dezenas.length; i++){
			
				System.out.println("Digite os números para o sorteio da Mega Sena!" );
				dezenas[i] = scan.nextInt();
				
				if (Arrays.equals(aposta, dezenas)) {
						
						System.out.println("Números iguais");
						return;
					}else {
						aposta[i] = dezenas[i];
						System.out.println("Números diferentes " + aposta[i]);
						System.out.println("Números diferentes " + dezenas[i]);
					}
					
					
			}
		
		
		
		
		
		
	}

}

/*for(int f=0; f<60; f++){
System.out.println("Sorteio" +"-" + sorteio[f]); 
}

else   {
				System.out.println("Digite um número entre 1 e 60" + num);
			}	
			
			if((sorteio [i] > 0) && (sorteio [i] <=sorteio.length) ) {
				
				valida = true;
				
			}else {
				break;
			}
			
			
			


*/

