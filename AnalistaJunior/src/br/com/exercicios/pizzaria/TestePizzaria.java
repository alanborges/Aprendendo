package br.com.exercicios.pizzaria;

import java.util.ArrayList;

import java.util.Scanner;

public class TestePizzaria {

	private static Scanner scan;
	
	public static void main(String[] args) {
		
	scan = new Scanner(System.in);
	
	
	ArrayList<Usuario> listarUsuario = new ArrayList<Usuario>();
	Usuario u = new Usuario();
	
	ArrayList<Pizza> listarPizza = new ArrayList<Pizza>();
	
	Pizza pizza = new Pizza();
	
	ArrayList<Pedido> listarPedido = new ArrayList<Pedido>();
	Pedido pedido = new Pedido();
	
	
	

	boolean sair = false;
	while(! sair ) {
		
		
		System.out.println("Digite uma opção do menu!");
		System.out.println("Cadastrar usuário = 1 ");	
		System.out.println("Cadastrar pizza = 2 ");
		System.out.println("Listar Usuário = 3 ");
		System.out.println("Efetuar pedido = 4 ");
		System.out.println("sair = 5 ");
		
		
		
     String numero = scan.next();
		
		switch(numero){
		case  "1"  :
			
		System.out.println("Entre com os dados para cadastro do usuário!");
		System.out.println("Digite seu nome!");
		String nome = scan.next();
		u.setNome(nome);
	
		
		System.out.println("Digite sua idade!");
		int idade = scan.nextInt();
		u.setIdade(idade);
		
		System.out.println("Digite seu telefone!");
		String telefone = scan.next();
		u.setTelefone(telefone);
		
		
		listarUsuario.add(u);
		u = new Usuario();
		
		break;
		
		case "2" :
					
		System.out.println("Entre com o nome da pizza!");
		
		String nomepizza = scan.next();
		pizza.setNomePizza(nomepizza);
		
		System.out.println("Entre com o valor da pizza");
		long valor = scan.nextLong();
		pizza.setValor(valor);
		
		
		
		listarPizza.add(pizza);
		
		
		pizza =new Pizza();
		
		
		break;
		
		case "3" :
			
		System.out.println("Usuários cadastrados!");
		
		for(Usuario us : listarUsuario ) {
			System.out.println(us.getId()+ " " + us.getNome() + " "+ us.getIdade() + " " + us.getTelefone());
			
		}
		
		
		
		break;
		
		case  "4"  :
		
		System.out.println("Fazer pedido!");
		System.out.println("Entre com sue ID");
		int idUsuario = scan.nextInt();
		pedido.setId(idUsuario);
		
		System.out.println("Entre com o nome da pizza!");
		String pi = scan.next();
		pedido.setPizza(pi);
		
		
		System.out.println("Digite a quantidade de pizza!");
		int quantidade = scan.nextInt(); 
		pedido.setQuantidade(quantidade);
		
		
		
		
		
		break;
		
		case  "5"  :
		System.out.println("Saindo!");
		sair= true;
		
		break;
	
		default:
		
		break;
		}

		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
