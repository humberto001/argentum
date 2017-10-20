package br.com.alura.argentum.modelo;

import java.time.LocalDateTime;
import java.util.List;

public class CandlestickFactory {

	
	public Candlestick constroiCandleParaData (List<Negociacao> negociacoes, LocalDateTime data){
		
		double abertura = negociacoes.isEmpty() ? 0 : negociacoes.get(0).getPreco();
		double fechamento = negociacoes.isEmpty() ? 0 : negociacoes.get(negociacoes.size()-1).getPreco();
		
		double minimo = negociacoes.isEmpty() ? 0 : negociacoes.get(0).getPreco();
		double maximo = negociacoes.isEmpty() ? 0 : negociacoes.get(0).getPreco();
		
		double volume =0;
		
		for(Negociacao negociacao : negociacoes){
			volume += negociacao.getVolume();
			
			// Se o valor da negociação da iteração atual for maior, atribuímos este valor a variável maximo.
			if (negociacao.getPreco() > maximo) {
                maximo = negociacao.getPreco();
            // A mesma coisa para o mínimo    
            } else if (negociacao.getPreco() < minimo) {
                minimo = negociacao.getPreco();
            }
		}
		
		
		return new Candlestick (abertura, fechamento, minimo, maximo, volume, data);
		
	}
	
}
