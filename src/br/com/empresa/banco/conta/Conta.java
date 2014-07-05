package br.com.empresa.banco.conta;
public abstract class Conta{

	protected double saldo;

	public double getSaldo(){
		return this.saldo;	
	}

	public void deposita(double valor){
		if(valor < 0){
			throw new ValorInvalidoException(valor);
		}
		this.saldo += valor;
	}
	
	public void saca(double valor){
		if(this.saldo >= valor){
			this.saldo -= valor;
		}		
	}
	
	public abstract void atualiza(double taxa);

	public void setSaldo(double valor){
		this.saldo += valor;
	}
}
