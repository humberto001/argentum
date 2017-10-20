package br.com.alura.argentum.modelo;

import java.time.LocalDateTime;

import org.junit.Test;

import junit.framework.Assert;

public class CandlestickTest {

		 
	@Test(expected= IllegalArgumentException.class)
	public void precoMaximoNaoPodeSerMenorQueMinimo() {
		LocalDateTime hoje = LocalDateTime.now();
		
		CandleBuilder builder = new CandleBuilder();
		
		Candlestick candle = new CandleBuilder().comAbertura(10)
								.comFechamento(20).comMinimo(8).comMaximo(5)
								.comVolume(100).comData(hoje)
								.geraCandle();
	}
	
	@Test
	public void quandoAberturaIgualFechamentoEhAlta(){
		LocalDateTime hoje = LocalDateTime.now();
		
		CandleBuilder builder = new CandleBuilder();
		Candlestick candle = new CandleBuilder().comAbertura(20)
							.comFechamento(20).comMinimo(4).comMaximo(5)
							.comVolume(100).comData(hoje)
							.geraCandle();
				
		Assert.assertTrue(candle.isAlta());
	}
	

}
