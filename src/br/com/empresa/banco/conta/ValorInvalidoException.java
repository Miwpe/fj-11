package br.com.empresa.banco.conta;

public class ValorInvalidoException extends RuntimeException {

	private double valor;

	public double getValor() {
		return valor;
	}

	public ValorInvalidoException(double valor){
		this.valor = valor;
	}
}
