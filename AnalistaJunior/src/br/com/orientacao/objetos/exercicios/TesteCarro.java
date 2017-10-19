package br.com.orientacao.objetos.exercicios;

public class TesteCarro {

	public static void main(String[] args) {

		Carro auto = new Carro();
		auto.marca = "Chevrolet";
		auto.modelo = " Corsa";
		auto.numPassageiros = 5;
		auto.capCombustivel = 50; // capacidade de combustivel
		auto.consumoCombustivel = 10;

		System.out.println(auto.marca);
		System.out.println(auto.modelo);

		auto.exibirAutonomia();

		double autonomia = auto.obterAutonomia();
		System.out.println("A autonomia do carro é: " + autonomia);
		System.out.println("A autonomia do carro é: " + auto.obterAutonomia());

		double qtdCombustivel10 = auto.calcularCombustivel(10);
		double qtdCombustivel15 = auto.calcularCombustivel(15);

		System.out.println("qtdCombustivel10 = " + qtdCombustivel10);
		System.out.println("qtdCombustivel15 = " + qtdCombustivel15);

	}

}
