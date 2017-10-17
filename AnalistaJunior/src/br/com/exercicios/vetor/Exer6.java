package br.com.exercicios.vetor;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exer6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int  nroAleatorios = new Random();
		int[] sorteio = sorteaSena(6);
		int [] aposta = new int[6];
		
		String apostaUsuario = "";
		String sorteioComputador = "";
		
		
		//trecho processa a aposta
		
		
		System.out.println("Fa�a sua aposta: ");
		
		for (int i = 0; i < aposta.length; i++) {
			int nroAposta;
		    boolean repetido = false;
		   
		    do {
		    	
		    	
		    	System.out.print("Informe a dezena "+(i+1)+": ");
		        nroAposta = scan.nextInt();
		       
		        if(nroAposta <=0){
		        	
		        	System.out.println("Insira n�meros entre 1 e 60. Aposta cancelada");
		        	return;
		    	}else if(nroAposta >60) {
		    		
		    		System.out.println("Insira n�meros entre 1 e 60. Aposta cancelada");
		    		return; // para um metodo
		    			        	  
		          }
		        
		       	        
		        
		        repetido = existeNumero(aposta, nroAposta);
		        if(repetido) {
		        	 System.out.println("Ops, n�mero repetido!");
		        }
		        
		} while(repetido); // evita repeti��o de n�mero
		    aposta[i] = nroAposta;
		   	  
		} 
		
// n�meros digitados para aposta
		for(int i= 0; i<aposta.length; i++ ) {
			
			
			apostaUsuario = "Aposta do usu�rio: " + " \n" + aposta[0] + " \n"
                    + aposta[1] + " \n" + aposta[2] + " \n" + aposta[3] + " \n"
                    + aposta[4] + " \n" + aposta[5];
			
		
		
		}
	
		// sorteio random
		
		static int[] sorteaSena() {
			 
	        int[] resultado = new int[aposta.length];
	 
	        for (int i = 0; i < sorteio.length; i++) {
	 
	            int sorteado;
	            boolean repetido = false;
	 
	            do {
	                // n�mero aleat�rio de 1 a 60
	                sorteado = (int) (Math.random() * 60) + 1;
	                repetido = existeNumero(resultado, sorteado);
	            } while (repetido); // evita repeti��o de n�mero
	            resultado[i] = sorteado;
	        }
	        return resultado;
	    }
        
		int nroAcertos = contaAcertos(sorteio, aposta);
		 
        JOptionPane.showMessageDialog(null, apostaUsuario + "\n"
                + sorteioComputador + " \n N�meros de acertos: \n "
                + nroAcertos, "Simulador Da Mega Sena",
                JOptionPane.INFORMATION_MESSAGE);
 
        switch (nroAcertos) {
 
        case 4:
            // System.out.println("Parab�ns. Voc� acertou a quadra!");
            JOptionPane.showMessageDialog(null,
                    "Parab�ns. Voc� acertou a quadra!",
                    "Simulador Da Mega Sena", JOptionPane.INFORMATION_MESSAGE);
            break;
        case 5:
            // System.out.println("Parab�ns. Voc� acertou a quina!");
            JOptionPane.showMessageDialog(null,
                    "Parab�ns. Voc� acertou a quina!",
                    "Simulador Da Mega Sena", JOptionPane.INFORMATION_MESSAGE);
            break;
        case 6:
            // System.out.println("Parab�ns. Voc� � campe�o da MegaSena!");
            JOptionPane.showMessageDialog(null,
                    "Parab�ns. Voc� � campe�o da MegaSena!",
                    "Simulador Da Mega Sena", JOptionPane.INFORMATION_MESSAGE);
            break;
        default:
            // System.out.println("N�o foi dessa vez. Tente novamente!");
            JOptionPane.showMessageDialog(null, "Tente novamente!",
                    "Simulador Da Mega Sena", JOptionPane.INFORMATION_MESSAGE);
            break;
        }
    }// Fim do main
	
	private static int[] sorteaSena(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	//Fun��o compara cada n�mero apostado, com os n�meros sorteados. Por fim
    // retorna a quantidade de acertos.
   static int contaAcertos(int[] sorteio, int[] aposta) {

       int acertos = 0;

       for (int i = 0; i < aposta.length; i++) {

           int nroAposta = aposta[i];

           // compara cada n�mero apostado com os sorteados
           if (existeNumero(sorteio, nroAposta)) {
               acertos++;
           }
       }
       return acertos;
   }
		
 //Fun��o indica se o n existe no array numeros. �til para validar
   // duplicadade de dados.
		
		static boolean existeNumero(int[] numeros, int n) {
			 
	        for (int i = 0; i < numeros.length; i++) {
	            if (numeros[i] == n) {
	                return true;
	            }
	        }
	        return false;
		
		
	}
}



