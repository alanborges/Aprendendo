package br.com.orientacao.objetos;

public class TesteContato {

	public static void main(String[] args) {
		
		Contato contato1 = new Contato();
		contato1.nome = "Jo�o";
		contato1.endereco = "Av Paulista, 1000";
		contato1.email = "joao@email.com";

		contato1.telefones = new String[5];
		contato1.telefones[0] = "99999-9999";
		contato1.telefones[1] = "99999-9998";
		contato1.telefones[2] = "99999-9997";

	}

}
