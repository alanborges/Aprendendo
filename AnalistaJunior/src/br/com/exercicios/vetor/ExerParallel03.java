package br.com.exercicios.vetor;


import java.util.Scanner;

public class ExerParallel03 {

	//   Escolher 6 valores dentre 60 não podem ser iguais e dizer quantos acerto.
	private static Scanner scan;
	
	public static void main(String[] args) {
		
		
		scan = new Scanner(System.in);
		
		int [] numCartao = new int [60];
		int [] aposta = new int [6];
	
		boolean valido = false;	
			    
		          
		       
		        
		        while (!valido){
		            
		        	for (int i = 0; i<aposta.length; i++) {
		        		System.out.println(" Digite o primeiro numero");
		                aposta[i] = scan.nextInt();
		        		
		            if ( aposta[i] > 0){ // números válidos
		                
		               valido=true;
		            } else if(aposta[i] <= 60 ){
		                
		              valido = true;
		               
		            }for(int k = 0; k < aposta.length; k++){
	            		for(int j = 0; j < numCartao.length; j++){
	            			if(aposta[k] == numCartao[j]){
	            				
	            				System.out.println("Jogo encerrado:");
	            				break;
	            			}else {
	            				System.out.println("Número validado!");
	            			}
	            		}
	            	}
		            
		            
		        	}
		        	
		        }
		        
		    	
	     
	                
		        

	}

}
	



