package br.com.exercicios.recursividade;

public class Contador {
	
	private static int cont;
	
	
	
	
	public static void incrementar() {
		cont++;
	}
	
	
	public static void zerar() {
		cont= 0;
	}
	
	public static int obterValor() {
		return cont;
	}
	
	
	

	public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		Contador.cont = cont;
	}
	
	
	
	
	
	
	

}
