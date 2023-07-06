package br.com.bytebank.banco.modelo;

public class CalculadorDeImposto {

	private double totalImposto;

	/**
	 * Calculadora de imposto, atraves de tributavel
	 * 
	 */
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}

	public double getTotalImposto() {
		return totalImposto;
	}

}
