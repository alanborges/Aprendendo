package br.com.exercicios.vetor;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExerParallel04 {

	//   Escolher 6 valores dentre 60 n�o podem ser iguais e dizer quantos acerto.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Random nAleatorio = new Random();
		int [] dezenas = new int[6];
		int [] aposta = new int[6];
		boolean  igual	= false;
		
		

		
				
		
						
		
			for(int i = 0; i<dezenas.length; i++){
			
				System.out.println("Digite os n�meros para o sorteio da Mega Sena!" );
				dezenas[i] = scan.nextInt();
				
				if (Arrays.equals(aposta, dezenas)) {
						
						System.out.println("N�meros iguais");
						return;
					}else {
						aposta[i] = dezenas[i];
						System.out.println("N�meros diferentes " + aposta[i]);
						System.out.println("N�meros diferentes " + dezenas[i]);
					}
					
					
			}
		
		
		
		
		
		
	}

}

/*for(int f=0; f<60; f++){
System.out.println("Sorteio" +"-" + sorteio[f]); 
}

else   {
				System.out.println("Digite um n�mero entre 1 e 60" + num);
			}	
			
			if((sorteio [i] > 0) && (sorteio [i] <=sorteio.length) ) {
				
				valida = true;
				
			}else {
				break;
			}
			
			
			


*/

