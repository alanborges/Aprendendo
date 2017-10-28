package br.com.exercicios.pizzaria;

import java.util.Date;

public class Pedido {
	
	private int id;
	private String usuario;
	private String pizza;
	private int quantidade;
	private Date dataPedido;
	private long valorTotal;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPizza() {
		return pizza;
	}
	public void setPizza(String pizza) {
		this.pizza = pizza;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Date getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	public long getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(long valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	
	

}
