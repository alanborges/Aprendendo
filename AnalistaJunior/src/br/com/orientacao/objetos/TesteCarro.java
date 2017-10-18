package br.com.orientacao.objetos;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro();
		van.marca = "Ford";
		van.modelo = "New Fiesta";
		van.numPassageiros = 5;
		van.capCombustivel = 52;
		van.consumoCombustivel = 1;
		
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		

	}

}
