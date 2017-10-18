package br.com.orientacao.objetos;

public class TesteLivraria {

	public static void main(String[] args) {

		Livraria livro = new Livraria();

		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane Groner";
		livro.anoLancamento = 2015;
		livro.preco = 63.39;

		System.out.println("Nome do livro = " + livro.nome);

	}

}
