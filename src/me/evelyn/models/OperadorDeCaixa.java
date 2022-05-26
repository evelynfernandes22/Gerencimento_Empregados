package me.evelyn.models;

public class OperadorDeCaixa extends FuncionariosCLT {

	
	
	public OperadorDeCaixa() {
		super();
		
	}

	public OperadorDeCaixa(String nome, String documento, Double valorSalario, Endereco endereco) {
		super(nome, documento, valorSalario, endereco);
	}

	@Override
	public String toString() {
		return "OperadorDeCaixa [nome=" + nome + ", documento=" + documento + ", valorSalario=" + valorSalario
				+ ", endereco=" + endereco + "]";
	}

	
}
