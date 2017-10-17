package br.com.exercicios.vetor;

import java.util.Scanner;

public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);


double[] vetorA = new double[17];


double menor = 0;
double iguais =0;
double maior =0;

for(int i=0; i<vetorA.length; i++   ){
	
	System.out.println("Digite Vetor A: "  + i);
	vetorA [i] = scan.nextInt();
	if ( vetorA[i] <15  ) {
		
		menor++;

}else if( vetorA[i] == 15) {
	iguais++;
} else if (vetorA[i]>15) {
	maior++;
}

}

System.out.println("Números !!!" );
	
	for (int i =0; i<vetorA.length; i++) {
		System.out.print( vetorA[i] + " ");
		

}
	System.out.println();
	System.out.println(" Menores  " + menor);
	System.out.println(" Iguais  " + iguais);
	System.out.println(" Maior  " + maior);
	

	
	
	
	
	
	
	
	
	
	
		
	}
}
