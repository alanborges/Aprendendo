package br.com.orientacao.objetos;

import java.util.Date;

public class TesteBiblioteca {

	public static void main(String[] args) {
			
		
			Biblioteca livro = new Biblioteca();
	        
	        livro.nome = "Mastering ExtJS";
	        livro.autor = "Loiane Groner";
	        livro.anoLancamento = 2015;
	        
	        livro.emprestado = true;
	        livro.dataEntrega = new Date();
	        livro.emprestadoA = "Loiane";
	        
	        System.out.println("Nome do livro = " + livro.nome);

	}

}
