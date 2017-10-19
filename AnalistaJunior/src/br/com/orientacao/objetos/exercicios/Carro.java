package br.com.orientacao.objetos.exercicios;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel; // capacidade de combustivel
	double consumoCombustivel;
	
	// metodo sem retorno  ----> void
	void exibirAutonomia() {
	    System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
	}
	
	// metodo com retorno ----> return capCombustivel * consumoCombustivel;
	double obterAutonomia() {
		
		System.out.println("Método obterAutonomia foi chamado.");
		
		return capCombustivel * consumoCombustivel;
	}
	
	// metodo com retorno e parametro   ---> (double km)
	double calcularCombustivel(double km){
		
		double qtdCombustivel = km/consumoCombustivel;
		
return qtdCombustivel;
	
	
	
	}
}
