package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	
	final String nome;
	final List<Compra> compras = new ArrayList<>();
	
	Cliente (String nome) {
		this.nome = nome;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
		
	}
	
	double obterValorTotalDasCompras () {
		double totalDasCompras = 0;
		
		for (Compra compra : this.compras) {
			totalDasCompras += compra.obterValorTotal(); 
		}
		return totalDasCompras;
	}
	
	public String toString() {
		return nome;
	}
}
