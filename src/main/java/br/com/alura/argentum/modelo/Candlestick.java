package br.com.alura.argentum.modelo;

import java.time.LocalDateTime;

public final class Candlestick {
	
	private final double fechamento;
	private final double minimo;
	private final double maximo;
	private final LocalDateTime data;
	private final double abertura;
	private final double volume;
	
	
	
	public Candlestick(double abertura, double fechamento, double minimo, double maximo, double volume, LocalDateTime data) {
		if(minimo > maximo){
            throw new IllegalArgumentException("O minimo não pode ser maior que o maximo");}
		
		this.fechamento = fechamento;
		this.minimo = minimo;
		this.maximo = maximo;
		this.data = data;
		this.abertura = abertura;
		this.volume = volume;
	}
	public double getAbertura() {
		return abertura;
	}
	public double getFechamento() {
		return fechamento;
	}
	public double getMinimo() {
		return minimo;
	}
	public double getMaximo() {
		return maximo;
	}
	public LocalDateTime getData() {
		return data;
	}
	
	public boolean isAlta(){
		return this.abertura <= this.fechamento; 
	}
	
	public boolean isBaixa(){
		return this.abertura >this.fechamento;
	}
	
	public double getVolume(){
		return this.volume;
	}

}
