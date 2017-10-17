package br.com.exercicios.vetor;

import java.util.Random;
import java.util.Scanner;

public class ExerParallel03 {

	//   Escolher 6 valores dentre 60 não podem ser iguais e dizer quantos acerto.
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] numCartao = new int [60];
		int [] aposta = new int [6];
		
		
	
		
			boolean repetido = false;
			boolean valido = false;	
			int count =0;	
							
					
					
					
					
					
					
					
					do{
						System.out.println("Digite sua aposta");
						aposta[count] = scan.nextInt();
						
						
						if (aposta[count] == aposta[0] && aposta[count] == aposta[1] && aposta[count] == aposta[2]
								&& aposta[count] == aposta[3] && aposta[count] == aposta[4] && aposta[count] == aposta[5] 
										&& aposta[count] == aposta[6] 	) {
							valido =true;
							System.out.println(" while" +count  );
							}else  {
								
								
							}
						
						
						int cont =0;
						while(cont < aposta.length) {
							if((aposta[cont] >0) && (aposta[cont] <= 60)) {
								
								repetido =true;
								
										} else {
											
											
										}
							cont++;		
						}
				
						count++;
					}while( count <aposta.length);
					
	
		
			
			

		
		
		
		

	}

}
	



