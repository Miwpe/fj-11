package br.com.empresa.banco;

import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;
import br.com.empresa.banco.conta.ValorInvalidoException;

/**
 * 
 * @author oo4407
 *
 */


public class TestaContas {
	public static void main(String[] args) {

		double selic = 3.0;
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		cc.deposita(-1000.0);
		
		try {
			cp.deposita(-1000.0);
		} catch (ValorInvalidoException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getValor());
		}
		
		//Tributavel t = cc;
		//usei o cc porque o tributo esta implementado em cc
		/*System.out.println("Valor do Tributo e de: " + cc.calculaTributos());

		AtualizadorDeContas atualizaContas = new AtualizadorDeContas(selic);
		atualizaContas.roda(cc);
		atualizaContas.roda(cp);

		System.out.println("Saldo Total = " + atualizaContas.getSaldoTotal());
		
		GerenciadorDeImpostoDeRenda g = new GerenciadorDeImpostoDeRenda();
		g.adiciona(cc);
		
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		g.adiciona(seguroDeVida);
		
		System.out.println("Total em Tributos: " + g.getTotal());
		
		System.out.printf("O saldo e: %.2f", cc.getSaldo());*/

	}

}
