package br.com.exercicios;



public class Exer4 {

	public static void main(String[] args) {
		
		int popA = 80000;
		int popB = 200000;
		int cont = 0;
		
		// 80000  == 100%
		//   X    ==  3%
		
		while (popA < popB) {
			
			popA += (popA /100) * 3;
			popB += (popB /100) * 1.5;
			cont ++;
			
		}
		System.out.println("População A " +popA );
		System.out.println("População B " +popB);
		System.out.println("Anos necessários " +cont);
	}

}
