package br.com.alura.argentum.modelo;

import java.time.LocalDateTime;

public final class Negociacao {
	
	private final double preco;
	private final int qtd;
	private final LocalDateTime date;
	
	public Negociacao(double preco, int qtd, LocalDateTime date) {
		if(date ==null){
			throw new IllegalArgumentException("data não pode ser nula");
		}	
		
		if(preco < 0){
			throw new IllegalArgumentException("preco não pode ser zero");
		}	
		
		if(qtd <= 0){
			throw new IllegalArgumentException("quantidade não pode ser menor ou igual a zero");
		}	
		
		this.preco = preco;
		this.qtd = qtd;
		this.date = date;
	}
	public double getPreco() {
		return preco;
	}
	public int getQtd() {
		return qtd;
	}
	public LocalDateTime getDate() {
		return date;
	}
	public double getVolume(){
		return preco*qtd;
	}

}
