package br.com.exercicios.vetor;

import java.util.Scanner;

public class Exer32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
        int[] tabuada = new int[5];
        
        
        for (int i=0; i<tabuada.length; i++){
            
            System.out.println("Entre com o valor da posição A - " + i);
            tabuada[i] = scan.nextInt();
        }
        
        for (int i=0; i<tabuada.length; i++){
            
            System.out.println("Tabuada de " + tabuada[i]);
            
            for (int j=1; j<=10; j++){
                
                System.out.println(j + " * " + tabuada[i] + " = " + (tabuada[i]*j));
            }
            
            System.out.println();
 }
	}
}
