package br.com.exercicios.tem.um;

public class FibonacciComVetor {
	
	
	private final static int TAM_MEMORIA = 50;
		private static long[] memoria = new long[TAM_MEMORIA];
	
		public static long fibonacci(int num){
	
			if (num < 2){
				return memoria[num];
			}
			
			//verifica se o n�mero j� foi calculado e salvo na mem�ria
			//caso contr�rio, faz o c�lcula e salva
			long fib = memoria[num];
			if (fib  == 0){
				fib = fibonacci(num-1) + fibonacci(num-2);
				memoria[num] = fib;
			}
	
			return memoria[num];
	}
	
		public static void main(String[] args) {
	
			memoria[0]= 0;
			memoria[1]= 1;
			
			for (int i=1; i<TAM_MEMORIA; i++){
				System.out.println("Fibonacci de " + i + ": " + fibonacci(i));
			}
		}

}
