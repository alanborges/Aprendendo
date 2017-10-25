package br.com.pratica;



public class TesteLampada {
	
	

	public static void main(String[] args) {
		
	
Lampada lampada = new Lampada();

lampada.ligar();
lampada.desligar();
lampada.setCor("Azul");
lampada.mostrarEstado();

lampada.mudarEstado( );

System.out.println(lampada.getCor());
		
		
	}}
